package cn.yesway.music.controller;

import cn.yesway.framework.common.entity.http.DefaultHttpResultFactory;
import cn.yesway.framework.common.entity.http.HttpResult;
import cn.yesway.framework.common.entity.page.PageParam;
import cn.yesway.framework.common.entity.page.PageResult;
import cn.yesway.framework.common.util.bean.BeanUtil;
import cn.yesway.music.bean.request.FeedbackQueryRequestBean;
import cn.yesway.music.entity.Feedback;
import cn.yesway.music.service.FeedbackService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Feedback的控制器类。
 *
 * @author Code Generator
 */
@RestController
@RequestMapping("/v1/feedbacks")
@Slf4j
public class FeedbackController extends BaseController {

    /**
     * Feedback的业务处理接口。
     */
    private FeedbackService feedbackService;

    /**
     * 自动装配Feedback的业务处理接口。
     *
     * @param feedbackService Feedback的业务处理接口。
     */
    @Autowired
    public void setFeedbackService(FeedbackService feedbackService) {
        this.feedbackService = feedbackService;
    }

    /**
     * 创建Feedback。
     *
     * @param feedback Feedback的请求实体类。
     * @return 是否创建成功。
     */
    @PostMapping("/v1")
    public HttpResult<Boolean> create(@Valid @RequestBody final Feedback feedback) {
        if (feedbackService.create(feedback)) {
            return DefaultHttpResultFactory.success("创建Feedback成功。", Boolean.TRUE);
        }
        return DefaultHttpResultFactory.fail("创建Feedback失败。", Boolean.FALSE);
    }

    /**
     * 修改Feedback。
     *
     * @param feedback Feedback的请求实体类。
     * @return 是否修改成功。
     */
    @PutMapping("/v1")
    public HttpResult<Boolean> update(@Valid @RequestBody final Feedback feedback) {
        if (feedbackService.update(feedback)) {
            return DefaultHttpResultFactory.success("修改Feedback成功。", Boolean.TRUE);
        }
        return DefaultHttpResultFactory.fail("修改Feedback失败。", Boolean.FALSE);
    }

    /**
     * 根据主键删除Feedback信息。
     *
     * @param id Feedback主键。
     * @return 是否删除成功。
     */
    @DeleteMapping("/v1/{id}")
    public HttpResult<Boolean> deleteById(@NotNull @PathVariable(value = "id") final String id) {
        if (feedbackService.deleteById(id)) {
            return DefaultHttpResultFactory.success("删除Feedback成功。", Boolean.TRUE);
        }
        return DefaultHttpResultFactory.fail("删除Feedback失败。", Boolean.TRUE);
    }

    /**
     * 根据主键批量删除Feedback信息。
     *
     * @param ids Feedback主键集合。
     * @return 是否删除成功。
     */
    @DeleteMapping("/v1")
    public HttpResult<Boolean> deleteByIds(@NotNull @RequestBody final List<String> ids) {
        if (feedbackService.deleteByIds(ids)) {
            return DefaultHttpResultFactory.success("批量删除Feedback成功。", Boolean.TRUE);
        }
        return DefaultHttpResultFactory.fail("批量删除Feedback失败。", Boolean.TRUE);
    }

    /**
     * 根据主键查询Feedback信息。
     *
     * @param id Feedback主键。
     * @return Feedback信息。
     */
    @GetMapping("/v1/{id}")
    public HttpResult<Feedback> findById(@NotNull @PathVariable(value = "id") final String id) {
        Feedback result = feedbackService.findById(id);
        return DefaultHttpResultFactory.success("根据主键查询Feedback成功。", result);
    }

    /**
     * 根据主键批量查询Feedback信息。
     *
     * @param ids Feedback主键集合。
     * @return Feedback信息集合。
     */
    @PostMapping("/v1/ids")
    public HttpResult<List<Feedback>> findByIds(@NotNull @RequestBody final List<String> ids) {
        List<Feedback> result = feedbackService.findByIds(ids);
        return DefaultHttpResultFactory.success("根据主键批量查询Feedback成功。", result);
    }

    /**
     * @return 查询全部Feedback>信息。
     */
    @GetMapping("/v1")
    public HttpResult<List<Feedback>> findAll() {
        final List<Feedback> result = feedbackService.findAll();
        return DefaultHttpResultFactory.success("查询全部Feedback。", result);
    }

    /**
     * 根据条件分页查询Feedback信息。
     *
     * @param feedbackQueryRequestBean Feedback信息查询RequestBean。
     * @return Feedback信息集合。
     */
    @PostMapping("/v1/conditions")
    public HttpResult<PageResult<Feedback>> findByPageAndCondition(@RequestBody final FeedbackQueryRequestBean feedbackQueryRequestBean) {
        Feedback query = BeanUtil.objToObj(feedbackQueryRequestBean, Feedback.class);
        PageParam page = feedbackQueryRequestBean.getPage();
        final PageResult<Feedback> result = feedbackService.findByConditionAndPage(query, page);
        return DefaultHttpResultFactory.success("根据条件分页查询Feedback成功。", result);
    }

}
