package org.comit.course.dao;

import java.util.List;

import org.comit.course.bean.Product;
import org.comit.course.dao.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository

public class ProductDao {
	List<Product> products;

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Product> listProducts() {

		String sql = "SELECT * FROM PRODUCT";

		return jdbcTemplate.query(sql, new ProductMapper());
	}

}
