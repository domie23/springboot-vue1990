package com.entity.model;

import com.entity.SaishibianpaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 赛事编排信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class SaishibianpaiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 赛事编排名称
     */
    private String saishibianpaiName;


    /**
     * 赛事编排图片
     */
    private String saishibianpaiPhoto;


    /**
     * 赛事编排详情
     */
    private String saishibianpaiContent;


    /**
     * 赛事编排文件
     */
    private String saishibianpaiFile;


    /**
     * 赛事编排地址
     */
    private String saishibianpaiAddress;


    /**
     * 各院系参赛人数
     */
    private String saishibianpaiCansaiContent;


    /**
     * 编排日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date saishibianpaiTime;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 获取：赛事编排名称
	 */
    public String getSaishibianpaiName() {
        return saishibianpaiName;
    }


    /**
	 * 设置：赛事编排名称
	 */
    public void setSaishibianpaiName(String saishibianpaiName) {
        this.saishibianpaiName = saishibianpaiName;
    }
    /**
	 * 获取：赛事编排图片
	 */
    public String getSaishibianpaiPhoto() {
        return saishibianpaiPhoto;
    }


    /**
	 * 设置：赛事编排图片
	 */
    public void setSaishibianpaiPhoto(String saishibianpaiPhoto) {
        this.saishibianpaiPhoto = saishibianpaiPhoto;
    }
    /**
	 * 获取：赛事编排详情
	 */
    public String getSaishibianpaiContent() {
        return saishibianpaiContent;
    }


    /**
	 * 设置：赛事编排详情
	 */
    public void setSaishibianpaiContent(String saishibianpaiContent) {
        this.saishibianpaiContent = saishibianpaiContent;
    }
    /**
	 * 获取：赛事编排文件
	 */
    public String getSaishibianpaiFile() {
        return saishibianpaiFile;
    }


    /**
	 * 设置：赛事编排文件
	 */
    public void setSaishibianpaiFile(String saishibianpaiFile) {
        this.saishibianpaiFile = saishibianpaiFile;
    }
    /**
	 * 获取：赛事编排地址
	 */
    public String getSaishibianpaiAddress() {
        return saishibianpaiAddress;
    }


    /**
	 * 设置：赛事编排地址
	 */
    public void setSaishibianpaiAddress(String saishibianpaiAddress) {
        this.saishibianpaiAddress = saishibianpaiAddress;
    }
    /**
	 * 获取：各院系参赛人数
	 */
    public String getSaishibianpaiCansaiContent() {
        return saishibianpaiCansaiContent;
    }


    /**
	 * 设置：各院系参赛人数
	 */
    public void setSaishibianpaiCansaiContent(String saishibianpaiCansaiContent) {
        this.saishibianpaiCansaiContent = saishibianpaiCansaiContent;
    }
    /**
	 * 获取：编排日期
	 */
    public Date getSaishibianpaiTime() {
        return saishibianpaiTime;
    }


    /**
	 * 设置：编排日期
	 */
    public void setSaishibianpaiTime(Date saishibianpaiTime) {
        this.saishibianpaiTime = saishibianpaiTime;
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
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
