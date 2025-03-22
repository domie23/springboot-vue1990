package com.entity.view;

import com.entity.XueshengEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 学生
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("xuesheng")
public class XueshengView extends XueshengEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 性别的值
		*/
		private String sexValue;



		//级联表 yuanxi
			/**
			* 院系名称
			*/
			private String yuanxiName;
			/**
			* 院系总分
			*/
			private Double yuanxiDefen;

	public XueshengView() {

	}

	public XueshengView(XueshengEntity xueshengEntity) {
		try {
			BeanUtils.copyProperties(this, xueshengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 性别的值
			*/
			public String getSexValue() {
				return sexValue;
			}
			/**
			* 设置： 性别的值
			*/
			public void setSexValue(String sexValue) {
				this.sexValue = sexValue;
			}


























				//级联表的get和set yuanxi
					/**
					* 获取： 院系名称
					*/
					public String getYuanxiName() {
						return yuanxiName;
					}
					/**
					* 设置： 院系名称
					*/
					public void setYuanxiName(String yuanxiName) {
						this.yuanxiName = yuanxiName;
					}
					/**
					* 获取： 院系总分
					*/
					public Double getYuanxiDefen() {
						return yuanxiDefen;
					}
					/**
					* 设置： 院系总分
					*/
					public void setYuanxiDefen(Double yuanxiDefen) {
						this.yuanxiDefen = yuanxiDefen;
					}


}
