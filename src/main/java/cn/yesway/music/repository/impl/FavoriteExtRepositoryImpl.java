package cn.yesway.music.repository.impl;

import cn.yesway.framework.data.mybatis.repository.impl.BaseRepositoryImpl;
import cn.yesway.music.repository.FavoriteExtRepository;
import cn.yesway.music.entity.Favorite;
import cn.yesway.music.entity.FavoriteCondition;
import org.springframework.stereotype.Repository;

/**
 * Favorite的数据访问类。
 * 用于编写自定义的数据访问方法。
 * 由Code Generator生成。
 *
 * @author Code Generator
 */
@Repository("favoriteExtRepository")
public class FavoriteExtRepositoryImpl extends BaseRepositoryImpl<Favorite, FavoriteCondition> implements FavoriteExtRepository {
}