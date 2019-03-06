package com.bit_etland.web.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.bit_etland.web.domain.ProductDTO;
import com.bit_etland.web.proxy.Proxy;
@Service
public class ProductServiceImpl implements ProductService {

	@Override
	public void addprodomer(ProductDTO prod) {
	
		
	}

	@Override
	public List<ProductDTO> bringprodomer(Proxy pxy) {
	
		return null;
	}

	@Override
	public List<ProductDTO> retriveprodomers(Proxy pxy) {
	
		return null;
	}

	@Override
	public ProductDTO retriveprodomer(ProductDTO prod) {
	
		return null;
	}

	@Override
	public int countprodomer(Proxy pxy) {
	
		return 0;
	}

	@Override
	public boolean existsprodomerID(ProductDTO prod) {
	
		return false;
	}

	@Override
	public void modfyprodomer(ProductDTO prod) {
	
		
	}

	@Override
	public Map<String, Object> fileUpload(Proxy pxy) {
	
		return null;
	}

	@Override
	public void removeprodomer(ProductDTO prod) {
	
		
	}

	@Override
	public Map<String, Object> retrievePhone(Proxy pxy) {
	
		return null;
	}

}
