package org.comit.course.service;

import java.util.List;

import org.comit.course.bean.Customer;
import org.comit.course.bean.Product;
import org.comit.course.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
ProductDao Productdao;
	
	public List<Product> listProducts() {
		List<Product> products = Productdao.listProducts();
		return products;
	}
	
	public Product findProduct(int productId) {

		return Productdao.findProduct(productId);
	}

	public void modifyProduct(Product product) {
		Productdao.modifyProduct(product);
	}
	
	public void createProduct( Product product) {

		Productdao.createProduct(product);

	}

    public void deleteProduct(int idproduct) {

    	Productdao.deleteProduct(idproduct);
    }

}
