package com.entity.model;

import com.entity.CaipanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 裁判
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class CaipanModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 账户
     */
    private String username;


    /**
     * 密码
     */
    private String password;


    /**
     * 裁判姓名
     */
    private String caipanName;


    /**
     * 裁判手机号
     */
    private String caipanPhone;


    /**
     * 裁判身份证号
     */
    private String caipanIdNumber;


    /**
     * 裁判头像
     */
    private String caipanPhoto;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 电子邮箱
     */
    private String caipanEmail;


    /**
     * 创建时间
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
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 设置：账户
	 */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 设置：密码
	 */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：裁判姓名
	 */
    public String getCaipanName() {
        return caipanName;
    }


    /**
	 * 设置：裁判姓名
	 */
    public void setCaipanName(String caipanName) {
        this.caipanName = caipanName;
    }
    /**
	 * 获取：裁判手机号
	 */
    public String getCaipanPhone() {
        return caipanPhone;
    }


    /**
	 * 设置：裁判手机号
	 */
    public void setCaipanPhone(String caipanPhone) {
        this.caipanPhone = caipanPhone;
    }
    /**
	 * 获取：裁判身份证号
	 */
    public String getCaipanIdNumber() {
        return caipanIdNumber;
    }


    /**
	 * 设置：裁判身份证号
	 */
    public void setCaipanIdNumber(String caipanIdNumber) {
        this.caipanIdNumber = caipanIdNumber;
    }
    /**
	 * 获取：裁判头像
	 */
    public String getCaipanPhoto() {
        return caipanPhoto;
    }


    /**
	 * 设置：裁判头像
	 */
    public void setCaipanPhoto(String caipanPhoto) {
        this.caipanPhoto = caipanPhoto;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：电子邮箱
	 */
    public String getCaipanEmail() {
        return caipanEmail;
    }


    /**
	 * 设置：电子邮箱
	 */
    public void setCaipanEmail(String caipanEmail) {
        this.caipanEmail = caipanEmail;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
