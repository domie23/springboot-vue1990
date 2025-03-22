package com.entity.model;

import com.entity.LaoshixiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 老师项目
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class LaoshixiangmuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 项目名称
     */
    private String laoshixiangmuName;


    /**
     * 老师项目类型
     */
    private Integer laoshixiangmuTypes;


    /**
     * 是否老年
     */
    private Integer laoshixiangmuZhuanyeTypes;


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


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：项目名称
	 */
    public String getLaoshixiangmuName() {
        return laoshixiangmuName;
    }


    /**
	 * 设置：项目名称
	 */
    public void setLaoshixiangmuName(String laoshixiangmuName) {
        this.laoshixiangmuName = laoshixiangmuName;
    }
    /**
	 * 获取：老师项目类型
	 */
    public Integer getLaoshixiangmuTypes() {
        return laoshixiangmuTypes;
    }


    /**
	 * 设置：老师项目类型
	 */
    public void setLaoshixiangmuTypes(Integer laoshixiangmuTypes) {
        this.laoshixiangmuTypes = laoshixiangmuTypes;
    }
    /**
	 * 获取：是否老年
	 */
    public Integer getLaoshixiangmuZhuanyeTypes() {
        return laoshixiangmuZhuanyeTypes;
    }


    /**
	 * 设置：是否老年
	 */
    public void setLaoshixiangmuZhuanyeTypes(Integer laoshixiangmuZhuanyeTypes) {
        this.laoshixiangmuZhuanyeTypes = laoshixiangmuZhuanyeTypes;
    }
    /**
	 * 获取：相关文件
	 */
    public String getLaoshixiangmuFile() {
        return laoshixiangmuFile;
    }


    /**
	 * 设置：相关文件
	 */
    public void setLaoshixiangmuFile(String laoshixiangmuFile) {
        this.laoshixiangmuFile = laoshixiangmuFile;
    }
    /**
	 * 获取：老师项目介绍
	 */
    public String getLaoshixiangmuContent() {
        return laoshixiangmuContent;
    }


    /**
	 * 设置：老师项目介绍
	 */
    public void setLaoshixiangmuContent(String laoshixiangmuContent) {
        this.laoshixiangmuContent = laoshixiangmuContent;
    }
    /**
	 * 获取：比赛地址
	 */
    public String getLaoshixiangmuAddress() {
        return laoshixiangmuAddress;
    }


    /**
	 * 设置：比赛地址
	 */
    public void setLaoshixiangmuAddress(String laoshixiangmuAddress) {
        this.laoshixiangmuAddress = laoshixiangmuAddress;
    }
    /**
	 * 获取：比赛开始时间
	 */
    public Date getLaoshixiangmuTime() {
        return laoshixiangmuTime;
    }


    /**
	 * 设置：比赛开始时间
	 */
    public void setLaoshixiangmuTime(Date laoshixiangmuTime) {
        this.laoshixiangmuTime = laoshixiangmuTime;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
