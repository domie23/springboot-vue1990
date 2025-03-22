package com.entity.view;

import com.entity.XueshengxiangmuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 学生项目
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("xueshengxiangmu")
public class XueshengxiangmuView extends XueshengxiangmuEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 学生项目类型的值
		*/
		private String xueshengxiangmuValue;
		/**
		* 是否专业的值
		*/
		private String xueshengxiangmuZhuanyeValue;



	public XueshengxiangmuView() {

	}

	public XueshengxiangmuView(XueshengxiangmuEntity xueshengxiangmuEntity) {
		try {
			BeanUtils.copyProperties(this, xueshengxiangmuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 学生项目类型的值
			*/
			public String getXueshengxiangmuValue() {
				return xueshengxiangmuValue;
			}
			/**
			* 设置： 学生项目类型的值
			*/
			public void setXueshengxiangmuValue(String xueshengxiangmuValue) {
				this.xueshengxiangmuValue = xueshengxiangmuValue;
			}
			/**
			* 获取： 是否专业的值
			*/
			public String getXueshengxiangmuZhuanyeValue() {
				return xueshengxiangmuZhuanyeValue;
			}
			/**
			* 设置： 是否专业的值
			*/
			public void setXueshengxiangmuZhuanyeValue(String xueshengxiangmuZhuanyeValue) {
				this.xueshengxiangmuZhuanyeValue = xueshengxiangmuZhuanyeValue;
			}















}
