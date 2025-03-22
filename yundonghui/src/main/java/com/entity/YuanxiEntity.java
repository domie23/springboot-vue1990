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
 * 院系
 *
 * @author 
 * @email
 */
@TableName("yuanxi")
public class YuanxiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YuanxiEntity() {

	}

	public YuanxiEntity(T t) {
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
     * 院系名称
     */
    @TableField(value = "yuanxi_name")

    private String yuanxiName;


    /**
     * 院系总分
     */
    @TableField(value = "yuanxi_defen")

    private Double yuanxiDefen;


    /**
     * 添加时间
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
	 * 设置：院系名称
	 */
    public String getYuanxiName() {
        return yuanxiName;
    }


    /**
	 * 获取：院系名称
	 */

    public void setYuanxiName(String yuanxiName) {
        this.yuanxiName = yuanxiName;
    }
    /**
	 * 设置：院系总分
	 */
    public Double getYuanxiDefen() {
        return yuanxiDefen;
    }


    /**
	 * 获取：院系总分
	 */

    public void setYuanxiDefen(Double yuanxiDefen) {
        this.yuanxiDefen = yuanxiDefen;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
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
        return "Yuanxi{" +
            "id=" + id +
            ", yuanxiName=" + yuanxiName +
            ", yuanxiDefen=" + yuanxiDefen +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
