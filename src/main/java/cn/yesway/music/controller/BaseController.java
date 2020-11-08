package cn.yesway.music.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 所有业务Controller的父类。
 *
 * @author xuepeng
 */
@RestController
public class BaseController {

    /**
     * HttpServletRequest。
     */
    private HttpServletRequest httpServletRequest;

    /**
     * @return 获取HttpServletRequest。
     */
    public HttpServletRequest getHttpServletRequest() {
        return httpServletRequest;
    }

    /**
     * 设置HttpServletRequest。
     *
     * @param httpServletRequest HttpServletRequest。
     */
    @Autowired
    public void setHttpServletRequest(HttpServletRequest httpServletRequest) {
        this.httpServletRequest = httpServletRequest;
    }

}
