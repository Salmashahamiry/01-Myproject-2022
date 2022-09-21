package org.comit.course.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.comit.course.bean.Customer;
import org.comit.course.bean.Order;
import org.comit.course.bean.Product;
import org.springframework.jdbc.core.RowMapper;

public class OrderMapper implements RowMapper<Order> {

	@Override
	public Order mapRow(ResultSet rs, int rowNum) throws SQLException {

		Order order = new Order();
		Customer customer=new Customer();
		Product product=new Product();
		
		order.setOrderId(rs.getInt("ORDERS_ID"));
		order.setCustomerId(rs.getInt("CUSTOMER_ID"));
		
		customer.setCustomerId(rs.getInt("CUSTOMER_ID"));
		customer.setFirstName(rs.getString("FIRSTNAME"));
		customer.setLastName(rs.getString("LASTNAME"));
		customer.setPhone(rs.getString("PHONE"));
		customer.setPostalCode(rs.getString("POSTALCODE"));
		
		product.setProductId(rs.getInt("PRODUCT_ID"));
		product.setProductName(rs.getString("PRODUCTNAME"));
		product.setQty(rs.getInt("QTY"));
		product.setPrice(rs.getDouble("PRICE"));
		product.setImage(rs.getString("IMAGE"));
		
		
		order.setCustomer(customer);
		order.setProduct(product);
			
		return order;
	}

}
