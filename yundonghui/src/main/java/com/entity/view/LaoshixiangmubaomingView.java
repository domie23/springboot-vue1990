package com.entity.view;

import com.entity.LaoshixiangmubaomingEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 老师项目报名
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("laoshixiangmubaoming")
public class LaoshixiangmubaomingView extends LaoshixiangmubaomingEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 laoshi
			/**
			* 工号
			*/
			private String laoshiUuidNumber;
			/**
			* 老师姓名
			*/
			private String laoshiName;
			/**
			* 老师手机号
			*/
			private String laoshiPhone;
			/**
			* 老师身份证号
			*/
			private String laoshiIdNumber;
			/**
			* 老师头像
			*/
			private String laoshiPhoto;
			/**
			* 电子邮箱
			*/
			private String laoshiEmail;

		//级联表 laoshixiangmu
			/**
			* 项目名称
			*/
			private String laoshixiangmuName;
			/**
			* 老师项目类型
			*/
			private Integer laoshixiangmuTypes;
				/**
				* 老师项目类型的值
				*/
				private String laoshixiangmuValue;
			/**
			* 是否老年
			*/
			private Integer laoshixiangmuZhuanyeTypes;
				/**
				* 是否老年的值
				*/
				private String laoshixiangmuZhuanyeValue;
			/**
			* 相关文件
			*/
			private String laoshixiangmuFile;
			/**
			* 老师项目介绍
			*/
			private String laoshixiangmuContent;
			/**
			* 比赛地址
			*/
			private String laoshixiangmuAddress;
			/**
			* 比赛开始时间
			*/
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			private Date laoshixiangmuTime;

	public LaoshixiangmubaomingView() {

	}

	public LaoshixiangmubaomingView(LaoshixiangmubaomingEntity laoshixiangmubaomingEntity) {
		try {
			BeanUtils.copyProperties(this, laoshixiangmubaomingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



















				//级联表的get和set laoshi
					/**
					* 获取： 工号
					*/
					public String getLaoshiUuidNumber() {
						return laoshiUuidNumber;
					}
					/**
					* 设置： 工号
					*/
					public void setLaoshiUuidNumber(String laoshiUuidNumber) {
						this.laoshiUuidNumber = laoshiUuidNumber;
					}
					/**
					* 获取： 老师姓名
					*/
					public String getLaoshiName() {
						return laoshiName;
					}
					/**
					* 设置： 老师姓名
					*/
					public void setLaoshiName(String laoshiName) {
						this.laoshiName = laoshiName;
					}
					/**
					* 获取： 老师手机号
					*/
					public String getLaoshiPhone() {
						return laoshiPhone;
					}
					/**
					* 设置： 老师手机号
					*/
					public void setLaoshiPhone(String laoshiPhone) {
						this.laoshiPhone = laoshiPhone;
					}
					/**
					* 获取： 老师身份证号
					*/
					public String getLaoshiIdNumber() {
						return laoshiIdNumber;
					}
					/**
					* 设置： 老师身份证号
					*/
					public void setLaoshiIdNumber(String laoshiIdNumber) {
						this.laoshiIdNumber = laoshiIdNumber;
					}
					/**
					* 获取： 老师头像
					*/
					public String getLaoshiPhoto() {
						return laoshiPhoto;
					}
					/**
					* 设置： 老师头像
					*/
					public void setLaoshiPhoto(String laoshiPhoto) {
						this.laoshiPhoto = laoshiPhoto;
					}
					/**
					* 获取： 电子邮箱
					*/
					public String getLaoshiEmail() {
						return laoshiEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setLaoshiEmail(String laoshiEmail) {
						this.laoshiEmail = laoshiEmail;
					}




				//级联表的get和set laoshixiangmu
					/**
					* 获取： 项目名称
					*/
					public String getLaoshixiangmuName() {
						return laoshixiangmuName;
					}
					/**
					* 设置： 项目名称
					*/
					public void setLaoshixiangmuName(String laoshixiangmuName) {
						this.laoshixiangmuName = laoshixiangmuName;
					}
					/**
					* 获取： 老师项目类型
					*/
					public Integer getLaoshixiangmuTypes() {
						return laoshixiangmuTypes;
					}
					/**
					* 设置： 老师项目类型
					*/
					public void setLaoshixiangmuTypes(Integer laoshixiangmuTypes) {
						this.laoshixiangmuTypes = laoshixiangmuTypes;
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
					* 获取： 是否老年
					*/
					public Integer getLaoshixiangmuZhuanyeTypes() {
						return laoshixiangmuZhuanyeTypes;
					}
					/**
					* 设置： 是否老年
					*/
					public void setLaoshixiangmuZhuanyeTypes(Integer laoshixiangmuZhuanyeTypes) {
						this.laoshixiangmuZhuanyeTypes = laoshixiangmuZhuanyeTypes;
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
					/**
					* 获取： 相关文件
					*/
					public String getLaoshixiangmuFile() {
						return laoshixiangmuFile;
					}
					/**
					* 设置： 相关文件
					*/
					public void setLaoshixiangmuFile(String laoshixiangmuFile) {
						this.laoshixiangmuFile = laoshixiangmuFile;
					}
					/**
					* 获取： 老师项目介绍
					*/
					public String getLaoshixiangmuContent() {
						return laoshixiangmuContent;
					}
					/**
					* 设置： 老师项目介绍
					*/
					public void setLaoshixiangmuContent(String laoshixiangmuContent) {
						this.laoshixiangmuContent = laoshixiangmuContent;
					}
					/**
					* 获取： 比赛地址
					*/
					public String getLaoshixiangmuAddress() {
						return laoshixiangmuAddress;
					}
					/**
					* 设置： 比赛地址
					*/
					public void setLaoshixiangmuAddress(String laoshixiangmuAddress) {
						this.laoshixiangmuAddress = laoshixiangmuAddress;
					}
					/**
					* 获取： 比赛开始时间
					*/
					public Date getLaoshixiangmuTime() {
						return laoshixiangmuTime;
					}
					/**
					* 设置： 比赛开始时间
					*/
					public void setLaoshixiangmuTime(Date laoshixiangmuTime) {
						this.laoshixiangmuTime = laoshixiangmuTime;
					}





















}
