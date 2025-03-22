package com.entity.vo;

import com.entity.LaoshixiangmuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 老师项目
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("laoshixiangmu")
public class LaoshixiangmuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 项目名称
     */

    @TableField(value = "laoshixiangmu_name")
    private String laoshixiangmuName;


    /**
     * 老师项目类型
     */

    @TableField(value = "laoshixiangmu_types")
    private Integer laoshixiangmuTypes;


    /**
     * 是否老年
     */

    @TableField(value = "laoshixiangmu_zhuanye_types")
    private Integer laoshixiangmuZhuanyeTypes;


    /**
     * 相关文件
     */

    @TableField(value = "laoshixiangmu_file")
    private String laoshixiangmuFile;


    /**
     * 老师项目介绍
     */

    @TableField(value = "laoshixiangmu_content")
    private String laoshixiangmuContent;


    /**
     * 比赛地址
     */

    @TableField(value = "laoshixiangmu_address")
    private String laoshixiangmuAddress;


    /**
     * 比赛开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "laoshixiangmu_time")
    private Date laoshixiangmuTime;


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
	 * 设置：项目名称
	 */
    public String getLaoshixiangmuName() {
        return laoshixiangmuName;
    }


    /**
	 * 获取：项目名称
	 */

    public void setLaoshixiangmuName(String laoshixiangmuName) {
        this.laoshixiangmuName = laoshixiangmuName;
    }
    /**
	 * 设置：老师项目类型
	 */
    public Integer getLaoshixiangmuTypes() {
        return laoshixiangmuTypes;
    }


    /**
	 * 获取：老师项目类型
	 */

    public void setLaoshixiangmuTypes(Integer laoshixiangmuTypes) {
        this.laoshixiangmuTypes = laoshixiangmuTypes;
    }
    /**
	 * 设置：是否老年
	 */
    public Integer getLaoshixiangmuZhuanyeTypes() {
        return laoshixiangmuZhuanyeTypes;
    }


    /**
	 * 获取：是否老年
	 */

    public void setLaoshixiangmuZhuanyeTypes(Integer laoshixiangmuZhuanyeTypes) {
        this.laoshixiangmuZhuanyeTypes = laoshixiangmuZhuanyeTypes;
    }
    /**
	 * 设置：相关文件
	 */
    public String getLaoshixiangmuFile() {
        return laoshixiangmuFile;
    }


    /**
	 * 获取：相关文件
	 */

    public void setLaoshixiangmuFile(String laoshixiangmuFile) {
        this.laoshixiangmuFile = laoshixiangmuFile;
    }
    /**
	 * 设置：老师项目介绍
	 */
    public String getLaoshixiangmuContent() {
        return laoshixiangmuContent;
    }


    /**
	 * 获取：老师项目介绍
	 */

    public void setLaoshixiangmuContent(String laoshixiangmuContent) {
        this.laoshixiangmuContent = laoshixiangmuContent;
    }
    /**
	 * 设置：比赛地址
	 */
    public String getLaoshixiangmuAddress() {
        return laoshixiangmuAddress;
    }


    /**
	 * 获取：比赛地址
	 */

    public void setLaoshixiangmuAddress(String laoshixiangmuAddress) {
        this.laoshixiangmuAddress = laoshixiangmuAddress;
    }
    /**
	 * 设置：比赛开始时间
	 */
    public Date getLaoshixiangmuTime() {
        return laoshixiangmuTime;
    }


    /**
	 * 获取：比赛开始时间
	 */

    public void setLaoshixiangmuTime(Date laoshixiangmuTime) {
        this.laoshixiangmuTime = laoshixiangmuTime;
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
