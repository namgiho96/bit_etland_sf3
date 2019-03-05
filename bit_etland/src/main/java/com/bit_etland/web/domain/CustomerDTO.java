package com.bit_etland.web.domain;

import lombok.Data;

@Data
public  class CustomerDTO {
	@SuppressWarnings("unused")
	private String 	
					rownum,
					customerID,
					customerName,
					password,
					ssn,
					photo,
					phone,
					city, 
					address, 
					postalCode
					;


}
