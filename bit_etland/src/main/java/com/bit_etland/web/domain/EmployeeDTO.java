package com.bit_etland.web.domain;

import lombok.Data;

@Data
public  class EmployeeDTO {
	@SuppressWarnings("unused")
		private String employeeID,manager,name,BirthDate,photo,notes;

}
