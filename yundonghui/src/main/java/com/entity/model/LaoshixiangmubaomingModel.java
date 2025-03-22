package com.entity.model;

import com.entity.LaoshixiangmubaomingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 老师项目报名
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class LaoshixiangmubaomingModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 老师
     */
    private Integer laoshiId;


    /**
     * 老师项目
     */
    private Integer laoshixiangmuId;


    /**
     * 成绩得分
     */
    private Double laoshixiangmubaomingDefen;


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
	 * 获取：老师
	 */
    public Integer getLaoshiId() {
        return laoshiId;
    }


    /**
	 * 设置：老师
	 */
    public void setLaoshiId(Integer laoshiId) {
        this.laoshiId = laoshiId;
    }
    /**
	 * 获取：老师项目
	 */
    public Integer getLaoshixiangmuId() {
        return laoshixiangmuId;
    }


    /**
	 * 设置：老师项目
	 */
    public void setLaoshixiangmuId(Integer laoshixiangmuId) {
        this.laoshixiangmuId = laoshixiangmuId;
    }
    /**
	 * 获取：成绩得分
	 */
    public Double getLaoshixiangmubaomingDefen() {
        return laoshixiangmubaomingDefen;
    }


    /**
	 * 设置：成绩得分
	 */
    public void setLaoshixiangmubaomingDefen(Double laoshixiangmubaomingDefen) {
        this.laoshixiangmubaomingDefen = laoshixiangmubaomingDefen;
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
