package com.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.order.avro.domain.Product;

@RestController   
@RequestMapping(path="/api")
public class OrderController {

	
	/*@GetMapping(path="/product")
	public @ResponseBody Iterable<Product> getAllProduct() {		
		return productService.findAllProduct();
	}*/
}
