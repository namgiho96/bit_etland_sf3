package com.bit_etland.web.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data @Component
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
