package cn.yesway.music.repository.impl;

import cn.yesway.framework.data.mybatis.repository.impl.BaseRepositoryImpl;
import cn.yesway.music.repository.ExerciseRepository;
import cn.yesway.music.entity.Exercise;
import cn.yesway.music.entity.ExerciseCondition;
import org.springframework.stereotype.Repository;

/**
 * Exercise的数据访问类。
 * 由Code Generator动态生成。
 *
 * @author Code Generator
 */
@Repository("exerciseRepository")
public class ExerciseRepositoryImpl extends BaseRepositoryImpl<Exercise, ExerciseCondition> implements ExerciseRepository {
}
