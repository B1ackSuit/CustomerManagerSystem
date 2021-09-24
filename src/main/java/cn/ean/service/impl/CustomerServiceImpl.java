package cn.ean.service.impl;

import cn.ean.dao.CustomerDao;
import cn.ean.pojo.Customer;
import cn.ean.service.CustomerService;
import cn.ean.utils.Page;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * FileName:CustomerServiceImpl
 * Author:ean
 * Date:2021/8/8 2:35 下午
 **/
@Service("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService {

    private CustomerDao customerDao;
    @Autowired
    private void setCustomerDao(CustomerDao customerDao){
        this.customerDao = customerDao;
    }

    @Override
    public Page<Customer> findCustomerList(Integer page, Integer rows, String custName,
                                           String custSource, String custIndustry, String custLevel) {
        //创建客户对象
        Customer customer = new Customer();
        //判断客户名称
        if(StringUtils.isNotBlank(custName)){
            customer.setCust_name(custName);
        }
        //判断客户信息来源
        if(StringUtils.isNotBlank(custSource)){
            customer.setCust_source(custSource);
        }
        //判断客户所属行业
        if(StringUtils.isNotBlank(custIndustry)){
            customer.setCust_industry(custIndustry);
        }
        //判断客户级别
        if(StringUtils.isNotBlank(custLevel)){
            customer.setCust_level(custLevel);
        }

        //当前页
        customer.setStart((page-1) * rows);
        //每页数
        customer.setRows(rows);
        //查询客户列表
        List<Customer> customers = customerDao.selectCustomerList(customer);
        //查询客户列表总记录数
        Integer count = customerDao.selectCustomerListCount(customer);
        //创建page返回对象
        Page<Customer> result = new Page<>();
        result.setPage(page);
        result.setRows(customers);
        result.setSize(rows);
        result.setTotal(count);

        return result;
    }



    @Override
    public int createCustomer(Customer customer) {
        return customerDao.createCustomer(customer);
    }

    @Override
    public Customer getCustomerById(Integer id) {
        Customer customer = customerDao.getCustomerById(id);
        return customer;
    }

    @Override
    public int updateCustomer(Customer customer) {
        return customerDao.updateCustomer(customer);
    }

    @Override
    public int deleteCustomer(Integer id) {
        return customerDao.deleteCustomer(id);
    }
}
