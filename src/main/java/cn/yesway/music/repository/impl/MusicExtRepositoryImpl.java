package cn.yesway.music.repository.impl;

import cn.yesway.framework.data.mybatis.repository.impl.BaseRepositoryImpl;
import cn.yesway.music.repository.MusicExtRepository;
import cn.yesway.music.entity.Music;
import cn.yesway.music.entity.MusicCondition;
import org.springframework.stereotype.Repository;

/**
 * Music的数据访问类。
 * 用于编写自定义的数据访问方法。
 * 由Code Generator生成。
 *
 * @author Code Generator
 */
@Repository("musicExtRepository")
public class MusicExtRepositoryImpl extends BaseRepositoryImpl<Music, MusicCondition> implements MusicExtRepository {
}