package cn.yesway.music.entity;

import cn.yesway.framework.common.entity.base.BaseEntity;
import java.io.Serializable;

/**
 * Customer的实体类。
 * 由Code Generator生成。
 *
 * @author Code Generator
 */
public class Customer extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * @return 获取手机号。
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * 设置手机号。
     *
     * @param phoneNumber 手机号。
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return 获取生日。
     */
    public java.util.Date getBirthday() {
        return this.birthday == null ? null : (java.util.Date) this.birthday.clone();
    }

    /**
     * 设置生日。
     *
     * @param birthday 生日。
     */
    public void setBirthday(java.util.Date birthday) {
        this.birthday = (birthday == null ? null : (java.util.Date) birthday.clone());
    }

    /**
     * @return 获取性别。
     */
    public Byte getGender() {
        return this.gender;
    }

    /**
     * 设置性别。
     *
     * @param gender 性别。
     */
    public void setGender(Byte gender) {
        this.gender = gender;
    }

    /**
     * @return 获取昵称。
     */
    public String getNickName() {
        return this.nickName;
    }

    /**
     * 设置昵称。
     *
     * @param nickName 昵称。
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * @return 获取头像。
     */
    public String getAvatar() {
        return this.avatar;
    }

    /**
     * 设置头像。
     *
     * @param avatar 头像。
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * @return 获取最后登录时间。
     */
    public java.util.Date getLoginTime() {
        return this.loginTime == null ? null : (java.util.Date) this.loginTime.clone();
    }

    /**
     * 设置最后登录时间。
     *
     * @param loginTime 最后登录时间。
     */
    public void setLoginTime(java.util.Date loginTime) {
        this.loginTime = (loginTime == null ? null : (java.util.Date) loginTime.clone());
    }

    /**
     * 手机号。
     */
    private String phoneNumber;
    /**
     * 生日。
     */
    private java.util.Date birthday;
    /**
     * 性别。
     */
    private Byte gender;
    /**
     * 昵称。
     */
    private String nickName;
    /**
     * 头像。
     */
    private String avatar;
    /**
     * 最后登录时间。
     */
    private java.util.Date loginTime;

}