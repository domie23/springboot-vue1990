package com.entity.model;

import com.entity.XueshengxiangmubaomingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 学生项目报名
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XueshengxiangmubaomingModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 学生
     */
    private Integer xueshengId;


    /**
     * 学生项目
     */
    private Integer xueshengxiangmuId;


    /**
     * 成绩得分
     */
    private Double xueshengxiangmubaomingDefen;


    /**
     * 院系积分
     */
    private Double xueshengxiangmubaomingJifen;


    /**
     * 报名时间
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
	 * 获取：学生
	 */
    public Integer getXueshengId() {
        return xueshengId;
    }


    /**
	 * 设置：学生
	 */
    public void setXueshengId(Integer xueshengId) {
        this.xueshengId = xueshengId;
    }
    /**
	 * 获取：学生项目
	 */
    public Integer getXueshengxiangmuId() {
        return xueshengxiangmuId;
    }


    /**
	 * 设置：学生项目
	 */
    public void setXueshengxiangmuId(Integer xueshengxiangmuId) {
        this.xueshengxiangmuId = xueshengxiangmuId;
    }
    /**
	 * 获取：成绩得分
	 */
    public Double getXueshengxiangmubaomingDefen() {
        return xueshengxiangmubaomingDefen;
    }


    /**
	 * 设置：成绩得分
	 */
    public void setXueshengxiangmubaomingDefen(Double xueshengxiangmubaomingDefen) {
        this.xueshengxiangmubaomingDefen = xueshengxiangmubaomingDefen;
    }
    /**
	 * 获取：院系积分
	 */
    public Double getXueshengxiangmubaomingJifen() {
        return xueshengxiangmubaomingJifen;
    }


    /**
	 * 设置：院系积分
	 */
    public void setXueshengxiangmubaomingJifen(Double xueshengxiangmubaomingJifen) {
        this.xueshengxiangmubaomingJifen = xueshengxiangmubaomingJifen;
    }
    /**
	 * 获取：报名时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：报名时间
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
