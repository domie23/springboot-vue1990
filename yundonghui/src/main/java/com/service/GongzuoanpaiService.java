package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongzuoanpaiEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * 工作安排信息 服务类
 */
public interface GongzuoanpaiService extends IService<GongzuoanpaiEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}