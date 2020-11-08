package cn.yesway.music.controller;

import cn.yesway.framework.common.entity.http.DefaultHttpResultFactory;
import cn.yesway.framework.common.entity.http.HttpResult;
import cn.yesway.framework.common.entity.page.PageParam;
import cn.yesway.framework.common.entity.page.PageResult;
import cn.yesway.framework.common.util.bean.BeanUtil;
import cn.yesway.music.bean.request.MusicQueryRequestBean;
import cn.yesway.music.entity.Music;
import cn.yesway.music.service.MusicService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Music的控制器类。
 *
 * @author Code Generator
 */
@RestController
@RequestMapping("/v1/musics")
@Slf4j
public class MusicController extends BaseController {

    /**
     * Music的业务处理接口。
     */
    private MusicService musicService;

    /**
     * 自动装配Music的业务处理接口。
     *
     * @param musicService Music的业务处理接口。
     */
    @Autowired
    public void setMusicService(MusicService musicService) {
        this.musicService = musicService;
    }

    /**
     * 创建Music。
     *
     * @param music Music的请求实体类。
     * @return 是否创建成功。
     */
    @PostMapping("/v1")
    public HttpResult<Boolean> create(@Valid @RequestBody final Music music) {
        if (musicService.create(music)) {
            return DefaultHttpResultFactory.success("创建Music成功。", Boolean.TRUE);
        }
        return DefaultHttpResultFactory.fail("创建Music失败。", Boolean.FALSE);
    }

    /**
     * 修改Music。
     *
     * @param music Music的请求实体类。
     * @return 是否修改成功。
     */
    @PutMapping("/v1")
    public HttpResult<Boolean> update(@Valid @RequestBody final Music music) {
        if (musicService.update(music)) {
            return DefaultHttpResultFactory.success("修改Music成功。", Boolean.TRUE);
        }
        return DefaultHttpResultFactory.fail("修改Music失败。", Boolean.FALSE);
    }

    /**
     * 根据主键删除Music信息。
     *
     * @param id Music主键。
     * @return 是否删除成功。
     */
    @DeleteMapping("/v1/{id}")
    public HttpResult<Boolean> deleteById(@NotNull @PathVariable(value = "id") final String id) {
        if (musicService.deleteById(id)) {
            return DefaultHttpResultFactory.success("删除Music成功。", Boolean.TRUE);
        }
        return DefaultHttpResultFactory.fail("删除Music失败。", Boolean.TRUE);
    }

    /**
     * 根据主键批量删除Music信息。
     *
     * @param ids Music主键集合。
     * @return 是否删除成功。
     */
    @DeleteMapping("/v1")
    public HttpResult<Boolean> deleteByIds(@NotNull @RequestBody final List<String> ids) {
        if (musicService.deleteByIds(ids)) {
            return DefaultHttpResultFactory.success("批量删除Music成功。", Boolean.TRUE);
        }
        return DefaultHttpResultFactory.fail("批量删除Music失败。", Boolean.TRUE);
    }

    /**
     * 根据主键查询Music信息。
     *
     * @param id Music主键。
     * @return Music信息。
     */
    @GetMapping("/v1/{id}")
    public HttpResult<Music> findById(@NotNull @PathVariable(value = "id") final String id) {
        Music result = musicService.findById(id);
        return DefaultHttpResultFactory.success("根据主键查询Music成功。", result);
    }

    /**
     * 根据主键批量查询Music信息。
     *
     * @param ids Music主键集合。
     * @return Music信息集合。
     */
    @PostMapping("/v1/ids")
    public HttpResult<List<Music>> findByIds(@NotNull @RequestBody final List<String> ids) {
        List<Music> result = musicService.findByIds(ids);
        return DefaultHttpResultFactory.success("根据主键批量查询Music成功。", result);
    }

    /**
     * @return 查询全部Music>信息。
     */
    @GetMapping("/v1")
    public HttpResult<List<Music>> findAll() {
        final List<Music> result = musicService.findAll();
        return DefaultHttpResultFactory.success("查询全部Music。", result);
    }

    /**
     * 根据条件分页查询Music信息。
     *
     * @param musicQueryRequestBean Music信息查询RequestBean。
     * @return Music信息集合。
     */
    @PostMapping("/v1/conditions")
    public HttpResult<PageResult<Music>> findByPageAndCondition(@RequestBody final MusicQueryRequestBean musicQueryRequestBean) {
        Music query = BeanUtil.objToObj(musicQueryRequestBean, Music.class);
        PageParam page = musicQueryRequestBean.getPage();
        final PageResult<Music> result = musicService.findByConditionAndPage(query, page);
        return DefaultHttpResultFactory.success("根据条件分页查询Music成功。", result);
    }

}
