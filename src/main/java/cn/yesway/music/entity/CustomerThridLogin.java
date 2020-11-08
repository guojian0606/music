package cn.yesway.music.entity;

import cn.yesway.framework.common.entity.base.BaseEntity;
import java.io.Serializable;

/**
 * CustomerThridLogin的实体类。
 * 由Code Generator生成。
 *
 * @author Code Generator
 */
public class CustomerThridLogin extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * @return 获取第三方登录标识。
     */
    public String getOpenId() {
        return this.openId;
    }

    /**
     * 设置第三方登录标识。
     *
     * @param openId 第三方登录标识。
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }

    /**
     * @return 获取第三方类型。
     */
    public Byte getType() {
        return this.type;
    }

    /**
     * 设置第三方类型。
     *
     * @param type 第三方类型。
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * 第三方登录标识。
     */
    private String openId;
    /**
     * 第三方类型。
     */
    private Byte type;

}