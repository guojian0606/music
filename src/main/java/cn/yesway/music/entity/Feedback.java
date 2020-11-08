package cn.yesway.music.entity;

import cn.yesway.framework.common.entity.base.BaseEntity;
import java.io.Serializable;

/**
 * Feedback的实体类。
 * 由Code Generator生成。
 *
 * @author Code Generator
 */
public class Feedback extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * @return 获取反馈人。
     */
    public Long getCustomerId() {
        return this.customerId;
    }

    /**
     * 设置反馈人。
     *
     * @param customerId 反馈人。
     */
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    /**
     * @return 获取反馈内容。
     */
    public String getContent() {
        return this.content;
    }

    /**
     * 设置反馈内容。
     *
     * @param content 反馈内容。
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 反馈人。
     */
    private Long customerId;
    /**
     * 反馈内容。
     */
    private String content;

}