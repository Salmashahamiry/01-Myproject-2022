package org.comit.course.dao;

import java.util.List;

import org.comit.course.bean.Customer;
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
	
	public Product findProduct(int productId) {
		String sql = "SELECT * FROM PRODUCT WHERE PRODUCT_ID = ?";
		return jdbcTemplate.queryForObject(sql, new ProductMapper(), productId);
	}

	
	public void modifyProduct(Product product) {

		String sql = "UPDATE PRODUCT SET PRODUCTNAME = ?, QTY = ?, PRICE = ?, IMAGE = ? "
				+ "WHERE PRODUCT_ID = ?";

		jdbcTemplate.update(sql, new Object[] { product.getProductName(), product.getQty(),product.getPrice(),product.getImage(),product.getProductId()});
		System.out.println("Update2 customer DONE");

	}
	
	public void createProduct(Product product) {
		String sql = "INSERT PRODUCT(PRODUCTNAME,QTY,PRICE,IMAGE) VALUES(?,?,?,?)";

		jdbcTemplate.update(sql, new Object[] { product.getProductName(),product.getQty(),product.getPrice(),product.getImage()});
	}

	public void deleteProduct(int idProduct) {

		String sql = "DELETE FROM PRODUCT WHERE PRODUCT_ID = ?";

		jdbcTemplate.update(sql, new Object[] { idProduct });

	}
}
