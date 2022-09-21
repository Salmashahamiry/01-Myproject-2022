package org.comit.course.dao;

import java.util.List;

import org.comit.course.bean.Order;
import org.comit.course.dao.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Order> listOrders() {

		String sql = "SELECT * FROM CUSTOMER C  JOIN ORDERS O ON C.CUSTOMER_ID= O.CUSTOMER_ID"+
						"  JOIN ORDERS_PRODUCT OP ON O.ORDERS_ID =OP.ORDERS_ID"
						+" LEFT JOIN PRODUCT P ON P.PRODUCT_ID = OP.PRODUCT_ID";

		return jdbcTemplate.query(sql, new OrderMapper());
	}

    public void deleteOrder(int orderId) {

		String sql = "DELETE FROM ORDERS_PRODUCT WHERE ORDERS_ID = ?";
        jdbcTemplate.update(sql,new Object[] {orderId});

		sql = "DELETE FROM ORDERS WHERE ORDERS_ID = ?";
        jdbcTemplate.update(sql,new Object[] {orderId});
    	
    	
    }

	
	
}
