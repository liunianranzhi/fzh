package com.bjsxt.dao.imp;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.bjsxt.dao.CustomerDao;
import com.bjsxt.entity.Customer;




public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

	@Override
	public Customer findById(Long id) {
		
		return this.getHibernateTemplate().get(Customer.class, id);
	}

}
