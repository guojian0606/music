package cn.yesway.music.repository.impl;

import cn.yesway.framework.data.mybatis.repository.impl.BaseRepositoryImpl;
import cn.yesway.music.repository.FeedbackExtRepository;
import cn.yesway.music.entity.Feedback;
import cn.yesway.music.entity.FeedbackCondition;
import org.springframework.stereotype.Repository;

/**
 * Feedback的数据访问类。
 * 用于编写自定义的数据访问方法。
 * 由Code Generator生成。
 *
 * @author Code Generator
 */
@Repository("feedbackExtRepository")
public class FeedbackExtRepositoryImpl extends BaseRepositoryImpl<Feedback, FeedbackCondition> implements FeedbackExtRepository {
}