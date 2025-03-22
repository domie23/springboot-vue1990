package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 学生项目报名
 *
 * @author 
 * @email
 */
@TableName("xueshengxiangmubaoming")
public class XueshengxiangmubaomingEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XueshengxiangmubaomingEntity() {

	}

	public XueshengxiangmubaomingEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 学生
     */
    @TableField(value = "xuesheng_id")

    private Integer xueshengId;


    /**
     * 学生项目
     */
    @TableField(value = "xueshengxiangmu_id")

    private Integer xueshengxiangmuId;


    /**
     * 成绩得分
     */
    @TableField(value = "xueshengxiangmubaoming_defen")

    private Double xueshengxiangmubaomingDefen;


    /**
     * 院系积分
     */
    @TableField(value = "xueshengxiangmubaoming_jifen")

    private Double xueshengxiangmubaomingJifen;


    /**
     * 报名时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：学生
	 */
    public Integer getXueshengId() {
        return xueshengId;
    }


    /**
	 * 获取：学生
	 */

    public void setXueshengId(Integer xueshengId) {
        this.xueshengId = xueshengId;
    }
    /**
	 * 设置：学生项目
	 */
    public Integer getXueshengxiangmuId() {
        return xueshengxiangmuId;
    }


    /**
	 * 获取：学生项目
	 */

    public void setXueshengxiangmuId(Integer xueshengxiangmuId) {
        this.xueshengxiangmuId = xueshengxiangmuId;
    }
    /**
	 * 设置：成绩得分
	 */
    public Double getXueshengxiangmubaomingDefen() {
        return xueshengxiangmubaomingDefen;
    }


    /**
	 * 获取：成绩得分
	 */

    public void setXueshengxiangmubaomingDefen(Double xueshengxiangmubaomingDefen) {
        this.xueshengxiangmubaomingDefen = xueshengxiangmubaomingDefen;
    }
    /**
	 * 设置：院系积分
	 */
    public Double getXueshengxiangmubaomingJifen() {
        return xueshengxiangmubaomingJifen;
    }


    /**
	 * 获取：院系积分
	 */

    public void setXueshengxiangmubaomingJifen(Double xueshengxiangmubaomingJifen) {
        this.xueshengxiangmubaomingJifen = xueshengxiangmubaomingJifen;
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

    @Override
    public String toString() {
        return "Xueshengxiangmubaoming{" +
            "id=" + id +
            ", xueshengId=" + xueshengId +
            ", xueshengxiangmuId=" + xueshengxiangmuId +
            ", xueshengxiangmubaomingDefen=" + xueshengxiangmubaomingDefen +
            ", xueshengxiangmubaomingJifen=" + xueshengxiangmubaomingJifen +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
