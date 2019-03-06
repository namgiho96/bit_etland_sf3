package com.bit_etland.web.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.bit_etland.web.domain.ProductDTO;
import com.bit_etland.web.proxy.Proxy;
@Component
public interface ProductMapper {
	public void insertproduct(ProductDTO prod);

	public List<ProductDTO> selectproduct(Proxy pxy);

	public List<ProductDTO> selectproducts(Proxy pxy);

	public ProductDTO selectproduct(ProductDTO prod);
	
	public ProductDTO retriveproduct(ProductDTO prod);

	public int countproduct(Proxy pxy);

	public boolean existsproductID(ProductDTO prod);

	public void updateproduct(ProductDTO prod);

	public Map<String, Object> selectProfile(Proxy pxy);

	public void deleteproduct(ProductDTO prod);

	public Map<String, Object> SelectPhone(Proxy pxy);

}
