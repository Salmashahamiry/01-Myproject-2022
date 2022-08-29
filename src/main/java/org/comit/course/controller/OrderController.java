package org.comit.course.controller;

import org.comit.course.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class OrderController {
	@Autowired
  OrderService Orderservice;
}
