package cn.yesway.music.service.impl;

import cn.yesway.music.repository.MusicRepository;
import cn.yesway.music.repository.MusicExtRepository;
import cn.yesway.music.service.MusicService;
import cn.yesway.music.entity.Music;
import cn.yesway.music.entity.MusicCondition;

import cn.yesway.framework.common.entity.page.PageParam;
import cn.yesway.framework.common.entity.page.PageResult;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Music的业务处理接口。
 * 由Code Generator动态生成。
 *
 * @author Code Generator
 */
@Service("musicService")
public class MusicServiceImpl implements MusicService {

    /**
     * 创建Music。
     *
     * @param music Music实体类。
     * @return 是否创建成功。
     */
    @Override
    public boolean create(final Music music) {
        return musicRepository.insertSelective(music) > 0;
    }

    /**
     * 修改Music。
     *
     * @param music Music实体类。
     * @return 是否修改成功。
     */
    @Override
    public boolean update(final Music music) {
        return musicRepository.updateByPrimaryKeySelective(music) > 0;
    }

    /**
     * 根据主键删除Music。
     *
     * @param id Music主键。
     * @return 是否删除成功。
     */
    @Override
    public boolean deleteById(final String id) {
        return musicRepository.deleteByPrimaryKey(id) > 0;
    }

    /**
     * 根据主键批量删除Music。
     *
     * @param ids Music主键集合。
     * @return 是否删除成功。
     */
    @Override
    public boolean deleteByIds(final List<String> ids) {
        return musicRepository.deleteByPrimaryKeys(ids.toArray(new String[0])) > 0;
    }

    /**
     * 根据主键查找Music。
     *
     * @param id Music主键。
     * @return Music信息。
     */
    @Override
    public Music findById(final String id) {
        return musicRepository.selectByPrimaryKey(id);
    }

    /**
     * 根据主键批量查找Music。
     *
     * @param ids Music主键。
     * @return Music信息集合。
     */
    @Override
    public List<Music> findByIds(final List<String> ids) {
        return musicRepository.selectByPrimaryKeys(ids.toArray(new String[0]));
    }

    /**
     * 查询全部Music。
     *
     * @return Music信息集合。
     */
    @Override
    public List<Music> findAll() {
        final MusicCondition condition = new MusicCondition();
        return musicRepository.selectByCondition(condition);
    }

    /**
     * 根据条件查询Music。
     *
     * @param music 查询条件。
     * @return Music信息集合。
     */
    @Override
    public List<Music> findByCondition(final Music music) {
        final MusicCondition condition = new MusicCondition();
        return musicRepository.selectByCondition(condition);
    }

    /**
     * 根据条件分页查询Music。
     *
     * @param music 查询条件。
     * @param pageParam 分页信息。
     * @return 分页后的Music信息集合。
     */
    @Override
    public PageResult<Music> findByConditionAndPage(final Music music, final PageParam pageParam) {
        final MusicCondition condition = new MusicCondition();
        return musicRepository.selectByConditionAndPage(condition, pageParam);
    }

    /**
     * 自动装配Music的数据访问接口。
     *
     * @param musicRepository Music的数据访问接口。
     */
    @Autowired
    public void setMusicRepository(MusicRepository musicRepository) {
        this.musicRepository = musicRepository;
    }

    /**
     * 自动装配Music的扩展数据访问接口。
     *
     * @param musicExtRepository Music的扩展数据访问接口。
     */
    @Autowired
    public void setMusicExtRepository(MusicExtRepository musicExtRepository) {
        this.musicExtRepository = musicExtRepository;
    }

    /**
     * Music的数据访问接口。
     */
    private MusicRepository musicRepository;
    /**
     * Music的扩展数据访问接口。
     */
    private MusicExtRepository musicExtRepository;

}