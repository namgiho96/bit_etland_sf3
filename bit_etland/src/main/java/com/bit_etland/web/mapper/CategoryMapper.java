package com.bit_etland.web.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bit_etland.web.domain.CategoryDTO;
import com.bit_etland.web.proxy.Proxy;

@Component
public interface CategoryMapper {
	public void insertcategory(CategoryDTO cate);

	public List<CategoryDTO> selectcreategory(Proxy pxy);

	public List<CategoryDTO> selectcreategorys(String serachWord);

	public CategoryDTO selectcategory(String serachWord);

	public int countcategory();

	public boolean existcategory(String serachWord);

	public void updatacategory(CategoryDTO cate);

	public void deletecategory(CategoryDTO cate);

}
