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
 * 赛事编排信息
 *
 * @author 
 * @email
 */
@TableName("saishibianpai")
public class SaishibianpaiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public SaishibianpaiEntity() {

	}

	public SaishibianpaiEntity(T t) {
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
     * 赛事编排名称
     */
    @TableField(value = "saishibianpai_name")

    private String saishibianpaiName;


    /**
     * 赛事编排图片
     */
    @TableField(value = "saishibianpai_photo")

    private String saishibianpaiPhoto;


    /**
     * 赛事编排详情
     */
    @TableField(value = "saishibianpai_content")

    private String saishibianpaiContent;


    /**
     * 赛事编排文件
     */
    @TableField(value = "saishibianpai_file")

    private String saishibianpaiFile;


    /**
     * 赛事编排地址
     */
    @TableField(value = "saishibianpai_address")

    private String saishibianpaiAddress;


    /**
     * 各院系参赛人数
     */
    @TableField(value = "saishibianpai_cansai_content")

    private String saishibianpaiCansaiContent;


    /**
     * 编排日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @TableField(value = "saishibianpai_time")

    private Date saishibianpaiTime;


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
	 * 设置：赛事编排名称
	 */
    public String getSaishibianpaiName() {
        return saishibianpaiName;
    }


    /**
	 * 获取：赛事编排名称
	 */

    public void setSaishibianpaiName(String saishibianpaiName) {
        this.saishibianpaiName = saishibianpaiName;
    }
    /**
	 * 设置：赛事编排图片
	 */
    public String getSaishibianpaiPhoto() {
        return saishibianpaiPhoto;
    }


    /**
	 * 获取：赛事编排图片
	 */

    public void setSaishibianpaiPhoto(String saishibianpaiPhoto) {
        this.saishibianpaiPhoto = saishibianpaiPhoto;
    }
    /**
	 * 设置：赛事编排详情
	 */
    public String getSaishibianpaiContent() {
        return saishibianpaiContent;
    }


    /**
	 * 获取：赛事编排详情
	 */

    public void setSaishibianpaiContent(String saishibianpaiContent) {
        this.saishibianpaiContent = saishibianpaiContent;
    }
    /**
	 * 设置：赛事编排文件
	 */
    public String getSaishibianpaiFile() {
        return saishibianpaiFile;
    }


    /**
	 * 获取：赛事编排文件
	 */

    public void setSaishibianpaiFile(String saishibianpaiFile) {
        this.saishibianpaiFile = saishibianpaiFile;
    }
    /**
	 * 设置：赛事编排地址
	 */
    public String getSaishibianpaiAddress() {
        return saishibianpaiAddress;
    }


    /**
	 * 获取：赛事编排地址
	 */

    public void setSaishibianpaiAddress(String saishibianpaiAddress) {
        this.saishibianpaiAddress = saishibianpaiAddress;
    }
    /**
	 * 设置：各院系参赛人数
	 */
    public String getSaishibianpaiCansaiContent() {
        return saishibianpaiCansaiContent;
    }


    /**
	 * 获取：各院系参赛人数
	 */

    public void setSaishibianpaiCansaiContent(String saishibianpaiCansaiContent) {
        this.saishibianpaiCansaiContent = saishibianpaiCansaiContent;
    }
    /**
	 * 设置：编排日期
	 */
    public Date getSaishibianpaiTime() {
        return saishibianpaiTime;
    }


    /**
	 * 获取：编排日期
	 */

    public void setSaishibianpaiTime(Date saishibianpaiTime) {
        this.saishibianpaiTime = saishibianpaiTime;
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
        return "Saishibianpai{" +
            "id=" + id +
            ", saishibianpaiName=" + saishibianpaiName +
            ", saishibianpaiPhoto=" + saishibianpaiPhoto +
            ", saishibianpaiContent=" + saishibianpaiContent +
            ", saishibianpaiFile=" + saishibianpaiFile +
            ", saishibianpaiAddress=" + saishibianpaiAddress +
            ", saishibianpaiCansaiContent=" + saishibianpaiCansaiContent +
            ", saishibianpaiTime=" + saishibianpaiTime +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
