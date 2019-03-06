package com.bit_etland.web.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bit_etland.web.domain.CategoryDTO;
import com.bit_etland.web.proxy.Proxy;
@Component
public interface CategoryService {

	public void createcategory(CategoryDTO cate);

	public List<?> bringcreategory(Proxy pxy);

	public List<CategoryDTO> retrivecreategorys(String serachWord);

	public CategoryDTO retrivecategory(String serachWord);

	public int countcategory();

	public boolean existcategory(String serachWord);

	public void modfycategory(CategoryDTO cate);

	public void removecategory(CategoryDTO cate);
}
