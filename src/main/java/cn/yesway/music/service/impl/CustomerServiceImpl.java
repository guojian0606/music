package cn.yesway.music.service.impl;

import cn.yesway.music.repository.CustomerRepository;
import cn.yesway.music.repository.CustomerExtRepository;
import cn.yesway.music.service.CustomerService;
import cn.yesway.music.entity.Customer;
import cn.yesway.music.entity.CustomerCondition;

import cn.yesway.framework.common.entity.page.PageParam;
import cn.yesway.framework.common.entity.page.PageResult;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Customer的业务处理接口。
 * 由Code Generator动态生成。
 *
 * @author Code Generator
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    /**
     * 创建Customer。
     *
     * @param customer Customer实体类。
     * @return 是否创建成功。
     */
    @Override
    public boolean create(final Customer customer) {
        return customerRepository.insertSelective(customer) > 0;
    }

    /**
     * 修改Customer。
     *
     * @param customer Customer实体类。
     * @return 是否修改成功。
     */
    @Override
    public boolean update(final Customer customer) {
        return customerRepository.updateByPrimaryKeySelective(customer) > 0;
    }

    /**
     * 根据主键删除Customer。
     *
     * @param id Customer主键。
     * @return 是否删除成功。
     */
    @Override
    public boolean deleteById(final String id) {
        return customerRepository.deleteByPrimaryKey(id) > 0;
    }

    /**
     * 根据主键批量删除Customer。
     *
     * @param ids Customer主键集合。
     * @return 是否删除成功。
     */
    @Override
    public boolean deleteByIds(final List<String> ids) {
        return customerRepository.deleteByPrimaryKeys(ids.toArray(new String[0])) > 0;
    }

    /**
     * 根据主键查找Customer。
     *
     * @param id Customer主键。
     * @return Customer信息。
     */
    @Override
    public Customer findById(final String id) {
        return customerRepository.selectByPrimaryKey(id);
    }

    /**
     * 根据主键批量查找Customer。
     *
     * @param ids Customer主键。
     * @return Customer信息集合。
     */
    @Override
    public List<Customer> findByIds(final List<String> ids) {
        return customerRepository.selectByPrimaryKeys(ids.toArray(new String[0]));
    }

    /**
     * 查询全部Customer。
     *
     * @return Customer信息集合。
     */
    @Override
    public List<Customer> findAll() {
        final CustomerCondition condition = new CustomerCondition();
        return customerRepository.selectByCondition(condition);
    }

    /**
     * 根据条件查询Customer。
     *
     * @param customer 查询条件。
     * @return Customer信息集合。
     */
    @Override
    public List<Customer> findByCondition(final Customer customer) {
        final CustomerCondition condition = new CustomerCondition();
        return customerRepository.selectByCondition(condition);
    }

    /**
     * 根据条件分页查询Customer。
     *
     * @param customer 查询条件。
     * @param pageParam 分页信息。
     * @return 分页后的Customer信息集合。
     */
    @Override
    public PageResult<Customer> findByConditionAndPage(final Customer customer, final PageParam pageParam) {
        final CustomerCondition condition = new CustomerCondition();
        return customerRepository.selectByConditionAndPage(condition, pageParam);
    }

    /**
     * 自动装配Customer的数据访问接口。
     *
     * @param customerRepository Customer的数据访问接口。
     */
    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    /**
     * 自动装配Customer的扩展数据访问接口。
     *
     * @param customerExtRepository Customer的扩展数据访问接口。
     */
    @Autowired
    public void setCustomerExtRepository(CustomerExtRepository customerExtRepository) {
        this.customerExtRepository = customerExtRepository;
    }

    /**
     * Customer的数据访问接口。
     */
    private CustomerRepository customerRepository;
    /**
     * Customer的扩展数据访问接口。
     */
    private CustomerExtRepository customerExtRepository;

}