package cn.yesway.music.repository.impl;

import cn.yesway.framework.data.mybatis.repository.impl.BaseRepositoryImpl;
import cn.yesway.music.repository.FeedbackRepository;
import cn.yesway.music.entity.Feedback;
import cn.yesway.music.entity.FeedbackCondition;
import org.springframework.stereotype.Repository;

/**
 * Feedback的数据访问类。
 * 由Code Generator动态生成。
 *
 * @author Code Generator
 */
@Repository("feedbackRepository")
public class FeedbackRepositoryImpl extends BaseRepositoryImpl<Feedback, FeedbackCondition> implements FeedbackRepository {
}
