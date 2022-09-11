package org.comit.course.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.comit.course.bean.Customer;
import org.springframework.jdbc.core.RowMapper;

public class CustomerMapper implements RowMapper<Customer> {

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		
		Customer customer = new Customer();
		customer.setCustomerId(rs.getInt("CUSTOMER_ID"));
		customer.setFirstName(rs.getString("FIRSTNAME"));
		customer.setLastName(rs.getString("LASTNAME"));
		customer.setPhone(rs.getString("PHONE"));
		customer.setPostalCode(rs.getString("POSTALCODE"));
		return customer;
	}

}
