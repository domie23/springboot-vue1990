package com.dao;

import com.entity.XueshengxiangmubaomingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengxiangmubaomingView;

/**
 * 学生项目报名 Dao 接口
 *
 * @author 
 */
public interface XueshengxiangmubaomingDao extends BaseMapper<XueshengxiangmubaomingEntity> {

   List<XueshengxiangmubaomingView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
