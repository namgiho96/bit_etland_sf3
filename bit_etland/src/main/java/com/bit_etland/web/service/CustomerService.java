package com.bit_etland.web.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.bit_etland.web.domain.CustomerDTO;
import com.bit_etland.web.proxy.Proxy;
@Component
public interface CustomerService {

	public void addCustomer(CustomerDTO cust);

	public List<CustomerDTO> bringCustomer(Proxy pxy);

	public List<CustomerDTO> retriveCustomers(Proxy pxy);

	public CustomerDTO retriveCustomer(CustomerDTO cust);

	public int countCustomer(Proxy pxy);

	public boolean existsCustomerID(CustomerDTO cust);

	public void modfyCustomer(CustomerDTO cust);
	
	public Map<String, Object> fileUpload(Proxy pxy);

	public void removeCustomer(CustomerDTO cust);
	
	public Map<String,Object> retrievePhone(Proxy pxy);
}
