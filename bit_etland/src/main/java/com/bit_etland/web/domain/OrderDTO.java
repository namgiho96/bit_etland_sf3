package com.bit_etland.web.domain;

import lombok.Data;

@Data
public  class OrderDTO {
	@SuppressWarnings("unused")
	private String orderID,customerID,employeeID,orderDate,shipperID;

}
