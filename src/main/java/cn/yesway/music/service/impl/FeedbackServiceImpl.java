package cn.yesway.music.service.impl;

import cn.yesway.music.repository.FeedbackRepository;
import cn.yesway.music.repository.FeedbackExtRepository;
import cn.yesway.music.service.FeedbackService;
import cn.yesway.music.entity.Feedback;
import cn.yesway.music.entity.FeedbackCondition;

import cn.yesway.framework.common.entity.page.PageParam;
import cn.yesway.framework.common.entity.page.PageResult;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Feedback的业务处理接口。
 * 由Code Generator动态生成。
 *
 * @author Code Generator
 */
@Service("feedbackService")
public class FeedbackServiceImpl implements FeedbackService {

    /**
     * 创建Feedback。
     *
     * @param feedback Feedback实体类。
     * @return 是否创建成功。
     */
    @Override
    public boolean create(final Feedback feedback) {
        return feedbackRepository.insertSelective(feedback) > 0;
    }

    /**
     * 修改Feedback。
     *
     * @param feedback Feedback实体类。
     * @return 是否修改成功。
     */
    @Override
    public boolean update(final Feedback feedback) {
        return feedbackRepository.updateByPrimaryKeySelective(feedback) > 0;
    }

    /**
     * 根据主键删除Feedback。
     *
     * @param id Feedback主键。
     * @return 是否删除成功。
     */
    @Override
    public boolean deleteById(final String id) {
        return feedbackRepository.deleteByPrimaryKey(id) > 0;
    }

    /**
     * 根据主键批量删除Feedback。
     *
     * @param ids Feedback主键集合。
     * @return 是否删除成功。
     */
    @Override
    public boolean deleteByIds(final List<String> ids) {
        return feedbackRepository.deleteByPrimaryKeys(ids.toArray(new String[0])) > 0;
    }

    /**
     * 根据主键查找Feedback。
     *
     * @param id Feedback主键。
     * @return Feedback信息。
     */
    @Override
    public Feedback findById(final String id) {
        return feedbackRepository.selectByPrimaryKey(id);
    }

    /**
     * 根据主键批量查找Feedback。
     *
     * @param ids Feedback主键。
     * @return Feedback信息集合。
     */
    @Override
    public List<Feedback> findByIds(final List<String> ids) {
        return feedbackRepository.selectByPrimaryKeys(ids.toArray(new String[0]));
    }

    /**
     * 查询全部Feedback。
     *
     * @return Feedback信息集合。
     */
    @Override
    public List<Feedback> findAll() {
        final FeedbackCondition condition = new FeedbackCondition();
        return feedbackRepository.selectByCondition(condition);
    }

    /**
     * 根据条件查询Feedback。
     *
     * @param feedback 查询条件。
     * @return Feedback信息集合。
     */
    @Override
    public List<Feedback> findByCondition(final Feedback feedback) {
        final FeedbackCondition condition = new FeedbackCondition();
        return feedbackRepository.selectByCondition(condition);
    }

    /**
     * 根据条件分页查询Feedback。
     *
     * @param feedback 查询条件。
     * @param pageParam 分页信息。
     * @return 分页后的Feedback信息集合。
     */
    @Override
    public PageResult<Feedback> findByConditionAndPage(final Feedback feedback, final PageParam pageParam) {
        final FeedbackCondition condition = new FeedbackCondition();
        return feedbackRepository.selectByConditionAndPage(condition, pageParam);
    }

    /**
     * 自动装配Feedback的数据访问接口。
     *
     * @param feedbackRepository Feedback的数据访问接口。
     */
    @Autowired
    public void setFeedbackRepository(FeedbackRepository feedbackRepository) {
        this.feedbackRepository = feedbackRepository;
    }

    /**
     * 自动装配Feedback的扩展数据访问接口。
     *
     * @param feedbackExtRepository Feedback的扩展数据访问接口。
     */
    @Autowired
    public void setFeedbackExtRepository(FeedbackExtRepository feedbackExtRepository) {
        this.feedbackExtRepository = feedbackExtRepository;
    }

    /**
     * Feedback的数据访问接口。
     */
    private FeedbackRepository feedbackRepository;
    /**
     * Feedback的扩展数据访问接口。
     */
    private FeedbackExtRepository feedbackExtRepository;

}