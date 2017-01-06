package service.impl;

import mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pojo.Customer;
import service.CustomerService;


@Component("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerMapper customerMapper;
	@Override
	public Customer findCustomerByName(Customer customer) {
		
		return customerMapper.findCustomerByName(customer);

	}

}
