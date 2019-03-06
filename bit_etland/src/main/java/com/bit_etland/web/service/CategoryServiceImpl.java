package com.bit_etland.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bit_etland.web.domain.CategoryDTO;
import com.bit_etland.web.proxy.Proxy;
@Service
public class CategoryServiceImpl implements CategoryService {

	@Override
	public void createcategory(CategoryDTO cate) {
	
		
	}

	@Override
	public List<?> bringcreategory(Proxy pxy) {
	
		return null;
	}

	@Override
	public List<CategoryDTO> retrivecreategorys(String serachWord) {
	
		return null;
	}

	@Override
	public CategoryDTO retrivecategory(String serachWord) {
	
		return null;
	}

	@Override
	public int countcategory() {
	
		return 0;
	}

	@Override
	public boolean existcategory(String serachWord) {
	
		return false;
	}

	@Override
	public void modfycategory(CategoryDTO cate) {
	
		
	}

	@Override
	public void removecategory(CategoryDTO cate) {
	
		
	}

}
