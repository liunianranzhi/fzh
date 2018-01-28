package com.bjsxt.dao.imp;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bjsxt.dao.CustomerDao;
import com.bjsxt.entity.Customer;

public class CustomerDaoImplTest {

	@Test
	public void test() {
		ApplicationContext app=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		CustomerDao dao=(CustomerDao)app.getBean("customerDao");
		Customer findById = dao.findById(23L);
		System.out.println(findById);
	}

}
