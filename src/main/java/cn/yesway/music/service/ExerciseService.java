package cn.yesway.music.service;

import cn.yesway.framework.common.entity.page.PageParam;
import cn.yesway.framework.common.entity.page.PageResult;
import cn.yesway.music.entity.Exercise;

import java.util.List;

/**
 * Exercise的业务处理接口。
 * 由Code Generator动态生成。
 *
 * @author Code Generator
 */
public interface ExerciseService {

    /**
     * 创建Exercise。
     *
     * @param exercise Exercise实体类。
     * @return 是否创建成功。
     */
    boolean create(final Exercise exercise);

    /**
     * 修改Exercise。
     *
     * @param exercise Exercise实体类。
     * @return 是否修改成功。
     */
    boolean update(final Exercise exercise);

    /**
     * 根据主键删除Exercise。
     *
     * @param id Exercise主键。
     * @return 是否删除成功。
     */
    boolean deleteById(final String id);

    /**
     * 根据主键批量删除Exercise。
     *
     * @param ids Exercise主键集合。
     * @return 是否删除成功。
     */
    boolean deleteByIds(final List<String> ids);

    /**
     * 根据主键查找Exercise。
     *
     * @param id Exercise主键。
     * @return Exercise信息。
     */
    Exercise findById(final String id);

    /**
     * 根据主键批量查找Exercise。
     *
     * @param ids Exercise主键。
     * @return Exercise信息集合。
     */
    List<Exercise> findByIds(final List<String> ids);

    /**
     * 根据条件查询Exercise。
     *
     * @param exercise 查询条件。
     * @return Exercise信息集合。
     */
    List<Exercise> findByCondition(final Exercise exercise);

    /**
     * 查询全部Exercise。
     *
     * @return Exercise信息集合。
     */
    List<Exercise> findAll();

    /**
     * 根据条件分页查询Exercise。
     *
     * @param exercise 查询条件。
     * @param pageParam 分页信息。
     * @return 分页后的Exercise信息集合。
     */
    PageResult<Exercise> findByConditionAndPage(final Exercise exercise, final PageParam pageParam);

}