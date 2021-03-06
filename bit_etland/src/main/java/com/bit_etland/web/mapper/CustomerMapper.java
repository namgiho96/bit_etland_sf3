package com.bit_etland.web.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.bit_etland.web.domain.CustomerDTO;
import com.bit_etland.web.proxy.Proxy;
@Repository
public interface CustomerMapper {
	public void insertCustomer(CustomerDTO cust);

	public List<CustomerDTO> selectCustomer(Proxy pxy);

	public List<CustomerDTO> selectCustomers(Proxy pxy);

	public CustomerDTO selectCustomer(CustomerDTO cust);
	
	public CustomerDTO retriveCustomer(CustomerDTO cust);

	public int countCustomer(Proxy pxy);

	public void updateCustomer(CustomerDTO cust);

	public Map<String, Object> selectProfile(Proxy pxy);

	public void deleteCustomer(CustomerDTO cust);

	public Map<String, Object> SelectPhone(Proxy pxy);

}
