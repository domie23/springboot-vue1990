package com.entity.model;

import com.entity.GongzuoanpaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 工作安排信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GongzuoanpaiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 工作安排名称
     */
    private String gongzuoanpaiName;


    /**
     * 工作安排图片
     */
    private String gongzuoanpaiPhoto;


    /**
     * 工作安排详情
     */
    private String gongzuoanpaiContent;


    /**
     * 工作安排文件
     */
    private String gongzuoanpaiFile;


    /**
     * 安排日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date gongzuoanpaiTime;


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
	 * 获取：工作安排名称
	 */
    public String getGongzuoanpaiName() {
        return gongzuoanpaiName;
    }


    /**
	 * 设置：工作安排名称
	 */
    public void setGongzuoanpaiName(String gongzuoanpaiName) {
        this.gongzuoanpaiName = gongzuoanpaiName;
    }
    /**
	 * 获取：工作安排图片
	 */
    public String getGongzuoanpaiPhoto() {
        return gongzuoanpaiPhoto;
    }


    /**
	 * 设置：工作安排图片
	 */
    public void setGongzuoanpaiPhoto(String gongzuoanpaiPhoto) {
        this.gongzuoanpaiPhoto = gongzuoanpaiPhoto;
    }
    /**
	 * 获取：工作安排详情
	 */
    public String getGongzuoanpaiContent() {
        return gongzuoanpaiContent;
    }


    /**
	 * 设置：工作安排详情
	 */
    public void setGongzuoanpaiContent(String gongzuoanpaiContent) {
        this.gongzuoanpaiContent = gongzuoanpaiContent;
    }
    /**
	 * 获取：工作安排文件
	 */
    public String getGongzuoanpaiFile() {
        return gongzuoanpaiFile;
    }


    /**
	 * 设置：工作安排文件
	 */
    public void setGongzuoanpaiFile(String gongzuoanpaiFile) {
        this.gongzuoanpaiFile = gongzuoanpaiFile;
    }
    /**
	 * 获取：安排日期
	 */
    public Date getGongzuoanpaiTime() {
        return gongzuoanpaiTime;
    }


    /**
	 * 设置：安排日期
	 */
    public void setGongzuoanpaiTime(Date gongzuoanpaiTime) {
        this.gongzuoanpaiTime = gongzuoanpaiTime;
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
