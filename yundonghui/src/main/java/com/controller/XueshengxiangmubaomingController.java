
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 学生项目报名
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/xueshengxiangmubaoming")
public class XueshengxiangmubaomingController {
    private static final Logger logger = LoggerFactory.getLogger(XueshengxiangmubaomingController.class);

    @Autowired
    private XueshengxiangmubaomingService xueshengxiangmubaomingService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
    @Autowired
    private XueshengService xueshengService;
    @Autowired
    private XueshengxiangmuService xueshengxiangmuService;

    @Autowired
    private LaoshiService laoshiService;
    @Autowired
    private CaipanService caipanService;

    @Autowired
    private YuanxiService yuanxiService;




    /**
     * 后端列表
     */
    @RequestMapping("/dafen")
    public R dafen(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("dafen方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if("裁判".equals(role)){
            Double jifen = Double.valueOf(String.valueOf(params.get("jifen")));
            Double fenzhi = Double.valueOf(String.valueOf(params.get("fenzhi")));
            Integer id = Integer.valueOf(String.valueOf(params.get("id")));
            XueshengxiangmubaomingEntity xueshengxiangmubaoming = new XueshengxiangmubaomingEntity();
            xueshengxiangmubaoming.setId(id);
            xueshengxiangmubaoming.setXueshengxiangmubaomingDefen(fenzhi);
            xueshengxiangmubaoming.setXueshengxiangmubaomingJifen(jifen);
            xueshengxiangmubaomingService.updateById(xueshengxiangmubaoming);

            XueshengxiangmubaomingEntity xueshengxiangmubaomingEntity = xueshengxiangmubaomingService.selectById(id);
            if(xueshengxiangmubaomingEntity != null){
                XueshengEntity xueshengEntity = xueshengService.selectById(xueshengxiangmubaomingEntity.getXueshengId());
                if(xueshengEntity != null){
                    YuanxiEntity yuanxiEntity = yuanxiService.selectById(xueshengEntity.getYuanxiId());
                    if(yuanxiEntity != null){
                        yuanxiEntity.setYuanxiDefen(yuanxiEntity.getYuanxiDefen()+jifen);
                        yuanxiService.updateById(yuanxiEntity);
                    }
                }
            }


            return R.ok();
        }else{
            return R.error(511,"权限为空");
        }
    }

    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("学生".equals(role))
            params.put("xueshengId",request.getSession().getAttribute("userId"));
        else if("老师".equals(role))
            params.put("laoshiId",request.getSession().getAttribute("userId"));
        else if("裁判".equals(role))
            params.put("caipanId",request.getSession().getAttribute("userId"));
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = xueshengxiangmubaomingService.queryPage(params);

        //字典表数据转换
        List<XueshengxiangmubaomingView> list =(List<XueshengxiangmubaomingView>)page.getList();
        for(XueshengxiangmubaomingView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        XueshengxiangmubaomingEntity xueshengxiangmubaoming = xueshengxiangmubaomingService.selectById(id);
        if(xueshengxiangmubaoming !=null){
            //entity转view
            XueshengxiangmubaomingView view = new XueshengxiangmubaomingView();
            BeanUtils.copyProperties( xueshengxiangmubaoming , view );//把实体数据重构到view中

                //级联表
                XueshengEntity xuesheng = xueshengService.selectById(xueshengxiangmubaoming.getXueshengId());
                if(xuesheng != null){
                    BeanUtils.copyProperties( xuesheng , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setXueshengId(xuesheng.getId());
                }
                //级联表
                XueshengxiangmuEntity xueshengxiangmu = xueshengxiangmuService.selectById(xueshengxiangmubaoming.getXueshengxiangmuId());
                if(xueshengxiangmu != null){
                    BeanUtils.copyProperties( xueshengxiangmu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setXueshengxiangmuId(xueshengxiangmu.getId());
                }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody XueshengxiangmubaomingEntity xueshengxiangmubaoming, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,xueshengxiangmubaoming:{}",this.getClass().getName(),xueshengxiangmubaoming.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("学生".equals(role))
            xueshengxiangmubaoming.setXueshengId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<XueshengxiangmubaomingEntity> queryWrapper = new EntityWrapper<XueshengxiangmubaomingEntity>()
            .eq("xuesheng_id", xueshengxiangmubaoming.getXueshengId())
            .eq("xueshengxiangmu_id", xueshengxiangmubaoming.getXueshengxiangmuId())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        XueshengxiangmubaomingEntity xueshengxiangmubaomingEntity = xueshengxiangmubaomingService.selectOne(queryWrapper);
        if(xueshengxiangmubaomingEntity==null){
            xueshengxiangmubaoming.setInsertTime(new Date());
            xueshengxiangmubaoming.setCreateTime(new Date());
            xueshengxiangmubaomingService.insert(xueshengxiangmubaoming);
            return R.ok();
        }else {
            return R.error(511,"该学生已经报名过该项目");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody XueshengxiangmubaomingEntity xueshengxiangmubaoming, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,xueshengxiangmubaoming:{}",this.getClass().getName(),xueshengxiangmubaoming.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(StringUtil.isEmpty(role))
//            return R.error(511,"权限为空");
//        else if("学生".equals(role))
//            xueshengxiangmubaoming.setXueshengId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        //根据字段查询是否有相同数据
        Wrapper<XueshengxiangmubaomingEntity> queryWrapper = new EntityWrapper<XueshengxiangmubaomingEntity>()
            .notIn("id",xueshengxiangmubaoming.getId())
            .andNew()
            .eq("xuesheng_id", xueshengxiangmubaoming.getXueshengId())
            .eq("xueshengxiangmu_id", xueshengxiangmubaoming.getXueshengxiangmuId())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        XueshengxiangmubaomingEntity xueshengxiangmubaomingEntity = xueshengxiangmubaomingService.selectOne(queryWrapper);
        if(xueshengxiangmubaomingEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      xueshengxiangmubaoming.set
            //  }
            xueshengxiangmubaomingService.updateById(xueshengxiangmubaoming);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"该学生已经报名过该项目");
        }
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        xueshengxiangmubaomingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        try {
            List<XueshengxiangmubaomingEntity> xueshengxiangmubaomingList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            XueshengxiangmubaomingEntity xueshengxiangmubaomingEntity = new XueshengxiangmubaomingEntity();
//                            xueshengxiangmubaomingEntity.setXueshengId(Integer.valueOf(data.get(0)));   //学生 要改的
//                            xueshengxiangmubaomingEntity.setXueshengxiangmuId(Integer.valueOf(data.get(0)));   //学生项目 要改的
//                            xueshengxiangmubaomingEntity.setXueshengxiangmubaomingDefen(data.get(0));                    //成绩得分 要改的
//                            xueshengxiangmubaomingEntity.setXueshengxiangmubaomingJifen(data.get(0));                    //院系积分 要改的
//                            xueshengxiangmubaomingEntity.setInsertTime(date);//时间
//                            xueshengxiangmubaomingEntity.setCreateTime(date);//时间
                            xueshengxiangmubaomingList.add(xueshengxiangmubaomingEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        xueshengxiangmubaomingService.insertBatch(xueshengxiangmubaomingList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }





    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = xueshengxiangmubaomingService.queryPage(params);

        //字典表数据转换
        List<XueshengxiangmubaomingView> list =(List<XueshengxiangmubaomingView>)page.getList();
        for(XueshengxiangmubaomingView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        XueshengxiangmubaomingEntity xueshengxiangmubaoming = xueshengxiangmubaomingService.selectById(id);
            if(xueshengxiangmubaoming !=null){


                //entity转view
                XueshengxiangmubaomingView view = new XueshengxiangmubaomingView();
                BeanUtils.copyProperties( xueshengxiangmubaoming , view );//把实体数据重构到view中

                //级联表
                    XueshengEntity xuesheng = xueshengService.selectById(xueshengxiangmubaoming.getXueshengId());
                if(xuesheng != null){
                    BeanUtils.copyProperties( xuesheng , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setXueshengId(xuesheng.getId());
                }
                //级联表
                    XueshengxiangmuEntity xueshengxiangmu = xueshengxiangmuService.selectById(xueshengxiangmubaoming.getXueshengxiangmuId());
                if(xueshengxiangmu != null){
                    BeanUtils.copyProperties( xueshengxiangmu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setXueshengxiangmuId(xueshengxiangmu.getId());
                }
                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody XueshengxiangmubaomingEntity xueshengxiangmubaoming, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,xueshengxiangmubaoming:{}",this.getClass().getName(),xueshengxiangmubaoming.toString());
        Wrapper<XueshengxiangmubaomingEntity> queryWrapper = new EntityWrapper<XueshengxiangmubaomingEntity>()
            .eq("xuesheng_id", xueshengxiangmubaoming.getXueshengId())
            .eq("xueshengxiangmu_id", xueshengxiangmubaoming.getXueshengxiangmuId())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        XueshengxiangmubaomingEntity xueshengxiangmubaomingEntity = xueshengxiangmubaomingService.selectOne(queryWrapper);
        if(xueshengxiangmubaomingEntity==null){
            xueshengxiangmubaoming.setInsertTime(new Date());
            xueshengxiangmubaoming.setCreateTime(new Date());
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      xueshengxiangmubaoming.set
        //  }
        xueshengxiangmubaomingService.insert(xueshengxiangmubaoming);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


}
