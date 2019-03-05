package com.bit_etland.web.domain;

import lombok.Data;

@Data
public  class CategoryDTO {
	@SuppressWarnings("unused")
	private String categoryID,
			categoryName,
			description;
	
}
