package cn.yesway.music.controller;

import cn.yesway.framework.common.entity.http.DefaultHttpResultFactory;
import cn.yesway.framework.common.entity.http.HttpResult;
import cn.yesway.framework.common.entity.page.PageParam;
import cn.yesway.framework.common.entity.page.PageResult;
import cn.yesway.framework.common.util.bean.BeanUtil;
import cn.yesway.music.bean.request.CustomerQueryRequestBean;
import cn.yesway.music.entity.Customer;
import cn.yesway.music.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Customer的控制器类。
 *
 * @author Code Generator
 */
@RestController
@RequestMapping("/v1/customers")
@Slf4j
public class CustomerController extends BaseController {

    /**
     * Customer的业务处理接口。
     */
    private CustomerService customerService;

    /**
     * 自动装配Customer的业务处理接口。
     *
     * @param customerService Customer的业务处理接口。
     */
    @Autowired
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    public HttpResult<Boolean> login()

    /**
     * 创建Customer。
     *
     * @param customer Customer的请求实体类。
     * @return 是否创建成功。
     */
    @PostMapping("/v1")
    public HttpResult<Boolean> create(@Valid @RequestBody final Customer customer) {
        if (customerService.create(customer)) {
            return DefaultHttpResultFactory.success("创建Customer成功。", Boolean.TRUE);
        }
        return DefaultHttpResultFactory.fail("创建Customer失败。", Boolean.FALSE);
    }

    /**
     * 修改Customer。
     *
     * @param customer Customer的请求实体类。
     * @return 是否修改成功。
     */
    @PutMapping("/v1")
    public HttpResult<Boolean> update(@Valid @RequestBody final Customer customer) {
        if (customerService.update(customer)) {
            return DefaultHttpResultFactory.success("修改Customer成功。", Boolean.TRUE);
        }
        return DefaultHttpResultFactory.fail("修改Customer失败。", Boolean.FALSE);
    }

    /**
     * 根据主键删除Customer信息。
     *
     * @param id Customer主键。
     * @return 是否删除成功。
     */
    @DeleteMapping("/v1/{id}")
    public HttpResult<Boolean> deleteById(@NotNull @PathVariable(value = "id") final String id) {
        if (customerService.deleteById(id)) {
            return DefaultHttpResultFactory.success("删除Customer成功。", Boolean.TRUE);
        }
        return DefaultHttpResultFactory.fail("删除Customer失败。", Boolean.TRUE);
    }

    /**
     * 根据主键批量删除Customer信息。
     *
     * @param ids Customer主键集合。
     * @return 是否删除成功。
     */
    @DeleteMapping("/v1")
    public HttpResult<Boolean> deleteByIds(@NotNull @RequestBody final List<String> ids) {
        if (customerService.deleteByIds(ids)) {
            return DefaultHttpResultFactory.success("批量删除Customer成功。", Boolean.TRUE);
        }
        return DefaultHttpResultFactory.fail("批量删除Customer失败。", Boolean.TRUE);
    }

    /**
     * 根据主键查询Customer信息。
     *
     * @param id Customer主键。
     * @return Customer信息。
     */
    @GetMapping("/v1/{id}")
    public HttpResult<Customer> findById(@NotNull @PathVariable(value = "id") final String id) {
        Customer result = customerService.findById(id);
        return DefaultHttpResultFactory.success("根据主键查询Customer成功。", result);
    }

    /**
     * 根据主键批量查询Customer信息。
     *
     * @param ids Customer主键集合。
     * @return Customer信息集合。
     */
    @PostMapping("/v1/ids")
    public HttpResult<List<Customer>> findByIds(@NotNull @RequestBody final List<String> ids) {
        List<Customer> result = customerService.findByIds(ids);
        return DefaultHttpResultFactory.success("根据主键批量查询Customer成功。", result);
    }

    /**
     * @return 查询全部Customer>信息。
     */
    @GetMapping("/v1")
    public HttpResult<List<Customer>> findAll() {
        final List<Customer> result = customerService.findAll();
        return DefaultHttpResultFactory.success("查询全部Customer。", result);
    }

    /**
     * 根据条件分页查询Customer信息。
     *
     * @param customerQueryRequestBean Customer信息查询RequestBean。
     * @return Customer信息集合。
     */
    @PostMapping("/v1/conditions")
    public HttpResult<PageResult<Customer>> findByPageAndCondition(@RequestBody final CustomerQueryRequestBean customerQueryRequestBean) {
        Customer query = BeanUtil.objToObj(customerQueryRequestBean, Customer.class);
        PageParam page = customerQueryRequestBean.getPage();
        final PageResult<Customer> result = customerService.findByConditionAndPage(query, page);
        return DefaultHttpResultFactory.success("根据条件分页查询Customer成功。", result);
    }

}
