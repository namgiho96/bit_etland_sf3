package com.bit_etland.web.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data @Component
public  class EmployeeDTO {
	@SuppressWarnings("unused")
		private String employeeID,manager,name,BirthDate,photo,notes;

}
