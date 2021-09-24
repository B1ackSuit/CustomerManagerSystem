package cn.ean.dao;

import cn.ean.pojo.Customer;

import java.util.List;

/**
 * FileName:CustomerDao
 * Author:ean
 * Date:2021/8/7 3:44 下午
 **/
public interface CustomerDao {

    //客户列表
    List<Customer> selectCustomerList(Customer customer);

    //客户数
    Integer selectCustomerListCount(Customer customer);

    int createCustomer(Customer customer);
    // 通过id查询客户
    Customer getCustomerById(Integer id);
    // 更新客户信息
    int updateCustomer(Customer customer);
    // 删除客户
    int deleteCustomer (Integer id);
}











