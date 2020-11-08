package cn.yesway.music.repository.impl;

import cn.yesway.framework.data.mybatis.repository.impl.BaseRepositoryImpl;
import cn.yesway.music.repository.MusicianExtRepository;
import cn.yesway.music.entity.Musician;
import cn.yesway.music.entity.MusicianCondition;
import org.springframework.stereotype.Repository;

/**
 * Musician的数据访问类。
 * 用于编写自定义的数据访问方法。
 * 由Code Generator生成。
 *
 * @author Code Generator
 */
@Repository("musicianExtRepository")
public class MusicianExtRepositoryImpl extends BaseRepositoryImpl<Musician, MusicianCondition> implements MusicianExtRepository {
}