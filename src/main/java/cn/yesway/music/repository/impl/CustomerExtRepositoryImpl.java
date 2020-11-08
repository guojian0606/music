package cn.yesway.music.repository.impl;

import cn.yesway.framework.data.mybatis.repository.impl.BaseRepositoryImpl;
import cn.yesway.music.repository.CustomerExtRepository;
import cn.yesway.music.entity.Customer;
import cn.yesway.music.entity.CustomerCondition;
import org.springframework.stereotype.Repository;

/**
 * Customer的数据访问类。
 * 用于编写自定义的数据访问方法。
 * 由Code Generator生成。
 *
 * @author Code Generator
 */
@Repository("customerExtRepository")
public class CustomerExtRepositoryImpl extends BaseRepositoryImpl<Customer, CustomerCondition> implements CustomerExtRepository {
}