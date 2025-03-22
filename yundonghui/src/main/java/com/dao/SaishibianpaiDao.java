package com.dao;

import com.entity.SaishibianpaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.SaishibianpaiView;

/**
 * 赛事编排信息 Dao 接口
 *
 * @author 
 */
public interface SaishibianpaiDao extends BaseMapper<SaishibianpaiEntity> {

   List<SaishibianpaiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
