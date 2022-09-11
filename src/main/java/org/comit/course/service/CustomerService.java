package org.comit.course.service;

import java.util.List;

import org.comit.course.bean.Customer;
import org.comit.course.dao.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	@Autowired
	CustomerDao Customerdao;

	public List<Customer> listCustomers() {
		List<Customer> customers = Customerdao.listCustomers();
		return customers;
	}

	public Customer findCustomer(int customerId) {

		return Customerdao.findCustomer(customerId);
	}

	/*
	 * public void createCustomer(Customer customer) {
	 * Customerdao.createCustomer(customer); }
	 */
	public void modifyCustomer(Customer customer) {
		Customerdao.modifyCustomer(customer);
	}

	public void createCustomer(Customer customer) {

		this.validateCustomer(customer);
		Customerdao.createCustomer(customer);
	}

	private void validateCustomer(Customer customer) {

		if (customer.getFirstName().isEmpty() || customer.getLastName().isEmpty() || customer.getPhone().isEmpty()
				|| customer.getPostalCode().isEmpty()) {
			throw new RuntimeException("Invalid Customer Data " + customer);
		}

	}
    public void deleteCustomer(int idcustomer) {

    	Customerdao.deleteCustomer(idcustomer);
    }

}
