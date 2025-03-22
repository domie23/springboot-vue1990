package com.entity.vo;

import com.entity.LaoshixiangmubaomingEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 老师项目报名
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("laoshixiangmubaoming")
public class LaoshixiangmubaomingVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 老师
     */

    @TableField(value = "laoshi_id")
    private Integer laoshiId;


    /**
     * 老师项目
     */

    @TableField(value = "laoshixiangmu_id")
    private Integer laoshixiangmuId;


    /**
     * 成绩得分
     */

    @TableField(value = "laoshixiangmubaoming_defen")
    private Double laoshixiangmubaomingDefen;


    /**
     * 报名时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：老师
	 */
    public Integer getLaoshiId() {
        return laoshiId;
    }


    /**
	 * 获取：老师
	 */

    public void setLaoshiId(Integer laoshiId) {
        this.laoshiId = laoshiId;
    }
    /**
	 * 设置：老师项目
	 */
    public Integer getLaoshixiangmuId() {
        return laoshixiangmuId;
    }


    /**
	 * 获取：老师项目
	 */

    public void setLaoshixiangmuId(Integer laoshixiangmuId) {
        this.laoshixiangmuId = laoshixiangmuId;
    }
    /**
	 * 设置：成绩得分
	 */
    public Double getLaoshixiangmubaomingDefen() {
        return laoshixiangmubaomingDefen;
    }


    /**
	 * 获取：成绩得分
	 */

    public void setLaoshixiangmubaomingDefen(Double laoshixiangmubaomingDefen) {
        this.laoshixiangmubaomingDefen = laoshixiangmubaomingDefen;
    }
    /**
	 * 设置：报名时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：报名时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
