
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
 * 裁判
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/caipan")
public class CaipanController {
    private static final Logger logger = LoggerFactory.getLogger(CaipanController.class);

    @Autowired
    private CaipanService caipanService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service

    @Autowired
    private XueshengService xueshengService;
    @Autowired
    private LaoshiService laoshiService;


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
        PageUtils page = caipanService.queryPage(params);

        //字典表数据转换
        List<CaipanView> list =(List<CaipanView>)page.getList();
        for(CaipanView c:list){
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
        CaipanEntity caipan = caipanService.selectById(id);
        if(caipan !=null){
            //entity转view
            CaipanView view = new CaipanView();
            BeanUtils.copyProperties( caipan , view );//把实体数据重构到view中

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
    public R save(@RequestBody CaipanEntity caipan, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,caipan:{}",this.getClass().getName(),caipan.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");

        Wrapper<CaipanEntity> queryWrapper = new EntityWrapper<CaipanEntity>()
            .eq("username", caipan.getUsername())
            .or()
            .eq("caipan_phone", caipan.getCaipanPhone())
            .or()
            .eq("caipan_id_number", caipan.getCaipanIdNumber())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        CaipanEntity caipanEntity = caipanService.selectOne(queryWrapper);
        if(caipanEntity==null){
            caipan.setCreateTime(new Date());
            caipan.setPassword("123456");
            caipanService.insert(caipan);
            return R.ok();
        }else {
            return R.error(511,"账户或者裁判手机号或者裁判身份证号已经被使用");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody CaipanEntity caipan, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,caipan:{}",this.getClass().getName(),caipan.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(StringUtil.isEmpty(role))
//            return R.error(511,"权限为空");
        //根据字段查询是否有相同数据
        Wrapper<CaipanEntity> queryWrapper = new EntityWrapper<CaipanEntity>()
            .notIn("id",caipan.getId())
            .andNew()
            .eq("username", caipan.getUsername())
            .or()
            .eq("caipan_phone", caipan.getCaipanPhone())
            .or()
            .eq("caipan_id_number", caipan.getCaipanIdNumber())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        CaipanEntity caipanEntity = caipanService.selectOne(queryWrapper);
        if("".equals(caipan.getCaipanPhoto()) || "null".equals(caipan.getCaipanPhoto())){
                caipan.setCaipanPhoto(null);
        }
        if(caipanEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      caipan.set
            //  }
            caipanService.updateById(caipan);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"账户或者裁判手机号或者裁判身份证号已经被使用");
        }
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        caipanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        try {
            List<CaipanEntity> caipanList = new ArrayList<>();//上传的东西
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
                            CaipanEntity caipanEntity = new CaipanEntity();
//                            caipanEntity.setUsername(data.get(0));                    //账户 要改的
//                            //caipanEntity.setPassword("123456");//密码
//                            caipanEntity.setCaipanName(data.get(0));                    //裁判姓名 要改的
//                            caipanEntity.setCaipanPhone(data.get(0));                    //裁判手机号 要改的
//                            caipanEntity.setCaipanIdNumber(data.get(0));                    //裁判身份证号 要改的
//                            caipanEntity.setCaipanPhoto("");//照片
//                            caipanEntity.setSexTypes(Integer.valueOf(data.get(0)));   //性别 要改的
//                            caipanEntity.setCaipanEmail(data.get(0));                    //电子邮箱 要改的
//                            caipanEntity.setCreateTime(date);//时间
                            caipanList.add(caipanEntity);


                            //把要查询是否重复的字段放入map中
                                //账户
                                if(seachFields.containsKey("username")){
                                    List<String> username = seachFields.get("username");
                                    username.add(data.get(0));//要改的
                                }else{
                                    List<String> username = new ArrayList<>();
                                    username.add(data.get(0));//要改的
                                    seachFields.put("username",username);
                                }
                                //裁判手机号
                                if(seachFields.containsKey("caipanPhone")){
                                    List<String> caipanPhone = seachFields.get("caipanPhone");
                                    caipanPhone.add(data.get(0));//要改的
                                }else{
                                    List<String> caipanPhone = new ArrayList<>();
                                    caipanPhone.add(data.get(0));//要改的
                                    seachFields.put("caipanPhone",caipanPhone);
                                }
                                //裁判身份证号
                                if(seachFields.containsKey("caipanIdNumber")){
                                    List<String> caipanIdNumber = seachFields.get("caipanIdNumber");
                                    caipanIdNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> caipanIdNumber = new ArrayList<>();
                                    caipanIdNumber.add(data.get(0));//要改的
                                    seachFields.put("caipanIdNumber",caipanIdNumber);
                                }
                        }

                        //查询是否重复
                         //账户
                        List<CaipanEntity> caipanEntities_username = caipanService.selectList(new EntityWrapper<CaipanEntity>().in("username", seachFields.get("username")));
                        if(caipanEntities_username.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(CaipanEntity s:caipanEntities_username){
                                repeatFields.add(s.getUsername());
                            }
                            return R.error(511,"数据库的该表中的 [账户] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                         //裁判手机号
                        List<CaipanEntity> caipanEntities_caipanPhone = caipanService.selectList(new EntityWrapper<CaipanEntity>().in("caipan_phone", seachFields.get("caipanPhone")));
                        if(caipanEntities_caipanPhone.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(CaipanEntity s:caipanEntities_caipanPhone){
                                repeatFields.add(s.getCaipanPhone());
                            }
                            return R.error(511,"数据库的该表中的 [裁判手机号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                         //裁判身份证号
                        List<CaipanEntity> caipanEntities_caipanIdNumber = caipanService.selectList(new EntityWrapper<CaipanEntity>().in("caipan_id_number", seachFields.get("caipanIdNumber")));
                        if(caipanEntities_caipanIdNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(CaipanEntity s:caipanEntities_caipanIdNumber){
                                repeatFields.add(s.getCaipanIdNumber());
                            }
                            return R.error(511,"数据库的该表中的 [裁判身份证号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        caipanService.insertBatch(caipanList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }


    /**
    * 登录
    */
    @IgnoreAuth
    @RequestMapping(value = "/login")
    public R login(String username, String password, String captcha, HttpServletRequest request) {
        CaipanEntity caipan = caipanService.selectOne(new EntityWrapper<CaipanEntity>().eq("username", username));
        if(caipan==null || !caipan.getPassword().equals(password))
            return R.error("账号或密码不正确");
        //  // 获取监听器中的字典表
        // ServletContext servletContext = ContextLoader.getCurrentWebApplicationContext().getServletContext();
        // Map<String, Map<Integer, String>> dictionaryMap= (Map<String, Map<Integer, String>>) servletContext.getAttribute("dictionaryMap");
        // Map<Integer, String> role_types = dictionaryMap.get("role_types");
        // role_types.get(.getRoleTypes());
        String token = tokenService.generateToken(caipan.getId(),username, "caipan", "裁判");
        R r = R.ok();
        r.put("token", token);
        r.put("role","裁判");
        r.put("username",caipan.getCaipanName());
        r.put("tableName","caipan");
        r.put("userId",caipan.getId());
        return r;
    }

    /**
    * 注册
    */
    @IgnoreAuth
    @PostMapping(value = "/register")
    public R register(@RequestBody CaipanEntity caipan){
//    	ValidatorUtils.validateEntity(user);
        Wrapper<CaipanEntity> queryWrapper = new EntityWrapper<CaipanEntity>()
            .eq("username", caipan.getUsername())
            .or()
            .eq("caipan_phone", caipan.getCaipanPhone())
            .or()
            .eq("caipan_id_number", caipan.getCaipanIdNumber())
            ;
        CaipanEntity caipanEntity = caipanService.selectOne(queryWrapper);
        if(caipanEntity != null)
            return R.error("账户或者裁判手机号或者裁判身份证号已经被使用");
        caipan.setCreateTime(new Date());
        caipanService.insert(caipan);
        return R.ok();
    }

    /**
     * 重置密码
     */
    @GetMapping(value = "/resetPassword")
    public R resetPassword(Integer  id){
        CaipanEntity caipan = new CaipanEntity();
        caipan.setPassword("123456");
        caipan.setId(id);
        caipanService.updateById(caipan);
        return R.ok();
    }


    /**
     * 忘记密码
     */
    @IgnoreAuth
    @RequestMapping(value = "/resetPass")
    public R resetPass(String username, HttpServletRequest request) {
        CaipanEntity caipan = caipanService.selectOne(new EntityWrapper<CaipanEntity>().eq("username", username));
        if(caipan!=null){
            caipan.setPassword("123456");
            boolean b = caipanService.updateById(caipan);
            if(!b){
               return R.error();
            }
        }else{
           return R.error("账号不存在");
        }
        return R.ok();
    }


    /**
    * 获取用户的session用户信息
    */
    @RequestMapping("/session")
    public R getCurrCaipan(HttpServletRequest request){
        Integer id = (Integer)request.getSession().getAttribute("userId");
        CaipanEntity caipan = caipanService.selectById(id);
        if(caipan !=null){
            //entity转view
            CaipanView view = new CaipanView();
            BeanUtils.copyProperties( caipan , view );//把实体数据重构到view中

            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }
    }


    /**
    * 退出
    */
    @GetMapping(value = "logout")
    public R logout(HttpServletRequest request) {
        request.getSession().invalidate();
        return R.ok("退出成功");
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
        PageUtils page = caipanService.queryPage(params);

        //字典表数据转换
        List<CaipanView> list =(List<CaipanView>)page.getList();
        for(CaipanView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        CaipanEntity caipan = caipanService.selectById(id);
            if(caipan !=null){


                //entity转view
                CaipanView view = new CaipanView();
                BeanUtils.copyProperties( caipan , view );//把实体数据重构到view中

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
    public R add(@RequestBody CaipanEntity caipan, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,caipan:{}",this.getClass().getName(),caipan.toString());
        Wrapper<CaipanEntity> queryWrapper = new EntityWrapper<CaipanEntity>()
            .eq("username", caipan.getUsername())
            .or()
            .eq("caipan_phone", caipan.getCaipanPhone())
            .or()
            .eq("caipan_id_number", caipan.getCaipanIdNumber())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        CaipanEntity caipanEntity = caipanService.selectOne(queryWrapper);
        if(caipanEntity==null){
            caipan.setCreateTime(new Date());
        caipan.setPassword("123456");
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      caipan.set
        //  }
        caipanService.insert(caipan);
            return R.ok();
        }else {
            return R.error(511,"账户或者裁判手机号或者裁判身份证号已经被使用");
        }
    }


}
