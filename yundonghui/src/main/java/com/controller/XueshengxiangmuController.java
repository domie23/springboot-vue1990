
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
 * 学生项目
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/xueshengxiangmu")
public class XueshengxiangmuController {
    private static final Logger logger = LoggerFactory.getLogger(XueshengxiangmuController.class);

    @Autowired
    private XueshengxiangmuService xueshengxiangmuService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service

    @Autowired
    private XueshengService xueshengService;
    @Autowired
    private LaoshiService laoshiService;
    @Autowired
    private CaipanService caipanService;


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
        PageUtils page = xueshengxiangmuService.queryPage(params);

        //字典表数据转换
        List<XueshengxiangmuView> list =(List<XueshengxiangmuView>)page.getList();
        for(XueshengxiangmuView c:list){
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
        XueshengxiangmuEntity xueshengxiangmu = xueshengxiangmuService.selectById(id);
        if(xueshengxiangmu !=null){
            //entity转view
            XueshengxiangmuView view = new XueshengxiangmuView();
            BeanUtils.copyProperties( xueshengxiangmu , view );//把实体数据重构到view中

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
    public R save(@RequestBody XueshengxiangmuEntity xueshengxiangmu, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,xueshengxiangmu:{}",this.getClass().getName(),xueshengxiangmu.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");

        Wrapper<XueshengxiangmuEntity> queryWrapper = new EntityWrapper<XueshengxiangmuEntity>()
            .eq("xueshengxiangmu_name", xueshengxiangmu.getXueshengxiangmuName())
            .eq("xueshengxiangmu_types", xueshengxiangmu.getXueshengxiangmuTypes())
            .eq("xueshengxiangmu_zhuanye_types", xueshengxiangmu.getXueshengxiangmuZhuanyeTypes())
            .eq("laoshixiangmu_address", xueshengxiangmu.getLaoshixiangmuAddress())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        XueshengxiangmuEntity xueshengxiangmuEntity = xueshengxiangmuService.selectOne(queryWrapper);
        if(xueshengxiangmuEntity==null){
            xueshengxiangmu.setInsertTime(new Date());
            xueshengxiangmu.setCreateTime(new Date());
            xueshengxiangmuService.insert(xueshengxiangmu);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody XueshengxiangmuEntity xueshengxiangmu, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,xueshengxiangmu:{}",this.getClass().getName(),xueshengxiangmu.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(StringUtil.isEmpty(role))
//            return R.error(511,"权限为空");
        //根据字段查询是否有相同数据
        Wrapper<XueshengxiangmuEntity> queryWrapper = new EntityWrapper<XueshengxiangmuEntity>()
            .notIn("id",xueshengxiangmu.getId())
            .andNew()
            .eq("xueshengxiangmu_name", xueshengxiangmu.getXueshengxiangmuName())
            .eq("xueshengxiangmu_types", xueshengxiangmu.getXueshengxiangmuTypes())
            .eq("xueshengxiangmu_zhuanye_types", xueshengxiangmu.getXueshengxiangmuZhuanyeTypes())
            .eq("laoshixiangmu_address", xueshengxiangmu.getLaoshixiangmuAddress())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        XueshengxiangmuEntity xueshengxiangmuEntity = xueshengxiangmuService.selectOne(queryWrapper);
        if("".equals(xueshengxiangmu.getXueshengxiangmuPhoto()) || "null".equals(xueshengxiangmu.getXueshengxiangmuPhoto())){
                xueshengxiangmu.setXueshengxiangmuPhoto(null);
        }
        if("".equals(xueshengxiangmu.getXueshengxiangmuFile()) || "null".equals(xueshengxiangmu.getXueshengxiangmuFile())){
                xueshengxiangmu.setXueshengxiangmuFile(null);
        }
        if(xueshengxiangmuEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      xueshengxiangmu.set
            //  }
            xueshengxiangmuService.updateById(xueshengxiangmu);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        xueshengxiangmuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        try {
            List<XueshengxiangmuEntity> xueshengxiangmuList = new ArrayList<>();//上传的东西
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
                            XueshengxiangmuEntity xueshengxiangmuEntity = new XueshengxiangmuEntity();
//                            xueshengxiangmuEntity.setXueshengxiangmuName(data.get(0));                    //项目名称 要改的
//                            xueshengxiangmuEntity.setXueshengxiangmuPhoto("");//照片
//                            xueshengxiangmuEntity.setXueshengxiangmuTypes(Integer.valueOf(data.get(0)));   //学生项目类型 要改的
//                            xueshengxiangmuEntity.setXueshengxiangmuZhuanyeTypes(Integer.valueOf(data.get(0)));   //是否专业 要改的
//                            xueshengxiangmuEntity.setXueshengxiangmuFile(data.get(0));                    //相关文件 要改的
//                            xueshengxiangmuEntity.setXueshengxiangmuContent("");//照片
//                            xueshengxiangmuEntity.setLaoshixiangmuAddress(data.get(0));                    //比赛地址 要改的
//                            xueshengxiangmuEntity.setLaoshixiangmuTime(new Date(data.get(0)));          //比赛开始时间 要改的
//                            xueshengxiangmuEntity.setInsertTime(date);//时间
//                            xueshengxiangmuEntity.setCreateTime(date);//时间
                            xueshengxiangmuList.add(xueshengxiangmuEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        xueshengxiangmuService.insertBatch(xueshengxiangmuList);
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
        PageUtils page = xueshengxiangmuService.queryPage(params);

        //字典表数据转换
        List<XueshengxiangmuView> list =(List<XueshengxiangmuView>)page.getList();
        for(XueshengxiangmuView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        XueshengxiangmuEntity xueshengxiangmu = xueshengxiangmuService.selectById(id);
            if(xueshengxiangmu !=null){


                //entity转view
                XueshengxiangmuView view = new XueshengxiangmuView();
                BeanUtils.copyProperties( xueshengxiangmu , view );//把实体数据重构到view中

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
    public R add(@RequestBody XueshengxiangmuEntity xueshengxiangmu, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,xueshengxiangmu:{}",this.getClass().getName(),xueshengxiangmu.toString());
        Wrapper<XueshengxiangmuEntity> queryWrapper = new EntityWrapper<XueshengxiangmuEntity>()
            .eq("xueshengxiangmu_name", xueshengxiangmu.getXueshengxiangmuName())
            .eq("xueshengxiangmu_types", xueshengxiangmu.getXueshengxiangmuTypes())
            .eq("xueshengxiangmu_zhuanye_types", xueshengxiangmu.getXueshengxiangmuZhuanyeTypes())
            .eq("laoshixiangmu_address", xueshengxiangmu.getLaoshixiangmuAddress())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        XueshengxiangmuEntity xueshengxiangmuEntity = xueshengxiangmuService.selectOne(queryWrapper);
        if(xueshengxiangmuEntity==null){
            xueshengxiangmu.setInsertTime(new Date());
            xueshengxiangmu.setCreateTime(new Date());
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      xueshengxiangmu.set
        //  }
        xueshengxiangmuService.insert(xueshengxiangmu);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


}
