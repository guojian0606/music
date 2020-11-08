package cn.yesway.music.service;

import cn.yesway.framework.common.entity.page.PageParam;
import cn.yesway.framework.common.entity.page.PageResult;
import cn.yesway.music.entity.Customer;

import java.util.List;

/**
 * Customer的业务处理接口。
 * 由Code Generator动态生成。
 *
 * @author Code Generator
 */
public interface CustomerService {

    /**
     * 创建Customer。
     *
     * @param customer Customer实体类。
     * @return 是否创建成功。
     */
    boolean create(final Customer customer);

    /**
     * 修改Customer。
     *
     * @param customer Customer实体类。
     * @return 是否修改成功。
     */
    boolean update(final Customer customer);

    /**
     * 根据主键删除Customer。
     *
     * @param id Customer主键。
     * @return 是否删除成功。
     */
    boolean deleteById(final String id);

    /**
     * 根据主键批量删除Customer。
     *
     * @param ids Customer主键集合。
     * @return 是否删除成功。
     */
    boolean deleteByIds(final List<String> ids);

    /**
     * 根据主键查找Customer。
     *
     * @param id Customer主键。
     * @return Customer信息。
     */
    Customer findById(final String id);

    /**
     * 根据主键批量查找Customer。
     *
     * @param ids Customer主键。
     * @return Customer信息集合。
     */
    List<Customer> findByIds(final List<String> ids);

    /**
     * 根据条件查询Customer。
     *
     * @param customer 查询条件。
     * @return Customer信息集合。
     */
    List<Customer> findByCondition(final Customer customer);

    /**
     * 查询全部Customer。
     *
     * @return Customer信息集合。
     */
    List<Customer> findAll();

    /**
     * 根据条件分页查询Customer。
     *
     * @param customer 查询条件。
     * @param pageParam 分页信息。
     * @return 分页后的Customer信息集合。
     */
    PageResult<Customer> findByConditionAndPage(final Customer customer, final PageParam pageParam);

}