package com.entity.view;

import com.entity.KaibiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 开闭幕式信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("kaibi")
public class KaibiView extends KaibiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 开闭幕式的值
		*/
		private String kaibiValue;



	public KaibiView() {

	}

	public KaibiView(KaibiEntity kaibiEntity) {
		try {
			BeanUtils.copyProperties(this, kaibiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 开闭幕式的值
			*/
			public String getKaibiValue() {
				return kaibiValue;
			}
			/**
			* 设置： 开闭幕式的值
			*/
			public void setKaibiValue(String kaibiValue) {
				this.kaibiValue = kaibiValue;
			}















}
