package com.cyan.serviceimpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cyan.dao.CategoryDao;
import com.cyan.dao.CustomerDao;
import com.cyan.dao.OrdersDao;
import com.cyan.dao.ProductDao;
import com.cyan.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService{

	@Autowired
	private ProductDao productDao;
	
	@Autowired
	private OrdersDao ordersDao;

	@Autowired
	private CustomerDao customerDao;

	@Autowired
	private CategoryDao categoryDao;
	
	@Override
	@Transactional
	public Map<String, Long> getCount() {
		Map<String, Long> count = new HashMap<>();
		count.put("product", productDao.count());
		count.put("order", ordersDao.count());
		count.put("customer", customerDao.count());
		count.put("category", categoryDao.count());
		return count;
	}

}
