package org.comit.course.service;

import java.util.List;

import org.comit.course.bean.Order;
import org.comit.course.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mapping.AccessOptions.SetOptions.Propagation;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {
	@Autowired
OrderDao Orderdao;
	
	public List<Order> listOrders() {
		List<Order> orders = Orderdao.listOrders();
		return orders;
	}

	//@Transactional(propagation=Propagation..REQUIRED)
    public void deleteOrder(int orderId) {

    	Orderdao.deleteOrder(orderId);
    }

	
	
}


