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
 * 开闭幕式信息
 *
 * @author 
 * @email
 */
@TableName("kaibi")
public class KaibiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public KaibiEntity() {

	}

	public KaibiEntity(T t) {
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
     * 开闭幕式名称
     */
    @TableField(value = "kaibi_name")

    private String kaibiName;


    /**
     * 开闭幕式图片
     */
    @TableField(value = "kaibi_photo")

    private String kaibiPhoto;


    /**
     * 视频
     */
    @TableField(value = "kaibi_video")

    private String kaibiVideo;


    /**
     * 开闭幕式
     */
    @TableField(value = "kaibi_types")

    private Integer kaibiTypes;


    /**
     * 开闭幕式详情
     */
    @TableField(value = "kaibi_content")

    private String kaibiContent;


    /**
     * 开闭幕式文件
     */
    @TableField(value = "kaibi_file")

    private String kaibiFile;


    /**
     * 安排日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @TableField(value = "kaibi_time")

    private Date kaibiTime;


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
	 * 设置：开闭幕式名称
	 */
    public String getKaibiName() {
        return kaibiName;
    }


    /**
	 * 获取：开闭幕式名称
	 */

    public void setKaibiName(String kaibiName) {
        this.kaibiName = kaibiName;
    }
    /**
	 * 设置：开闭幕式图片
	 */
    public String getKaibiPhoto() {
        return kaibiPhoto;
    }


    /**
	 * 获取：开闭幕式图片
	 */

    public void setKaibiPhoto(String kaibiPhoto) {
        this.kaibiPhoto = kaibiPhoto;
    }
    /**
	 * 设置：视频
	 */
    public String getKaibiVideo() {
        return kaibiVideo;
    }


    /**
	 * 获取：视频
	 */

    public void setKaibiVideo(String kaibiVideo) {
        this.kaibiVideo = kaibiVideo;
    }
    /**
	 * 设置：开闭幕式
	 */
    public Integer getKaibiTypes() {
        return kaibiTypes;
    }


    /**
	 * 获取：开闭幕式
	 */

    public void setKaibiTypes(Integer kaibiTypes) {
        this.kaibiTypes = kaibiTypes;
    }
    /**
	 * 设置：开闭幕式详情
	 */
    public String getKaibiContent() {
        return kaibiContent;
    }


    /**
	 * 获取：开闭幕式详情
	 */

    public void setKaibiContent(String kaibiContent) {
        this.kaibiContent = kaibiContent;
    }
    /**
	 * 设置：开闭幕式文件
	 */
    public String getKaibiFile() {
        return kaibiFile;
    }


    /**
	 * 获取：开闭幕式文件
	 */

    public void setKaibiFile(String kaibiFile) {
        this.kaibiFile = kaibiFile;
    }
    /**
	 * 设置：安排日期
	 */
    public Date getKaibiTime() {
        return kaibiTime;
    }


    /**
	 * 获取：安排日期
	 */

    public void setKaibiTime(Date kaibiTime) {
        this.kaibiTime = kaibiTime;
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
        return "Kaibi{" +
            "id=" + id +
            ", kaibiName=" + kaibiName +
            ", kaibiPhoto=" + kaibiPhoto +
            ", kaibiVideo=" + kaibiVideo +
            ", kaibiTypes=" + kaibiTypes +
            ", kaibiContent=" + kaibiContent +
            ", kaibiFile=" + kaibiFile +
            ", kaibiTime=" + kaibiTime +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
