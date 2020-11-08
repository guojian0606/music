package cn.yesway.music.entity;

import cn.yesway.framework.common.entity.base.BaseEntity;
import java.io.Serializable;

/**
 * Exercise的实体类。
 * 由Code Generator生成。
 *
 * @author Code Generator
 */
public class Exercise extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * @return 获取练习人。
     */
    public Long getCustomerId() {
        return this.customerId;
    }

    /**
     * 设置练习人。
     *
     * @param customerId 练习人。
     */
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    /**
     * @return 获取练习音乐。
     */
    public Long getMusicId() {
        return this.musicId;
    }

    /**
     * 设置练习音乐。
     *
     * @param musicId 练习音乐。
     */
    public void setMusicId(Long musicId) {
        this.musicId = musicId;
    }

    /**
     * 练习人。
     */
    private Long customerId;
    /**
     * 练习音乐。
     */
    private Long musicId;

}