package org.comit.course.service;

import org.comit.course.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	@Autowired
OrderDao Orderdao;
}
