package org.comit.course.dao;

import java.util.List;

import org.comit.course.bean.Customer;
import org.comit.course.dao.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository

public class CustomerDao {

	List<Customer> customers;

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Customer> listCustomers() {

		String sql = "SELECT * FROM CUSTOMER";

		return jdbcTemplate.query(sql, new CustomerMapper());
	}

	public Customer findCustomer(int customerId) {
		String sql = "SELECT * FROM CUSTOMER WHERE CUSTOMER_ID = ?";
		return jdbcTemplate.queryForObject(sql, new CustomerMapper(), customerId);
	}

	public void modifyCustomer(Customer customer) {

		String sql = "UPDATE CUSTOMER SET FIRSTNAME = ?, LASTNAME = ?, PHONE = ?, POSTALCODE = ? "
				+ "WHERE CUSTOMER_ID = ?";

		jdbcTemplate.update(sql, new Object[] { customer.getFirstName(), customer.getLastName(), customer.getPhone(),
				customer.getPostalCode(), customer.getCustomerId() });
	}

	public void createCustomer(Customer customer) {
		String sql = "INSERT CUSTOMER(FIRSTNAME,LASTNAME,PHONE,POSTALCODE) VALUES(?,?,?,?)";

		jdbcTemplate.update(sql, new Object[] { customer.getFirstName(), customer.getLastName(), customer.getPhone(),
				customer.getPostalCode() });
	}

	public void deleteCustomer(int idCustomer) {

		String sql = "DELETE FROM CUSTOMER WHERE CUSTOMER_ID = ?";

		jdbcTemplate.update(sql, new Object[] { idCustomer });
	}

}
