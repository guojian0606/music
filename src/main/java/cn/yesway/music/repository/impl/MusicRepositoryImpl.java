package cn.yesway.music.repository.impl;

import cn.yesway.framework.data.mybatis.repository.impl.BaseRepositoryImpl;
import cn.yesway.music.repository.MusicRepository;
import cn.yesway.music.entity.Music;
import cn.yesway.music.entity.MusicCondition;
import org.springframework.stereotype.Repository;

/**
 * Music的数据访问类。
 * 由Code Generator动态生成。
 *
 * @author Code Generator
 */
@Repository("musicRepository")
public class MusicRepositoryImpl extends BaseRepositoryImpl<Music, MusicCondition> implements MusicRepository {
}
