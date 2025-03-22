package com.entity.vo;

import com.entity.SaishibianpaiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 赛事编排信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("saishibianpai")
public class SaishibianpaiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "saishibianpai_time")
    private Date saishibianpaiTime;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
