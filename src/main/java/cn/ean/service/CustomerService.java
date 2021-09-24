package cn.ean.service;

import cn.ean.pojo.Customer;
import cn.ean.utils.Page;

/**
 * FileName:CustomerService
 * Author:ean
 * Date:2021/8/8 12:29 上午
 **/
public interface CustomerService {
    //查询客户列表
    Page<Customer> findCustomerList(Integer page, Integer rows, String custName, String custSource,
                                    String custIndustry, String custLevel);

    int createCustomer(Customer customer);
    // 通过id查询客户
    public Customer getCustomerById(Integer id);
    // 更新客户
    public int updateCustomer(Customer customer);
    // 删除客户
    public int deleteCustomer(Integer id);
}
