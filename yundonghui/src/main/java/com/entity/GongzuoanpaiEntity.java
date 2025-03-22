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
 * 工作安排信息
 *
 * @author 
 * @email
 */
@TableName("gongzuoanpai")
public class GongzuoanpaiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GongzuoanpaiEntity() {

	}

	public GongzuoanpaiEntity(T t) {
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
     * 工作安排名称
     */
    @TableField(value = "gongzuoanpai_name")

    private String gongzuoanpaiName;


    /**
     * 工作安排图片
     */
    @TableField(value = "gongzuoanpai_photo")

    private String gongzuoanpaiPhoto;


    /**
     * 工作安排详情
     */
    @TableField(value = "gongzuoanpai_content")

    private String gongzuoanpaiContent;


    /**
     * 工作安排文件
     */
    @TableField(value = "gongzuoanpai_file")

    private String gongzuoanpaiFile;


    /**
     * 安排日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @TableField(value = "gongzuoanpai_time")

    private Date gongzuoanpaiTime;


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
	 * 设置：工作安排名称
	 */
    public String getGongzuoanpaiName() {
        return gongzuoanpaiName;
    }


    /**
	 * 获取：工作安排名称
	 */

    public void setGongzuoanpaiName(String gongzuoanpaiName) {
        this.gongzuoanpaiName = gongzuoanpaiName;
    }
    /**
	 * 设置：工作安排图片
	 */
    public String getGongzuoanpaiPhoto() {
        return gongzuoanpaiPhoto;
    }


    /**
	 * 获取：工作安排图片
	 */

    public void setGongzuoanpaiPhoto(String gongzuoanpaiPhoto) {
        this.gongzuoanpaiPhoto = gongzuoanpaiPhoto;
    }
    /**
	 * 设置：工作安排详情
	 */
    public String getGongzuoanpaiContent() {
        return gongzuoanpaiContent;
    }


    /**
	 * 获取：工作安排详情
	 */

    public void setGongzuoanpaiContent(String gongzuoanpaiContent) {
        this.gongzuoanpaiContent = gongzuoanpaiContent;
    }
    /**
	 * 设置：工作安排文件
	 */
    public String getGongzuoanpaiFile() {
        return gongzuoanpaiFile;
    }


    /**
	 * 获取：工作安排文件
	 */

    public void setGongzuoanpaiFile(String gongzuoanpaiFile) {
        this.gongzuoanpaiFile = gongzuoanpaiFile;
    }
    /**
	 * 设置：安排日期
	 */
    public Date getGongzuoanpaiTime() {
        return gongzuoanpaiTime;
    }


    /**
	 * 获取：安排日期
	 */

    public void setGongzuoanpaiTime(Date gongzuoanpaiTime) {
        this.gongzuoanpaiTime = gongzuoanpaiTime;
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
        return "Gongzuoanpai{" +
            "id=" + id +
            ", gongzuoanpaiName=" + gongzuoanpaiName +
            ", gongzuoanpaiPhoto=" + gongzuoanpaiPhoto +
            ", gongzuoanpaiContent=" + gongzuoanpaiContent +
            ", gongzuoanpaiFile=" + gongzuoanpaiFile +
            ", gongzuoanpaiTime=" + gongzuoanpaiTime +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
