package com.entity.model;

import com.entity.XueshengxiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 学生项目
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XueshengxiangmuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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
     * 是否专业
     */
    private Integer xueshengxiangmuZhuanyeTypes;


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


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
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
    public String getXueshengxiangmuName() {
        return xueshengxiangmuName;
    }


    /**
	 * 设置：项目名称
	 */
    public void setXueshengxiangmuName(String xueshengxiangmuName) {
        this.xueshengxiangmuName = xueshengxiangmuName;
    }
    /**
	 * 获取：项目照片
	 */
    public String getXueshengxiangmuPhoto() {
        return xueshengxiangmuPhoto;
    }


    /**
	 * 设置：项目照片
	 */
    public void setXueshengxiangmuPhoto(String xueshengxiangmuPhoto) {
        this.xueshengxiangmuPhoto = xueshengxiangmuPhoto;
    }
    /**
	 * 获取：学生项目类型
	 */
    public Integer getXueshengxiangmuTypes() {
        return xueshengxiangmuTypes;
    }


    /**
	 * 设置：学生项目类型
	 */
    public void setXueshengxiangmuTypes(Integer xueshengxiangmuTypes) {
        this.xueshengxiangmuTypes = xueshengxiangmuTypes;
    }
    /**
	 * 获取：是否专业
	 */
    public Integer getXueshengxiangmuZhuanyeTypes() {
        return xueshengxiangmuZhuanyeTypes;
    }


    /**
	 * 设置：是否专业
	 */
    public void setXueshengxiangmuZhuanyeTypes(Integer xueshengxiangmuZhuanyeTypes) {
        this.xueshengxiangmuZhuanyeTypes = xueshengxiangmuZhuanyeTypes;
    }
    /**
	 * 获取：相关文件
	 */
    public String getXueshengxiangmuFile() {
        return xueshengxiangmuFile;
    }


    /**
	 * 设置：相关文件
	 */
    public void setXueshengxiangmuFile(String xueshengxiangmuFile) {
        this.xueshengxiangmuFile = xueshengxiangmuFile;
    }
    /**
	 * 获取：学生项目介绍
	 */
    public String getXueshengxiangmuContent() {
        return xueshengxiangmuContent;
    }


    /**
	 * 设置：学生项目介绍
	 */
    public void setXueshengxiangmuContent(String xueshengxiangmuContent) {
        this.xueshengxiangmuContent = xueshengxiangmuContent;
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
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
