package com.dao;

import com.entity.CaipanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.CaipanView;

/**
 * 裁判 Dao 接口
 *
 * @author 
 */
public interface CaipanDao extends BaseMapper<CaipanEntity> {

   List<CaipanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
