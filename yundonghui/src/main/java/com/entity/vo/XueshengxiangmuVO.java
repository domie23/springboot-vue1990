package com.entity.vo;

import com.entity.XueshengxiangmuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 学生项目
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xueshengxiangmu")
public class XueshengxiangmuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 项目名称
     */

    @TableField(value = "xueshengxiangmu_name")
    private String xueshengxiangmuName;


    /**
     * 项目照片
     */

    @TableField(value = "xueshengxiangmu_photo")
    private String xueshengxiangmuPhoto;


    /**
     * 学生项目类型
     */

    @TableField(value = "xueshengxiangmu_types")
    private Integer xueshengxiangmuTypes;


    /**
     * 是否专业
     */

    @TableField(value = "xueshengxiangmu_zhuanye_types")
    private Integer xueshengxiangmuZhuanyeTypes;


    /**
     * 相关文件
     */

    @TableField(value = "xueshengxiangmu_file")
    private String xueshengxiangmuFile;


    /**
     * 学生项目介绍
     */

    @TableField(value = "xueshengxiangmu_content")
    private String xueshengxiangmuContent;


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
     * 创建时间  show1 show2 photoShow
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
    public String getXueshengxiangmuName() {
        return xueshengxiangmuName;
    }


    /**
	 * 获取：项目名称
	 */

    public void setXueshengxiangmuName(String xueshengxiangmuName) {
        this.xueshengxiangmuName = xueshengxiangmuName;
    }
    /**
	 * 设置：项目照片
	 */
    public String getXueshengxiangmuPhoto() {
        return xueshengxiangmuPhoto;
    }


    /**
	 * 获取：项目照片
	 */

    public void setXueshengxiangmuPhoto(String xueshengxiangmuPhoto) {
        this.xueshengxiangmuPhoto = xueshengxiangmuPhoto;
    }
    /**
	 * 设置：学生项目类型
	 */
    public Integer getXueshengxiangmuTypes() {
        return xueshengxiangmuTypes;
    }


    /**
	 * 获取：学生项目类型
	 */

    public void setXueshengxiangmuTypes(Integer xueshengxiangmuTypes) {
        this.xueshengxiangmuTypes = xueshengxiangmuTypes;
    }
    /**
	 * 设置：是否专业
	 */
    public Integer getXueshengxiangmuZhuanyeTypes() {
        return xueshengxiangmuZhuanyeTypes;
    }


    /**
	 * 获取：是否专业
	 */

    public void setXueshengxiangmuZhuanyeTypes(Integer xueshengxiangmuZhuanyeTypes) {
        this.xueshengxiangmuZhuanyeTypes = xueshengxiangmuZhuanyeTypes;
    }
    /**
	 * 设置：相关文件
	 */
    public String getXueshengxiangmuFile() {
        return xueshengxiangmuFile;
    }


    /**
	 * 获取：相关文件
	 */

    public void setXueshengxiangmuFile(String xueshengxiangmuFile) {
        this.xueshengxiangmuFile = xueshengxiangmuFile;
    }
    /**
	 * 设置：学生项目介绍
	 */
    public String getXueshengxiangmuContent() {
        return xueshengxiangmuContent;
    }


    /**
	 * 获取：学生项目介绍
	 */

    public void setXueshengxiangmuContent(String xueshengxiangmuContent) {
        this.xueshengxiangmuContent = xueshengxiangmuContent;
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
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
