package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import com.dao.LaoshixiangmubaomingDao;
import com.entity.LaoshixiangmubaomingEntity;
import com.service.LaoshixiangmubaomingService;
import com.entity.view.LaoshixiangmubaomingView;

/**
 * 老师项目报名 服务实现类
 */
@Service("laoshixiangmubaomingService")
@Transactional
public class LaoshixiangmubaomingServiceImpl extends ServiceImpl<LaoshixiangmubaomingDao, LaoshixiangmubaomingEntity> implements LaoshixiangmubaomingService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<LaoshixiangmubaomingView> page =new Query<LaoshixiangmubaomingView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
