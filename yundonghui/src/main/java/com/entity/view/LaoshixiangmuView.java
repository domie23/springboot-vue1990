package com.entity.view;

import com.entity.LaoshixiangmuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 老师项目
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("laoshixiangmu")
public class LaoshixiangmuView extends LaoshixiangmuEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 老师项目类型的值
		*/
		private String laoshixiangmuValue;
		/**
		* 是否老年的值
		*/
		private String laoshixiangmuZhuanyeValue;



	public LaoshixiangmuView() {

	}

	public LaoshixiangmuView(LaoshixiangmuEntity laoshixiangmuEntity) {
		try {
			BeanUtils.copyProperties(this, laoshixiangmuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 老师项目类型的值
			*/
			public String getLaoshixiangmuValue() {
				return laoshixiangmuValue;
			}
			/**
			* 设置： 老师项目类型的值
			*/
			public void setLaoshixiangmuValue(String laoshixiangmuValue) {
				this.laoshixiangmuValue = laoshixiangmuValue;
			}
			/**
			* 获取： 是否老年的值
			*/
			public String getLaoshixiangmuZhuanyeValue() {
				return laoshixiangmuZhuanyeValue;
			}
			/**
			* 设置： 是否老年的值
			*/
			public void setLaoshixiangmuZhuanyeValue(String laoshixiangmuZhuanyeValue) {
				this.laoshixiangmuZhuanyeValue = laoshixiangmuZhuanyeValue;
			}















}
