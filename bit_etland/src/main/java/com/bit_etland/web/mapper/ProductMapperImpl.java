package com.bit_etland.web.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.bit_etland.web.domain.ProductDTO;
import com.bit_etland.web.proxy.Proxy;
@Repository
public class ProductMapperImpl implements ProductMapper {

	@Override
	public void insertproduct(ProductDTO prod) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ProductDTO> selectproduct(Proxy pxy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductDTO> selectproducts(Proxy pxy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductDTO selectproduct(ProductDTO prod) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductDTO retriveproduct(ProductDTO prod) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countproduct(Proxy pxy) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existsproductID(ProductDTO prod) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateproduct(ProductDTO prod) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<String, Object> selectProfile(Proxy pxy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteproduct(ProductDTO prod) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<String, Object> SelectPhone(Proxy pxy) {
		// TODO Auto-generated method stub
		return null;
	}

}
