package cn.yesway.music.entity;

import cn.yesway.framework.common.entity.base.BaseEntity;
import java.io.Serializable;

/**
 * Favorite的实体类。
 * 由Code Generator生成。
 *
 * @author Code Generator
 */
public class Favorite extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * @return 获取搜藏人。
     */
    public Long getCustomerId() {
        return this.customerId;
    }

    /**
     * 设置搜藏人。
     *
     * @param customerId 搜藏人。
     */
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    /**
     * @return 获取音乐。
     */
    public Long getMusicId() {
        return this.musicId;
    }

    /**
     * 设置音乐。
     *
     * @param musicId 音乐。
     */
    public void setMusicId(Long musicId) {
        this.musicId = musicId;
    }

    /**
     * 搜藏人。
     */
    private Long customerId;
    /**
     * 音乐。
     */
    private Long musicId;

}