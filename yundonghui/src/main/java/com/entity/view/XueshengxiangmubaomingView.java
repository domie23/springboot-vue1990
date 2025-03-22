package com.entity.view;

import com.entity.XueshengxiangmubaomingEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 学生项目报名
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("xueshengxiangmubaoming")
public class XueshengxiangmubaomingView extends XueshengxiangmubaomingEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 xuesheng
			/**
			* 学号
			*/
			private String xueshengUuidNumber;
			/**
			* 学生姓名
			*/
			private String xueshengName;
			/**
			* 学生手机号
			*/
			private String xueshengPhone;
			/**
			* 学生身份证号
			*/
			private String xueshengIdNumber;
			/**
			* 学生头像
			*/
			private String xueshengPhoto;
			/**
			* 电子邮箱
			*/
			private String xueshengEmail;

		//级联表 xueshengxiangmu
			/**
			* 项目名称
			*/
			private String xueshengxiangmuName;
			/**
			* 项目照片
			*/
			private String xueshengxiangmuPhoto;
			/**
			* 学生项目类型
			*/
			private Integer xueshengxiangmuTypes;
				/**
				* 学生项目类型的值
				*/
				private String xueshengxiangmuValue;
			/**
			* 是否专业
			*/
			private Integer xueshengxiangmuZhuanyeTypes;
				/**
				* 是否专业的值
				*/
				private String xueshengxiangmuZhuanyeValue;
			/**
			* 相关文件
			*/
			private String xueshengxiangmuFile;
			/**
			* 学生项目介绍
			*/
			private String xueshengxiangmuContent;
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

	public XueshengxiangmubaomingView() {

	}

	public XueshengxiangmubaomingView(XueshengxiangmubaomingEntity xueshengxiangmubaomingEntity) {
		try {
			BeanUtils.copyProperties(this, xueshengxiangmubaomingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}































				//级联表的get和set xuesheng
					/**
					* 获取： 学号
					*/
					public String getXueshengUuidNumber() {
						return xueshengUuidNumber;
					}
					/**
					* 设置： 学号
					*/
					public void setXueshengUuidNumber(String xueshengUuidNumber) {
						this.xueshengUuidNumber = xueshengUuidNumber;
					}
					/**
					* 获取： 学生姓名
					*/
					public String getXueshengName() {
						return xueshengName;
					}
					/**
					* 设置： 学生姓名
					*/
					public void setXueshengName(String xueshengName) {
						this.xueshengName = xueshengName;
					}
					/**
					* 获取： 学生手机号
					*/
					public String getXueshengPhone() {
						return xueshengPhone;
					}
					/**
					* 设置： 学生手机号
					*/
					public void setXueshengPhone(String xueshengPhone) {
						this.xueshengPhone = xueshengPhone;
					}
					/**
					* 获取： 学生身份证号
					*/
					public String getXueshengIdNumber() {
						return xueshengIdNumber;
					}
					/**
					* 设置： 学生身份证号
					*/
					public void setXueshengIdNumber(String xueshengIdNumber) {
						this.xueshengIdNumber = xueshengIdNumber;
					}
					/**
					* 获取： 学生头像
					*/
					public String getXueshengPhoto() {
						return xueshengPhoto;
					}
					/**
					* 设置： 学生头像
					*/
					public void setXueshengPhoto(String xueshengPhoto) {
						this.xueshengPhoto = xueshengPhoto;
					}
					/**
					* 获取： 电子邮箱
					*/
					public String getXueshengEmail() {
						return xueshengEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setXueshengEmail(String xueshengEmail) {
						this.xueshengEmail = xueshengEmail;
					}




				//级联表的get和set xueshengxiangmu
					/**
					* 获取： 项目名称
					*/
					public String getXueshengxiangmuName() {
						return xueshengxiangmuName;
					}
					/**
					* 设置： 项目名称
					*/
					public void setXueshengxiangmuName(String xueshengxiangmuName) {
						this.xueshengxiangmuName = xueshengxiangmuName;
					}
					/**
					* 获取： 项目照片
					*/
					public String getXueshengxiangmuPhoto() {
						return xueshengxiangmuPhoto;
					}
					/**
					* 设置： 项目照片
					*/
					public void setXueshengxiangmuPhoto(String xueshengxiangmuPhoto) {
						this.xueshengxiangmuPhoto = xueshengxiangmuPhoto;
					}
					/**
					* 获取： 学生项目类型
					*/
					public Integer getXueshengxiangmuTypes() {
						return xueshengxiangmuTypes;
					}
					/**
					* 设置： 学生项目类型
					*/
					public void setXueshengxiangmuTypes(Integer xueshengxiangmuTypes) {
						this.xueshengxiangmuTypes = xueshengxiangmuTypes;
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
					* 获取： 是否专业
					*/
					public Integer getXueshengxiangmuZhuanyeTypes() {
						return xueshengxiangmuZhuanyeTypes;
					}
					/**
					* 设置： 是否专业
					*/
					public void setXueshengxiangmuZhuanyeTypes(Integer xueshengxiangmuZhuanyeTypes) {
						this.xueshengxiangmuZhuanyeTypes = xueshengxiangmuZhuanyeTypes;
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
					/**
					* 获取： 相关文件
					*/
					public String getXueshengxiangmuFile() {
						return xueshengxiangmuFile;
					}
					/**
					* 设置： 相关文件
					*/
					public void setXueshengxiangmuFile(String xueshengxiangmuFile) {
						this.xueshengxiangmuFile = xueshengxiangmuFile;
					}
					/**
					* 获取： 学生项目介绍
					*/
					public String getXueshengxiangmuContent() {
						return xueshengxiangmuContent;
					}
					/**
					* 设置： 学生项目介绍
					*/
					public void setXueshengxiangmuContent(String xueshengxiangmuContent) {
						this.xueshengxiangmuContent = xueshengxiangmuContent;
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
