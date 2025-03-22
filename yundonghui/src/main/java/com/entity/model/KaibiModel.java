package com.entity.model;

import com.entity.KaibiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 开闭幕式信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KaibiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 开闭幕式名称
     */
    private String kaibiName;


    /**
     * 开闭幕式图片
     */
    private String kaibiPhoto;


    /**
     * 视频
     */
    private String kaibiVideo;


    /**
     * 开闭幕式
     */
    private Integer kaibiTypes;


    /**
     * 开闭幕式详情
     */
    private String kaibiContent;


    /**
     * 开闭幕式文件
     */
    private String kaibiFile;


    /**
     * 安排日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date kaibiTime;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：开闭幕式名称
	 */
    public String getKaibiName() {
        return kaibiName;
    }


    /**
	 * 设置：开闭幕式名称
	 */
    public void setKaibiName(String kaibiName) {
        this.kaibiName = kaibiName;
    }
    /**
	 * 获取：开闭幕式图片
	 */
    public String getKaibiPhoto() {
        return kaibiPhoto;
    }


    /**
	 * 设置：开闭幕式图片
	 */
    public void setKaibiPhoto(String kaibiPhoto) {
        this.kaibiPhoto = kaibiPhoto;
    }
    /**
	 * 获取：视频
	 */
    public String getKaibiVideo() {
        return kaibiVideo;
    }


    /**
	 * 设置：视频
	 */
    public void setKaibiVideo(String kaibiVideo) {
        this.kaibiVideo = kaibiVideo;
    }
    /**
	 * 获取：开闭幕式
	 */
    public Integer getKaibiTypes() {
        return kaibiTypes;
    }


    /**
	 * 设置：开闭幕式
	 */
    public void setKaibiTypes(Integer kaibiTypes) {
        this.kaibiTypes = kaibiTypes;
    }
    /**
	 * 获取：开闭幕式详情
	 */
    public String getKaibiContent() {
        return kaibiContent;
    }


    /**
	 * 设置：开闭幕式详情
	 */
    public void setKaibiContent(String kaibiContent) {
        this.kaibiContent = kaibiContent;
    }
    /**
	 * 获取：开闭幕式文件
	 */
    public String getKaibiFile() {
        return kaibiFile;
    }


    /**
	 * 设置：开闭幕式文件
	 */
    public void setKaibiFile(String kaibiFile) {
        this.kaibiFile = kaibiFile;
    }
    /**
	 * 获取：安排日期
	 */
    public Date getKaibiTime() {
        return kaibiTime;
    }


    /**
	 * 设置：安排日期
	 */
    public void setKaibiTime(Date kaibiTime) {
        this.kaibiTime = kaibiTime;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
