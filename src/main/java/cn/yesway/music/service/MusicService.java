package cn.yesway.music.service;

import cn.yesway.framework.common.entity.page.PageParam;
import cn.yesway.framework.common.entity.page.PageResult;
import cn.yesway.music.entity.Music;

import java.util.List;

/**
 * Music的业务处理接口。
 * 由Code Generator动态生成。
 *
 * @author Code Generator
 */
public interface MusicService {

    /**
     * 创建Music。
     *
     * @param music Music实体类。
     * @return 是否创建成功。
     */
    boolean create(final Music music);

    /**
     * 修改Music。
     *
     * @param music Music实体类。
     * @return 是否修改成功。
     */
    boolean update(final Music music);

    /**
     * 根据主键删除Music。
     *
     * @param id Music主键。
     * @return 是否删除成功。
     */
    boolean deleteById(final String id);

    /**
     * 根据主键批量删除Music。
     *
     * @param ids Music主键集合。
     * @return 是否删除成功。
     */
    boolean deleteByIds(final List<String> ids);

    /**
     * 根据主键查找Music。
     *
     * @param id Music主键。
     * @return Music信息。
     */
    Music findById(final String id);

    /**
     * 根据主键批量查找Music。
     *
     * @param ids Music主键。
     * @return Music信息集合。
     */
    List<Music> findByIds(final List<String> ids);

    /**
     * 根据条件查询Music。
     *
     * @param music 查询条件。
     * @return Music信息集合。
     */
    List<Music> findByCondition(final Music music);

    /**
     * 查询全部Music。
     *
     * @return Music信息集合。
     */
    List<Music> findAll();

    /**
     * 根据条件分页查询Music。
     *
     * @param music 查询条件。
     * @param pageParam 分页信息。
     * @return 分页后的Music信息集合。
     */
    PageResult<Music> findByConditionAndPage(final Music music, final PageParam pageParam);

}