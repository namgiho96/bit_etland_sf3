package com.bit_etland.web.mapper;

import java.util.List;

import com.bit_etland.web.domain.OrderDetailDTO;

public interface OrderDetailMapper {
	public void insertOrderDeail();

	public List<OrderDetailDTO> selectOrderDetail();

	public List<OrderDetailDTO> selectOrderDetails();

	public OrderDetailDTO selectsOrderDetail();

	public int countOrderDetail();

	public boolean updateOrderDetail();

	public void deleteOrderDetail();
}
