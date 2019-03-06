package com.bit_etland.web.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bit_etland.web.domain.CategoryDTO;
import com.bit_etland.web.proxy.Proxy;
@Repository
public class CategoryMapperImpl implements CategoryMapper {

	@Override
	public void insertcategory(CategoryDTO cate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CategoryDTO> selectcreategory(Proxy pxy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CategoryDTO> selectcreategorys(String serachWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CategoryDTO selectcategory(String serachWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countcategory() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existcategory(String serachWord) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updatacategory(CategoryDTO cate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletecategory(CategoryDTO cate) {
		// TODO Auto-generated method stub
		
	}

}
