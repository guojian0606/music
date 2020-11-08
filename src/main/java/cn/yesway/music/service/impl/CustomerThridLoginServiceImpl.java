package cn.yesway.music.service.impl;

import cn.yesway.music.repository.CustomerThridLoginRepository;
import cn.yesway.music.repository.CustomerThridLoginExtRepository;
import cn.yesway.music.service.CustomerThridLoginService;
import cn.yesway.music.entity.CustomerThridLogin;
import cn.yesway.music.entity.CustomerThridLoginCondition;

import cn.yesway.framework.common.entity.page.PageParam;
import cn.yesway.framework.common.entity.page.PageResult;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * CustomerThridLogin的业务处理接口。
 * 由Code Generator动态生成。
 *
 * @author Code Generator
 */
@Service("customerThridLoginService")
public class CustomerThridLoginServiceImpl implements CustomerThridLoginService {

    /**
     * 创建CustomerThridLogin。
     *
     * @param customerThridLogin CustomerThridLogin实体类。
     * @return 是否创建成功。
     */
    @Override
    public boolean create(final CustomerThridLogin customerThridLogin) {
        return customerThridLoginRepository.insertSelective(customerThridLogin) > 0;
    }

    /**
     * 修改CustomerThridLogin。
     *
     * @param customerThridLogin CustomerThridLogin实体类。
     * @return 是否修改成功。
     */
    @Override
    public boolean update(final CustomerThridLogin customerThridLogin) {
        return customerThridLoginRepository.updateByPrimaryKeySelective(customerThridLogin) > 0;
    }

    /**
     * 根据主键删除CustomerThridLogin。
     *
     * @param id CustomerThridLogin主键。
     * @return 是否删除成功。
     */
    @Override
    public boolean deleteById(final String id) {
        return customerThridLoginRepository.deleteByPrimaryKey(id) > 0;
    }

    /**
     * 根据主键批量删除CustomerThridLogin。
     *
     * @param ids CustomerThridLogin主键集合。
     * @return 是否删除成功。
     */
    @Override
    public boolean deleteByIds(final List<String> ids) {
        return customerThridLoginRepository.deleteByPrimaryKeys(ids.toArray(new String[0])) > 0;
    }

    /**
     * 根据主键查找CustomerThridLogin。
     *
     * @param id CustomerThridLogin主键。
     * @return CustomerThridLogin信息。
     */
    @Override
    public CustomerThridLogin findById(final String id) {
        return customerThridLoginRepository.selectByPrimaryKey(id);
    }

    /**
     * 根据主键批量查找CustomerThridLogin。
     *
     * @param ids CustomerThridLogin主键。
     * @return CustomerThridLogin信息集合。
     */
    @Override
    public List<CustomerThridLogin> findByIds(final List<String> ids) {
        return customerThridLoginRepository.selectByPrimaryKeys(ids.toArray(new String[0]));
    }

    /**
     * 查询全部CustomerThridLogin。
     *
     * @return CustomerThridLogin信息集合。
     */
    @Override
    public List<CustomerThridLogin> findAll() {
        final CustomerThridLoginCondition condition = new CustomerThridLoginCondition();
        return customerThridLoginRepository.selectByCondition(condition);
    }

    /**
     * 根据条件查询CustomerThridLogin。
     *
     * @param customerThridLogin 查询条件。
     * @return CustomerThridLogin信息集合。
     */
    @Override
    public List<CustomerThridLogin> findByCondition(final CustomerThridLogin customerThridLogin) {
        final CustomerThridLoginCondition condition = new CustomerThridLoginCondition();
        return customerThridLoginRepository.selectByCondition(condition);
    }

    /**
     * 根据条件分页查询CustomerThridLogin。
     *
     * @param customerThridLogin 查询条件。
     * @param pageParam 分页信息。
     * @return 分页后的CustomerThridLogin信息集合。
     */
    @Override
    public PageResult<CustomerThridLogin> findByConditionAndPage(final CustomerThridLogin customerThridLogin, final PageParam pageParam) {
        final CustomerThridLoginCondition condition = new CustomerThridLoginCondition();
        return customerThridLoginRepository.selectByConditionAndPage(condition, pageParam);
    }

    /**
     * 自动装配CustomerThridLogin的数据访问接口。
     *
     * @param customerThridLoginRepository CustomerThridLogin的数据访问接口。
     */
    @Autowired
    public void setCustomerThridLoginRepository(CustomerThridLoginRepository customerThridLoginRepository) {
        this.customerThridLoginRepository = customerThridLoginRepository;
    }

    /**
     * 自动装配CustomerThridLogin的扩展数据访问接口。
     *
     * @param customerThridLoginExtRepository CustomerThridLogin的扩展数据访问接口。
     */
    @Autowired
    public void setCustomerThridLoginExtRepository(CustomerThridLoginExtRepository customerThridLoginExtRepository) {
        this.customerThridLoginExtRepository = customerThridLoginExtRepository;
    }

    /**
     * CustomerThridLogin的数据访问接口。
     */
    private CustomerThridLoginRepository customerThridLoginRepository;
    /**
     * CustomerThridLogin的扩展数据访问接口。
     */
    private CustomerThridLoginExtRepository customerThridLoginExtRepository;

}