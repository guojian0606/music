package cn.yesway.music.repository.impl;

import cn.yesway.framework.data.mybatis.repository.impl.BaseRepositoryImpl;
import cn.yesway.music.repository.CustomerRepository;
import cn.yesway.music.entity.Customer;
import cn.yesway.music.entity.CustomerCondition;
import org.springframework.stereotype.Repository;

/**
 * Customer的数据访问类。
 * 由Code Generator动态生成。
 *
 * @author Code Generator
 */
@Repository("customerRepository")
public class CustomerRepositoryImpl extends BaseRepositoryImpl<Customer, CustomerCondition> implements CustomerRepository {
}
