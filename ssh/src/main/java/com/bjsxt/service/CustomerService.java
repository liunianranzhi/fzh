package com.bjsxt.service;

import com.bjsxt.entity.Customer;

public interface CustomerService {

	/**
	 * 根据ID获取客户信息
	 * @param id
	 * @return
	 */
	public Customer findById(Long id);
}
