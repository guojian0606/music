package cn.yesway.music.service;

import cn.yesway.framework.common.entity.page.PageParam;
import cn.yesway.framework.common.entity.page.PageResult;
import cn.yesway.music.entity.Favorite;

import java.util.List;

/**
 * Favorite的业务处理接口。
 * 由Code Generator动态生成。
 *
 * @author Code Generator
 */
public interface FavoriteService {

    /**
     * 创建Favorite。
     *
     * @param favorite Favorite实体类。
     * @return 是否创建成功。
     */
    boolean create(final Favorite favorite);

    /**
     * 修改Favorite。
     *
     * @param favorite Favorite实体类。
     * @return 是否修改成功。
     */
    boolean update(final Favorite favorite);

    /**
     * 根据主键删除Favorite。
     *
     * @param id Favorite主键。
     * @return 是否删除成功。
     */
    boolean deleteById(final String id);

    /**
     * 根据主键批量删除Favorite。
     *
     * @param ids Favorite主键集合。
     * @return 是否删除成功。
     */
    boolean deleteByIds(final List<String> ids);

    /**
     * 根据主键查找Favorite。
     *
     * @param id Favorite主键。
     * @return Favorite信息。
     */
    Favorite findById(final String id);

    /**
     * 根据主键批量查找Favorite。
     *
     * @param ids Favorite主键。
     * @return Favorite信息集合。
     */
    List<Favorite> findByIds(final List<String> ids);

    /**
     * 根据条件查询Favorite。
     *
     * @param favorite 查询条件。
     * @return Favorite信息集合。
     */
    List<Favorite> findByCondition(final Favorite favorite);

    /**
     * 查询全部Favorite。
     *
     * @return Favorite信息集合。
     */
    List<Favorite> findAll();

    /**
     * 根据条件分页查询Favorite。
     *
     * @param favorite 查询条件。
     * @param pageParam 分页信息。
     * @return 分页后的Favorite信息集合。
     */
    PageResult<Favorite> findByConditionAndPage(final Favorite favorite, final PageParam pageParam);

}