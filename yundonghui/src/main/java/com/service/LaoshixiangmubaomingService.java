package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LaoshixiangmubaomingEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * 老师项目报名 服务类
 */
public interface LaoshixiangmubaomingService extends IService<LaoshixiangmubaomingEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}