package com.entity.vo;

import com.entity.KaibiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 开闭幕式信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("kaibi")
public class KaibiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "kaibi_time")
    private Date kaibiTime;


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
