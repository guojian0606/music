package cn.yesway.music.service;

import cn.yesway.framework.common.entity.page.PageParam;
import cn.yesway.framework.common.entity.page.PageResult;
import cn.yesway.music.entity.CustomerThridLogin;

import java.util.List;

/**
 * CustomerThridLogin的业务处理接口。
 * 由Code Generator动态生成。
 *
 * @author Code Generator
 */
public interface CustomerThridLoginService {

    /**
     * 创建CustomerThridLogin。
     *
     * @param customerThridLogin CustomerThridLogin实体类。
     * @return 是否创建成功。
     */
    boolean create(final CustomerThridLogin customerThridLogin);

    /**
     * 修改CustomerThridLogin。
     *
     * @param customerThridLogin CustomerThridLogin实体类。
     * @return 是否修改成功。
     */
    boolean update(final CustomerThridLogin customerThridLogin);

    /**
     * 根据主键删除CustomerThridLogin。
     *
     * @param id CustomerThridLogin主键。
     * @return 是否删除成功。
     */
    boolean deleteById(final String id);

    /**
     * 根据主键批量删除CustomerThridLogin。
     *
     * @param ids CustomerThridLogin主键集合。
     * @return 是否删除成功。
     */
    boolean deleteByIds(final List<String> ids);

    /**
     * 根据主键查找CustomerThridLogin。
     *
     * @param id CustomerThridLogin主键。
     * @return CustomerThridLogin信息。
     */
    CustomerThridLogin findById(final String id);

    /**
     * 根据主键批量查找CustomerThridLogin。
     *
     * @param ids CustomerThridLogin主键。
     * @return CustomerThridLogin信息集合。
     */
    List<CustomerThridLogin> findByIds(final List<String> ids);

    /**
     * 根据条件查询CustomerThridLogin。
     *
     * @param customerThridLogin 查询条件。
     * @return CustomerThridLogin信息集合。
     */
    List<CustomerThridLogin> findByCondition(final CustomerThridLogin customerThridLogin);

    /**
     * 查询全部CustomerThridLogin。
     *
     * @return CustomerThridLogin信息集合。
     */
    List<CustomerThridLogin> findAll();

    /**
     * 根据条件分页查询CustomerThridLogin。
     *
     * @param customerThridLogin 查询条件。
     * @param pageParam 分页信息。
     * @return 分页后的CustomerThridLogin信息集合。
     */
    PageResult<CustomerThridLogin> findByConditionAndPage(final CustomerThridLogin customerThridLogin, final PageParam pageParam);

}