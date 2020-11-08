package cn.yesway.music.service.impl;

import cn.yesway.music.repository.FavoriteRepository;
import cn.yesway.music.repository.FavoriteExtRepository;
import cn.yesway.music.service.FavoriteService;
import cn.yesway.music.entity.Favorite;
import cn.yesway.music.entity.FavoriteCondition;

import cn.yesway.framework.common.entity.page.PageParam;
import cn.yesway.framework.common.entity.page.PageResult;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Favorite的业务处理接口。
 * 由Code Generator动态生成。
 *
 * @author Code Generator
 */
@Service("favoriteService")
public class FavoriteServiceImpl implements FavoriteService {

    /**
     * 创建Favorite。
     *
     * @param favorite Favorite实体类。
     * @return 是否创建成功。
     */
    @Override
    public boolean create(final Favorite favorite) {
        return favoriteRepository.insertSelective(favorite) > 0;
    }

    /**
     * 修改Favorite。
     *
     * @param favorite Favorite实体类。
     * @return 是否修改成功。
     */
    @Override
    public boolean update(final Favorite favorite) {
        return favoriteRepository.updateByPrimaryKeySelective(favorite) > 0;
    }

    /**
     * 根据主键删除Favorite。
     *
     * @param id Favorite主键。
     * @return 是否删除成功。
     */
    @Override
    public boolean deleteById(final String id) {
        return favoriteRepository.deleteByPrimaryKey(id) > 0;
    }

    /**
     * 根据主键批量删除Favorite。
     *
     * @param ids Favorite主键集合。
     * @return 是否删除成功。
     */
    @Override
    public boolean deleteByIds(final List<String> ids) {
        return favoriteRepository.deleteByPrimaryKeys(ids.toArray(new String[0])) > 0;
    }

    /**
     * 根据主键查找Favorite。
     *
     * @param id Favorite主键。
     * @return Favorite信息。
     */
    @Override
    public Favorite findById(final String id) {
        return favoriteRepository.selectByPrimaryKey(id);
    }

    /**
     * 根据主键批量查找Favorite。
     *
     * @param ids Favorite主键。
     * @return Favorite信息集合。
     */
    @Override
    public List<Favorite> findByIds(final List<String> ids) {
        return favoriteRepository.selectByPrimaryKeys(ids.toArray(new String[0]));
    }

    /**
     * 查询全部Favorite。
     *
     * @return Favorite信息集合。
     */
    @Override
    public List<Favorite> findAll() {
        final FavoriteCondition condition = new FavoriteCondition();
        return favoriteRepository.selectByCondition(condition);
    }

    /**
     * 根据条件查询Favorite。
     *
     * @param favorite 查询条件。
     * @return Favorite信息集合。
     */
    @Override
    public List<Favorite> findByCondition(final Favorite favorite) {
        final FavoriteCondition condition = new FavoriteCondition();
        return favoriteRepository.selectByCondition(condition);
    }

    /**
     * 根据条件分页查询Favorite。
     *
     * @param favorite 查询条件。
     * @param pageParam 分页信息。
     * @return 分页后的Favorite信息集合。
     */
    @Override
    public PageResult<Favorite> findByConditionAndPage(final Favorite favorite, final PageParam pageParam) {
        final FavoriteCondition condition = new FavoriteCondition();
        return favoriteRepository.selectByConditionAndPage(condition, pageParam);
    }

    /**
     * 自动装配Favorite的数据访问接口。
     *
     * @param favoriteRepository Favorite的数据访问接口。
     */
    @Autowired
    public void setFavoriteRepository(FavoriteRepository favoriteRepository) {
        this.favoriteRepository = favoriteRepository;
    }

    /**
     * 自动装配Favorite的扩展数据访问接口。
     *
     * @param favoriteExtRepository Favorite的扩展数据访问接口。
     */
    @Autowired
    public void setFavoriteExtRepository(FavoriteExtRepository favoriteExtRepository) {
        this.favoriteExtRepository = favoriteExtRepository;
    }

    /**
     * Favorite的数据访问接口。
     */
    private FavoriteRepository favoriteRepository;
    /**
     * Favorite的扩展数据访问接口。
     */
    private FavoriteExtRepository favoriteExtRepository;

}