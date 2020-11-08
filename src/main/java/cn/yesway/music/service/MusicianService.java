package cn.yesway.music.service;

import cn.yesway.framework.common.entity.page.PageParam;
import cn.yesway.framework.common.entity.page.PageResult;
import cn.yesway.music.entity.Musician;

import java.util.List;

/**
 * Musician的业务处理接口。
 * 由Code Generator动态生成。
 *
 * @author Code Generator
 */
public interface MusicianService {

    /**
     * 创建Musician。
     *
     * @param musician Musician实体类。
     * @return 是否创建成功。
     */
    boolean create(final Musician musician);

    /**
     * 修改Musician。
     *
     * @param musician Musician实体类。
     * @return 是否修改成功。
     */
    boolean update(final Musician musician);

    /**
     * 根据主键删除Musician。
     *
     * @param id Musician主键。
     * @return 是否删除成功。
     */
    boolean deleteById(final String id);

    /**
     * 根据主键批量删除Musician。
     *
     * @param ids Musician主键集合。
     * @return 是否删除成功。
     */
    boolean deleteByIds(final List<String> ids);

    /**
     * 根据主键查找Musician。
     *
     * @param id Musician主键。
     * @return Musician信息。
     */
    Musician findById(final String id);

    /**
     * 根据主键批量查找Musician。
     *
     * @param ids Musician主键。
     * @return Musician信息集合。
     */
    List<Musician> findByIds(final List<String> ids);

    /**
     * 根据条件查询Musician。
     *
     * @param musician 查询条件。
     * @return Musician信息集合。
     */
    List<Musician> findByCondition(final Musician musician);

    /**
     * 查询全部Musician。
     *
     * @return Musician信息集合。
     */
    List<Musician> findAll();

    /**
     * 根据条件分页查询Musician。
     *
     * @param musician 查询条件。
     * @param pageParam 分页信息。
     * @return 分页后的Musician信息集合。
     */
    PageResult<Musician> findByConditionAndPage(final Musician musician, final PageParam pageParam);

}