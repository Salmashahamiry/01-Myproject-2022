
package org.comit.course.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.comit.course.bean.Product;
import org.springframework.jdbc.core.RowMapper;

public class ProductMapper implements RowMapper<Product> {

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		
		Product product = new Product();
		product.setProductId(rs.getInt("PRODUCT_ID"));
		product.setProductName(rs.getString("PRODUCTNAME"));
		product.setQty(rs.getInt("QTY"));
		product.setPrice(rs.getDouble("PRICE"));
		product.setImage(rs.getString("IMAGE"));
		return product;
	}

}
