package cn.yesway.music.repository.impl;

import cn.yesway.framework.data.mybatis.repository.impl.BaseRepositoryImpl;
import cn.yesway.music.repository.MusicianRepository;
import cn.yesway.music.entity.Musician;
import cn.yesway.music.entity.MusicianCondition;
import org.springframework.stereotype.Repository;

/**
 * Musician的数据访问类。
 * 由Code Generator动态生成。
 *
 * @author Code Generator
 */
@Repository("musicianRepository")
public class MusicianRepositoryImpl extends BaseRepositoryImpl<Musician, MusicianCondition> implements MusicianRepository {
}
