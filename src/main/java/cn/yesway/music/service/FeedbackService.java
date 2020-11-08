package cn.yesway.music.service;

import cn.yesway.framework.common.entity.page.PageParam;
import cn.yesway.framework.common.entity.page.PageResult;
import cn.yesway.music.entity.Feedback;

import java.util.List;

/**
 * Feedback的业务处理接口。
 * 由Code Generator动态生成。
 *
 * @author Code Generator
 */
public interface FeedbackService {

    /**
     * 创建Feedback。
     *
     * @param feedback Feedback实体类。
     * @return 是否创建成功。
     */
    boolean create(final Feedback feedback);

    /**
     * 修改Feedback。
     *
     * @param feedback Feedback实体类。
     * @return 是否修改成功。
     */
    boolean update(final Feedback feedback);

    /**
     * 根据主键删除Feedback。
     *
     * @param id Feedback主键。
     * @return 是否删除成功。
     */
    boolean deleteById(final String id);

    /**
     * 根据主键批量删除Feedback。
     *
     * @param ids Feedback主键集合。
     * @return 是否删除成功。
     */
    boolean deleteByIds(final List<String> ids);

    /**
     * 根据主键查找Feedback。
     *
     * @param id Feedback主键。
     * @return Feedback信息。
     */
    Feedback findById(final String id);

    /**
     * 根据主键批量查找Feedback。
     *
     * @param ids Feedback主键。
     * @return Feedback信息集合。
     */
    List<Feedback> findByIds(final List<String> ids);

    /**
     * 根据条件查询Feedback。
     *
     * @param feedback 查询条件。
     * @return Feedback信息集合。
     */
    List<Feedback> findByCondition(final Feedback feedback);

    /**
     * 查询全部Feedback。
     *
     * @return Feedback信息集合。
     */
    List<Feedback> findAll();

    /**
     * 根据条件分页查询Feedback。
     *
     * @param feedback 查询条件。
     * @param pageParam 分页信息。
     * @return 分页后的Feedback信息集合。
     */
    PageResult<Feedback> findByConditionAndPage(final Feedback feedback, final PageParam pageParam);

}