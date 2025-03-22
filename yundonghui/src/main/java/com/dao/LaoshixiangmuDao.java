package com.dao;

import com.entity.LaoshixiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.LaoshixiangmuView;

/**
 * 老师项目 Dao 接口
 *
 * @author 
 */
public interface LaoshixiangmuDao extends BaseMapper<LaoshixiangmuEntity> {

   List<LaoshixiangmuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
