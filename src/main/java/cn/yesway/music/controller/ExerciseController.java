package cn.yesway.music.controller;

import cn.yesway.framework.common.entity.http.DefaultHttpResultFactory;
import cn.yesway.framework.common.entity.http.HttpResult;
import cn.yesway.framework.common.entity.page.PageParam;
import cn.yesway.framework.common.entity.page.PageResult;
import cn.yesway.framework.common.util.bean.BeanUtil;
import cn.yesway.music.bean.request.ExerciseQueryRequestBean;
import cn.yesway.music.entity.Exercise;
import cn.yesway.music.service.ExerciseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Exercise的控制器类。
 *
 * @author Code Generator
 */
@RestController
@RequestMapping("/v1/exercises")
@Slf4j
public class ExerciseController extends BaseController {

    /**
     * Exercise的业务处理接口。
     */
    private ExerciseService exerciseService;

    /**
     * 自动装配Exercise的业务处理接口。
     *
     * @param exerciseService Exercise的业务处理接口。
     */
    @Autowired
    public void setExerciseService(ExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }

    /**
     * 创建Exercise。
     *
     * @param exercise Exercise的请求实体类。
     * @return 是否创建成功。
     */
    @PostMapping("/v1")
    public HttpResult<Boolean> create(@Valid @RequestBody final Exercise exercise) {
        if (exerciseService.create(exercise)) {
            return DefaultHttpResultFactory.success("创建Exercise成功。", Boolean.TRUE);
        }
        return DefaultHttpResultFactory.fail("创建Exercise失败。", Boolean.FALSE);
    }

    /**
     * 修改Exercise。
     *
     * @param exercise Exercise的请求实体类。
     * @return 是否修改成功。
     */
    @PutMapping("/v1")
    public HttpResult<Boolean> update(@Valid @RequestBody final Exercise exercise) {
        if (exerciseService.update(exercise)) {
            return DefaultHttpResultFactory.success("修改Exercise成功。", Boolean.TRUE);
        }
        return DefaultHttpResultFactory.fail("修改Exercise失败。", Boolean.FALSE);
    }

    /**
     * 根据主键删除Exercise信息。
     *
     * @param id Exercise主键。
     * @return 是否删除成功。
     */
    @DeleteMapping("/v1/{id}")
    public HttpResult<Boolean> deleteById(@NotNull @PathVariable(value = "id") final String id) {
        if (exerciseService.deleteById(id)) {
            return DefaultHttpResultFactory.success("删除Exercise成功。", Boolean.TRUE);
        }
        return DefaultHttpResultFactory.fail("删除Exercise失败。", Boolean.TRUE);
    }

    /**
     * 根据主键批量删除Exercise信息。
     *
     * @param ids Exercise主键集合。
     * @return 是否删除成功。
     */
    @DeleteMapping("/v1")
    public HttpResult<Boolean> deleteByIds(@NotNull @RequestBody final List<String> ids) {
        if (exerciseService.deleteByIds(ids)) {
            return DefaultHttpResultFactory.success("批量删除Exercise成功。", Boolean.TRUE);
        }
        return DefaultHttpResultFactory.fail("批量删除Exercise失败。", Boolean.TRUE);
    }

    /**
     * 根据主键查询Exercise信息。
     *
     * @param id Exercise主键。
     * @return Exercise信息。
     */
    @GetMapping("/v1/{id}")
    public HttpResult<Exercise> findById(@NotNull @PathVariable(value = "id") final String id) {
        Exercise result = exerciseService.findById(id);
        return DefaultHttpResultFactory.success("根据主键查询Exercise成功。", result);
    }

    /**
     * 根据主键批量查询Exercise信息。
     *
     * @param ids Exercise主键集合。
     * @return Exercise信息集合。
     */
    @PostMapping("/v1/ids")
    public HttpResult<List<Exercise>> findByIds(@NotNull @RequestBody final List<String> ids) {
        List<Exercise> result = exerciseService.findByIds(ids);
        return DefaultHttpResultFactory.success("根据主键批量查询Exercise成功。", result);
    }

    /**
     * @return 查询全部Exercise信息。
     */
    @GetMapping("/v1")
    public HttpResult<List<Exercise>> findAll() {
        final List<Exercise> result = exerciseService.findAll();
        return DefaultHttpResultFactory.success("查询全部Exercise。", result);
    }

    /**
     * 根据条件分页查询Exercise信息。
     *
     * @param exerciseQueryRequestBean Exercise信息查询RequestBean。
     * @return Exercise信息集合。
     */
    @PostMapping("/v1/conditions")
    public HttpResult<PageResult<Exercise>> findByPageAndCondition(@RequestBody final ExerciseQueryRequestBean exerciseQueryRequestBean) {
        Exercise query = BeanUtil.objToObj(exerciseQueryRequestBean, Exercise.class);
        PageParam page = exerciseQueryRequestBean.getPage();
        final PageResult<Exercise> result = exerciseService.findByConditionAndPage(query, page);
        return DefaultHttpResultFactory.success("根据条件分页查询Exercise成功。", result);
    }

}
