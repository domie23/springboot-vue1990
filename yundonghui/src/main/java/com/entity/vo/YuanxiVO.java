package com.entity.vo;

import com.entity.YuanxiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 院系
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("yuanxi")
public class YuanxiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

}
