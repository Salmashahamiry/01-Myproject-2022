package org.comit.course.service;

import org.comit.course.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
ProductDao Productdao;
}
