package com.bit_etland.web.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.bit_etland.web.domain.CustomerDTO;
import com.bit_etland.web.proxy.Proxy;
@Service
public class CustomerServiceImpl implements CustomerService{

	@Override
	public void addCustomer(CustomerDTO cust) {
	
		
	}

	@Override
	public List<CustomerDTO> bringCustomer(Proxy pxy) {
	
		return null;
	}

	@Override
	public List<CustomerDTO> retriveCustomers(Proxy pxy) {
	
		return null;
	}

	@Override
	public CustomerDTO retriveCustomer(CustomerDTO cust) {
	
		return null;
	}

	@Override
	public int countCustomer(Proxy pxy) {
	
		return 0;
	}

	@Override
	public boolean existsCustomerID(CustomerDTO cust) {
	
		return false;
	}

	@Override
	public void modfyCustomer(CustomerDTO cust) {
	
		
	}

	@Override
	public Map<String, Object> fileUpload(Proxy pxy) {
	
		return null;
	}

	@Override
	public void removeCustomer(CustomerDTO cust) {
	
		
	}

	@Override
	public Map<String, Object> retrievePhone(Proxy pxy) {
	
		return null;
	}

}
