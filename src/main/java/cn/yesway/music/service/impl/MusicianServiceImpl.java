package cn.yesway.music.service.impl;

import cn.yesway.music.repository.MusicianRepository;
import cn.yesway.music.repository.MusicianExtRepository;
import cn.yesway.music.service.MusicianService;
import cn.yesway.music.entity.Musician;
import cn.yesway.music.entity.MusicianCondition;

import cn.yesway.framework.common.entity.page.PageParam;
import cn.yesway.framework.common.entity.page.PageResult;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Musician的业务处理接口。
 * 由Code Generator动态生成。
 *
 * @author Code Generator
 */
@Service("musicianService")
public class MusicianServiceImpl implements MusicianService {

    /**
     * 创建Musician。
     *
     * @param musician Musician实体类。
     * @return 是否创建成功。
     */
    @Override
    public boolean create(final Musician musician) {
        return musicianRepository.insertSelective(musician) > 0;
    }

    /**
     * 修改Musician。
     *
     * @param musician Musician实体类。
     * @return 是否修改成功。
     */
    @Override
    public boolean update(final Musician musician) {
        return musicianRepository.updateByPrimaryKeySelective(musician) > 0;
    }

    /**
     * 根据主键删除Musician。
     *
     * @param id Musician主键。
     * @return 是否删除成功。
     */
    @Override
    public boolean deleteById(final String id) {
        return musicianRepository.deleteByPrimaryKey(id) > 0;
    }

    /**
     * 根据主键批量删除Musician。
     *
     * @param ids Musician主键集合。
     * @return 是否删除成功。
     */
    @Override
    public boolean deleteByIds(final List<String> ids) {
        return musicianRepository.deleteByPrimaryKeys(ids.toArray(new String[0])) > 0;
    }

    /**
     * 根据主键查找Musician。
     *
     * @param id Musician主键。
     * @return Musician信息。
     */
    @Override
    public Musician findById(final String id) {
        return musicianRepository.selectByPrimaryKey(id);
    }

    /**
     * 根据主键批量查找Musician。
     *
     * @param ids Musician主键。
     * @return Musician信息集合。
     */
    @Override
    public List<Musician> findByIds(final List<String> ids) {
        return musicianRepository.selectByPrimaryKeys(ids.toArray(new String[0]));
    }

    /**
     * 查询全部Musician。
     *
     * @return Musician信息集合。
     */
    @Override
    public List<Musician> findAll() {
        final MusicianCondition condition = new MusicianCondition();
        return musicianRepository.selectByCondition(condition);
    }

    /**
     * 根据条件查询Musician。
     *
     * @param musician 查询条件。
     * @return Musician信息集合。
     */
    @Override
    public List<Musician> findByCondition(final Musician musician) {
        final MusicianCondition condition = new MusicianCondition();
        return musicianRepository.selectByCondition(condition);
    }

    /**
     * 根据条件分页查询Musician。
     *
     * @param musician 查询条件。
     * @param pageParam 分页信息。
     * @return 分页后的Musician信息集合。
     */
    @Override
    public PageResult<Musician> findByConditionAndPage(final Musician musician, final PageParam pageParam) {
        final MusicianCondition condition = new MusicianCondition();
        return musicianRepository.selectByConditionAndPage(condition, pageParam);
    }

    /**
     * 自动装配Musician的数据访问接口。
     *
     * @param musicianRepository Musician的数据访问接口。
     */
    @Autowired
    public void setMusicianRepository(MusicianRepository musicianRepository) {
        this.musicianRepository = musicianRepository;
    }

    /**
     * 自动装配Musician的扩展数据访问接口。
     *
     * @param musicianExtRepository Musician的扩展数据访问接口。
     */
    @Autowired
    public void setMusicianExtRepository(MusicianExtRepository musicianExtRepository) {
        this.musicianExtRepository = musicianExtRepository;
    }

    /**
     * Musician的数据访问接口。
     */
    private MusicianRepository musicianRepository;
    /**
     * Musician的扩展数据访问接口。
     */
    private MusicianExtRepository musicianExtRepository;

}