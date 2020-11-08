package cn.yesway.music.entity;

import cn.yesway.framework.common.entity.base.BaseEntity;
import java.io.Serializable;

/**
 * Musician的实体类。
 * 由Code Generator生成。
 *
 * @author Code Generator
 */
public class Musician extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * @return 获取中文名。
     */
    public String getChineseName() {
        return this.chineseName;
    }

    /**
     * 设置中文名。
     *
     * @param chineseName 中文名。
     */
    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }

    /**
     * @return 获取英文名。
     */
    public String getEnglishName() {
        return this.englishName;
    }

    /**
     * 设置英文名。
     *
     * @param englishName 英文名。
     */
    public void setEnglishName(String englishName) {
        this.englishName = englishName;
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
     * @return 获取人物简介。
     */
    public String getProfile() {
        return this.profile;
    }

    /**
     * 设置人物简介。
     *
     * @param profile 人物简介。
     */
    public void setProfile(String profile) {
        this.profile = profile;
    }

    /**
     * 中文名。
     */
    private String chineseName;
    /**
     * 英文名。
     */
    private String englishName;
    /**
     * 头像。
     */
    private String avatar;
    /**
     * 人物简介。
     */
    private String profile;

}