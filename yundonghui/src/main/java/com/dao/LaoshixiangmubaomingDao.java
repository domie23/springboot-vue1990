package com.dao;

import com.entity.LaoshixiangmubaomingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.LaoshixiangmubaomingView;

/**
 * 老师项目报名 Dao 接口
 *
 * @author 
 */
public interface LaoshixiangmubaomingDao extends BaseMapper<LaoshixiangmubaomingEntity> {

   List<LaoshixiangmubaomingView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
