package cn.yesway.music.bean.request;

import cn.yesway.framework.common.entity.page.PageParam;
import lombok.Data;

@Data
public class CustomerQueryRequestBean {

    /**
     * 分页信息。
     */
    private PageParam page;

}
