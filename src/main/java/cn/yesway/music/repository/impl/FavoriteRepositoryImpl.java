package cn.yesway.music.repository.impl;

import cn.yesway.framework.data.mybatis.repository.impl.BaseRepositoryImpl;
import cn.yesway.music.repository.FavoriteRepository;
import cn.yesway.music.entity.Favorite;
import cn.yesway.music.entity.FavoriteCondition;
import org.springframework.stereotype.Repository;

/**
 * Favorite的数据访问类。
 * 由Code Generator动态生成。
 *
 * @author Code Generator
 */
@Repository("favoriteRepository")
public class FavoriteRepositoryImpl extends BaseRepositoryImpl<Favorite, FavoriteCondition> implements FavoriteRepository {
}
