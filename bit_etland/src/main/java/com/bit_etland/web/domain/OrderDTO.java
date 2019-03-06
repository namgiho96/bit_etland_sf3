package com.bit_etland.web.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data @Component
public  class OrderDTO {
	@SuppressWarnings("unused")
	private String orderID,customerID,employeeID,orderDate,shipperID;

}
