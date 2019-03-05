package com.bit_etland.web.service;

import java.util.List;

import com.bit_etland.web.domain.OrderDetailDTO;

public interface OrderDetailService {
	public void addOrderDeail();

	public List<OrderDetailDTO> bringOrderDetail();

	public List<OrderDetailDTO> retriveOrderDetails();

	public OrderDetailDTO retriveOrderDetail();

	public int countOrderDetail();

	public boolean existOrderDetail();

	public void modfyOrderDetail();
}
