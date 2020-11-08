package cn.yesway.music.repository.impl;

import cn.yesway.framework.data.mybatis.repository.impl.BaseRepositoryImpl;
import cn.yesway.music.repository.ExerciseExtRepository;
import cn.yesway.music.entity.Exercise;
import cn.yesway.music.entity.ExerciseCondition;
import org.springframework.stereotype.Repository;

/**
 * Exercise的数据访问类。
 * 用于编写自定义的数据访问方法。
 * 由Code Generator生成。
 *
 * @author Code Generator
 */
@Repository("exerciseExtRepository")
public class ExerciseExtRepositoryImpl extends BaseRepositoryImpl<Exercise, ExerciseCondition> implements ExerciseExtRepository {
}