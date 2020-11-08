package cn.yesway.music.controller;

import cn.yesway.framework.common.entity.http.DefaultHttpResultFactory;
import cn.yesway.framework.common.entity.http.HttpResult;
import cn.yesway.framework.common.entity.page.PageParam;
import cn.yesway.framework.common.entity.page.PageResult;
import cn.yesway.framework.common.util.bean.BeanUtil;
import cn.yesway.music.bean.request.MusicianQueryRequestBean;
import cn.yesway.music.entity.Musician;
import cn.yesway.music.service.MusicianService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Musician的控制器类。
 *
 * @author Code Generator
 */
@RestController
@RequestMapping("/v1/musicians")
@Slf4j
public class MusicianController extends BaseController {

    /**
     * Musician的业务处理接口。
     */
    private MusicianService musicianService;

    /**
     * 自动装配Musician的业务处理接口。
     *
     * @param musicianService Musician的业务处理接口。
     */
    @Autowired
    public void setMusicianService(MusicianService musicianService) {
        this.musicianService = musicianService;
    }

    /**
     * 创建Musician。
     *
     * @param musician Musician的请求实体类。
     * @return 是否创建成功。
     */
    @PostMapping("/v1")
    public HttpResult<Boolean> create(@Valid @RequestBody final Musician musician) {
        if (musicianService.create(musician)) {
            return DefaultHttpResultFactory.success("创建Musician成功。", Boolean.TRUE);
        }
        return DefaultHttpResultFactory.fail("创建Musician失败。", Boolean.FALSE);
    }

    /**
     * 修改Musician。
     *
     * @param musician Musician的请求实体类。
     * @return 是否修改成功。
     */
    @PutMapping("/v1")
    public HttpResult<Boolean> update(@Valid @RequestBody final Musician musician) {
        if (musicianService.update(musician)) {
            return DefaultHttpResultFactory.success("修改Musician成功。", Boolean.TRUE);
        }
        return DefaultHttpResultFactory.fail("修改Musician失败。", Boolean.FALSE);
    }

    /**
     * 根据主键删除Musician信息。
     *
     * @param id Musician主键。
     * @return 是否删除成功。
     */
    @DeleteMapping("/v1/{id}")
    public HttpResult<Boolean> deleteById(@NotNull @PathVariable(value = "id") final String id) {
        if (musicianService.deleteById(id)) {
            return DefaultHttpResultFactory.success("删除Musician成功。", Boolean.TRUE);
        }
        return DefaultHttpResultFactory.fail("删除Musician失败。", Boolean.TRUE);
    }

    /**
     * 根据主键批量删除Musician信息。
     *
     * @param ids Musician主键集合。
     * @return 是否删除成功。
     */
    @DeleteMapping("/v1")
    public HttpResult<Boolean> deleteByIds(@NotNull @RequestBody final List<String> ids) {
        if (musicianService.deleteByIds(ids)) {
            return DefaultHttpResultFactory.success("批量删除Musician成功。", Boolean.TRUE);
        }
        return DefaultHttpResultFactory.fail("批量删除Musician失败。", Boolean.TRUE);
    }

    /**
     * 根据主键查询Musician信息。
     *
     * @param id Musician主键。
     * @return Musician信息。
     */
    @GetMapping("/v1/{id}")
    public HttpResult<Musician> findById(@NotNull @PathVariable(value = "id") final String id) {
        Musician result = musicianService.findById(id);
        return DefaultHttpResultFactory.success("根据主键查询Musician成功。", result);
    }

    /**
     * 根据主键批量查询Musician信息。
     *
     * @param ids Musician主键集合。
     * @return Musician信息集合。
     */
    @PostMapping("/v1/ids")
    public HttpResult<List<Musician>> findByIds(@NotNull @RequestBody final List<String> ids) {
        List<Musician> result = musicianService.findByIds(ids);
        return DefaultHttpResultFactory.success("根据主键批量查询Musician成功。", result);
    }

    /**
     * @return 查询全部Musician>信息。
     */
    @GetMapping("/v1")
    public HttpResult<List<Musician>> findAll() {
        final List<Musician> result = musicianService.findAll();
        return DefaultHttpResultFactory.success("查询全部Musician。", result);
    }

    /**
     * 根据条件分页查询Musician信息。
     *
     * @param musicianQueryRequestBean Musician信息查询RequestBean。
     * @return Musician信息集合。
     */
    @PostMapping("/v1/conditions")
    public HttpResult<PageResult<Musician>> findByPageAndCondition(@RequestBody final MusicianQueryRequestBean musicianQueryRequestBean) {
        Musician query = BeanUtil.objToObj(musicianQueryRequestBean, Musician.class);
        PageParam page = musicianQueryRequestBean.getPage();
        final PageResult<Musician> result = musicianService.findByConditionAndPage(query, page);
        return DefaultHttpResultFactory.success("根据条件分页查询Musician成功。", result);
    }

}
