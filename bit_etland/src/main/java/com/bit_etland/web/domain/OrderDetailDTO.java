package com.bit_etland.web.domain;

import lombok.Data;

@Data
public  class OrderDetailDTO {
	@SuppressWarnings("unused")
	private String orderDetailID,orderID,productID,quantity;

	
}
