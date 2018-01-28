package com.bjsxt.service.imp;

import com.bjsxt.dao.CustomerDao;
import com.bjsxt.entity.Customer;
import com.bjsxt.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDao  customerDao;
	
	
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}



	@Override
	public Customer findById(Long id) {
		return customerDao.findById(id);
	}

}
