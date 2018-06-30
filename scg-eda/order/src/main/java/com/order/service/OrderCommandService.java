package com.order.service;

import com.order.domain.Order;

public interface OrderCommandService {
	
	public Order saveOrder(Order order) ;	
	
	public Order updateOrder(Order order) ;
}
