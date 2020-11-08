package cn.yesway.music.service.impl;

import cn.yesway.music.repository.ExerciseRepository;
import cn.yesway.music.repository.ExerciseExtRepository;
import cn.yesway.music.service.ExerciseService;
import cn.yesway.music.entity.Exercise;
import cn.yesway.music.entity.ExerciseCondition;

import cn.yesway.framework.common.entity.page.PageParam;
import cn.yesway.framework.common.entity.page.PageResult;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Exercise的业务处理接口。
 * 由Code Generator动态生成。
 *
 * @author Code Generator
 */
@Service("exerciseService")
public class ExerciseServiceImpl implements ExerciseService {

    /**
     * 创建Exercise。
     *
     * @param exercise Exercise实体类。
     * @return 是否创建成功。
     */
    @Override
    public boolean create(final Exercise exercise) {
        return exerciseRepository.insertSelective(exercise) > 0;
    }

    /**
     * 修改Exercise。
     *
     * @param exercise Exercise实体类。
     * @return 是否修改成功。
     */
    @Override
    public boolean update(final Exercise exercise) {
        return exerciseRepository.updateByPrimaryKeySelective(exercise) > 0;
    }

    /**
     * 根据主键删除Exercise。
     *
     * @param id Exercise主键。
     * @return 是否删除成功。
     */
    @Override
    public boolean deleteById(final String id) {
        return exerciseRepository.deleteByPrimaryKey(id) > 0;
    }

    /**
     * 根据主键批量删除Exercise。
     *
     * @param ids Exercise主键集合。
     * @return 是否删除成功。
     */
    @Override
    public boolean deleteByIds(final List<String> ids) {
        return exerciseRepository.deleteByPrimaryKeys(ids.toArray(new String[0])) > 0;
    }

    /**
     * 根据主键查找Exercise。
     *
     * @param id Exercise主键。
     * @return Exercise信息。
     */
    @Override
    public Exercise findById(final String id) {
        return exerciseRepository.selectByPrimaryKey(id);
    }

    /**
     * 根据主键批量查找Exercise。
     *
     * @param ids Exercise主键。
     * @return Exercise信息集合。
     */
    @Override
    public List<Exercise> findByIds(final List<String> ids) {
        return exerciseRepository.selectByPrimaryKeys(ids.toArray(new String[0]));
    }

    /**
     * 查询全部Exercise。
     *
     * @return Exercise信息集合。
     */
    @Override
    public List<Exercise> findAll() {
        final ExerciseCondition condition = new ExerciseCondition();
        return exerciseRepository.selectByCondition(condition);
    }

    /**
     * 根据条件查询Exercise。
     *
     * @param exercise 查询条件。
     * @return Exercise信息集合。
     */
    @Override
    public List<Exercise> findByCondition(final Exercise exercise) {
        final ExerciseCondition condition = new ExerciseCondition();
        return exerciseRepository.selectByCondition(condition);
    }

    /**
     * 根据条件分页查询Exercise。
     *
     * @param exercise 查询条件。
     * @param pageParam 分页信息。
     * @return 分页后的Exercise信息集合。
     */
    @Override
    public PageResult<Exercise> findByConditionAndPage(final Exercise exercise, final PageParam pageParam) {
        final ExerciseCondition condition = new ExerciseCondition();
        return exerciseRepository.selectByConditionAndPage(condition, pageParam);
    }

    /**
     * 自动装配Exercise的数据访问接口。
     *
     * @param exerciseRepository Exercise的数据访问接口。
     */
    @Autowired
    public void setExerciseRepository(ExerciseRepository exerciseRepository) {
        this.exerciseRepository = exerciseRepository;
    }

    /**
     * 自动装配Exercise的扩展数据访问接口。
     *
     * @param exerciseExtRepository Exercise的扩展数据访问接口。
     */
    @Autowired
    public void setExerciseExtRepository(ExerciseExtRepository exerciseExtRepository) {
        this.exerciseExtRepository = exerciseExtRepository;
    }

    /**
     * Exercise的数据访问接口。
     */
    private ExerciseRepository exerciseRepository;
    /**
     * Exercise的扩展数据访问接口。
     */
    private ExerciseExtRepository exerciseExtRepository;

}