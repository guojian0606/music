package cn.yesway.music.entity;

import cn.yesway.framework.common.entity.base.BaseEntity;
import java.io.Serializable;

/**
 * Music的实体类。
 * 由Code Generator生成。
 *
 * @author Code Generator
 */
public class Music extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * @return 获取名称。
     */
    public String getName() {
        return this.name;
    }

    /**
     * 设置名称。
     *
     * @param name 名称。
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return 获取简介。
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * 设置简介。
     *
     * @param description 简介。
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return 获取封面。
     */
    public String getCover() {
        return this.cover;
    }

    /**
     * 设置封面。
     *
     * @param cover 封面。
     */
    public void setCover(String cover) {
        this.cover = cover;
    }

    /**
     * @return 获取背景介绍。
     */
    public String getProfile() {
        return this.profile;
    }

    /**
     * 设置背景介绍。
     *
     * @param profile 背景介绍。
     */
    public void setProfile(String profile) {
        this.profile = profile;
    }

    /**
     * @return 获取音乐家主键。
     */
    public Long getMusicianId() {
        return this.musicianId;
    }

    /**
     * 设置音乐家主键。
     *
     * @param musicianId 音乐家主键。
     */
    public void setMusicianId(Long musicianId) {
        this.musicianId = musicianId;
    }

    /**
     * @return 获取乐谱。
     */
    public String getMusicSocre() {
        return this.musicSocre;
    }

    /**
     * 设置乐谱。
     *
     * @param musicSocre 乐谱。
     */
    public void setMusicSocre(String musicSocre) {
        this.musicSocre = musicSocre;
    }

    /**
     * 名称。
     */
    private String name;
    /**
     * 简介。
     */
    private String description;
    /**
     * 封面。
     */
    private String cover;
    /**
     * 背景介绍。
     */
    private String profile;
    /**
     * 音乐家主键。
     */
    private Long musicianId;
    /**
     * 乐谱。
     */
    private String musicSocre;

}