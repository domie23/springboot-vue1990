package com.entity.vo;

import com.entity.GongzuoanpaiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 工作安排信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("gongzuoanpai")
public class GongzuoanpaiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "gongzuoanpai_time")
    private Date gongzuoanpaiTime;


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
