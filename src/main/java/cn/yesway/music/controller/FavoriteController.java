package cn.yesway.music.controller;

import cn.yesway.framework.common.entity.http.DefaultHttpResultFactory;
import cn.yesway.framework.common.entity.http.HttpResult;
import cn.yesway.framework.common.entity.page.PageParam;
import cn.yesway.framework.common.entity.page.PageResult;
import cn.yesway.framework.common.util.bean.BeanUtil;
import cn.yesway.music.bean.request.FavoriteQueryRequestBean;
import cn.yesway.music.entity.Favorite;
import cn.yesway.music.service.FavoriteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Favorite的控制器类。
 *
 * @author Code Generator
 */
@RestController
@RequestMapping("/v1/favorites")
@Slf4j
public class FavoriteController extends BaseController {

    /**
     * Favorite的业务处理接口。
     */
    private FavoriteService favoriteService;

    /**
     * 自动装配Favorite的业务处理接口。
     *
     * @param favoriteService Favorite的业务处理接口。
     */
    @Autowired
    public void setFavoriteService(FavoriteService favoriteService) {
        this.favoriteService = favoriteService;
    }

    /**
     * 创建Favorite。
     *
     * @param favorite Favorite的请求实体类。
     * @return 是否创建成功。
     */
    @PostMapping("/v1")
    public HttpResult<Boolean> create(@Valid @RequestBody final Favorite favorite) {
        if (favoriteService.create(favorite)) {
            return DefaultHttpResultFactory.success("创建Favorite成功。", Boolean.TRUE);
        }
        return DefaultHttpResultFactory.fail("创建Favorite失败。", Boolean.FALSE);
    }

    /**
     * 修改Favorite。
     *
     * @param favorite Favorite的请求实体类。
     * @return 是否修改成功。
     */
    @PutMapping("/v1")
    public HttpResult<Boolean> update(@Valid @RequestBody final Favorite favorite) {
        if (favoriteService.update(favorite)) {
            return DefaultHttpResultFactory.success("修改Favorite成功。", Boolean.TRUE);
        }
        return DefaultHttpResultFactory.fail("修改Favorite失败。", Boolean.FALSE);
    }

    /**
     * 根据主键删除Favorite信息。
     *
     * @param id Favorite主键。
     * @return 是否删除成功。
     */
    @DeleteMapping("/v1/{id}")
    public HttpResult<Boolean> deleteById(@NotNull @PathVariable(value = "id") final String id) {
        if (favoriteService.deleteById(id)) {
            return DefaultHttpResultFactory.success("删除Favorite成功。", Boolean.TRUE);
        }
        return DefaultHttpResultFactory.fail("删除Favorite失败。", Boolean.TRUE);
    }

    /**
     * 根据主键批量删除Favorite信息。
     *
     * @param ids Favorite主键集合。
     * @return 是否删除成功。
     */
    @DeleteMapping("/v1")
    public HttpResult<Boolean> deleteByIds(@NotNull @RequestBody final List<String> ids) {
        if (favoriteService.deleteByIds(ids)) {
            return DefaultHttpResultFactory.success("批量删除Favorite成功。", Boolean.TRUE);
        }
        return DefaultHttpResultFactory.fail("批量删除Favorite失败。", Boolean.TRUE);
    }

    /**
     * 根据主键查询Favorite信息。
     *
     * @param id Favorite主键。
     * @return Favorite信息。
     */
    @GetMapping("/v1/{id}")
    public HttpResult<Favorite> findById(@NotNull @PathVariable(value = "id") final String id) {
        Favorite result = favoriteService.findById(id);
        return DefaultHttpResultFactory.success("根据主键查询Favorite成功。", result);
    }

    /**
     * 根据主键批量查询Favorite信息。
     *
     * @param ids Favorite主键集合。
     * @return Favorite信息集合。
     */
    @PostMapping("/v1/ids")
    public HttpResult<List<Favorite>> findByIds(@NotNull @RequestBody final List<String> ids) {
        List<Favorite> result = favoriteService.findByIds(ids);
        return DefaultHttpResultFactory.success("根据主键批量查询Favorite成功。", result);
    }

    /**
     * @return 查询全部Favorite>信息。
     */
    @GetMapping("/v1")
    public HttpResult<List<Favorite>> findAll() {
        final List<Favorite> result = favoriteService.findAll();
        return DefaultHttpResultFactory.success("查询全部Favorite。", result);
    }

    /**
     * 根据条件分页查询Favorite信息。
     *
     * @param favoriteQueryRequestBean Favorite信息查询RequestBean。
     * @return Favorite信息集合。
     */
    @PostMapping("/v1/conditions")
    public HttpResult<PageResult<Favorite>> findByPageAndCondition(@RequestBody final FavoriteQueryRequestBean favoriteQueryRequestBean) {
        Favorite query = BeanUtil.objToObj(favoriteQueryRequestBean, Favorite.class);
        PageParam page = favoriteQueryRequestBean.getPage();
        final PageResult<Favorite> result = favoriteService.findByConditionAndPage(query, page);
        return DefaultHttpResultFactory.success("根据条件分页查询Favorite成功。", result);
    }

}
