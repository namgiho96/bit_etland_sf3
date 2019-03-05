package com.bit_etland.web.domain;

import lombok.Data;

@Data
public  class SupplierDTO {
	@SuppressWarnings("unused")
	private String supplierID,supplierName,contactName,address,city,postalCode,country,phone;

}
