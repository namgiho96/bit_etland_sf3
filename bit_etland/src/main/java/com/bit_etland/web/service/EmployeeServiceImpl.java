package com.bit_etland.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bit_etland.web.domain.EmployeeDTO;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public void registEmployee(EmployeeDTO emp) {
	
		
	}

	@Override
	public List<EmployeeDTO> bringEmployee() {
	
		return null;
	}

	@Override
	public List<EmployeeDTO> retriveEmployees(String serachWord) {
	
		return null;
	}

	@Override
	public EmployeeDTO retriveEmployee(String serachWord) {
	
		return null;
	}

	@Override
	public int countEmplotees() {
	
		return 0;
	}

	@Override
	public boolean existEmployee(EmployeeDTO emp) {
	
		return false;
	}

	@Override
	public void modfyEmployee(EmployeeDTO emp) {
	
		
	}

	@Override
	public void removeEmployee(EmployeeDTO emp) {
	
		
	}

}
