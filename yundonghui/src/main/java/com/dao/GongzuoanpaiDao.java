package com.dao;

import com.entity.GongzuoanpaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GongzuoanpaiView;

/**
 * 工作安排信息 Dao 接口
 *
 * @author 
 */
public interface GongzuoanpaiDao extends BaseMapper<GongzuoanpaiEntity> {

   List<GongzuoanpaiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
