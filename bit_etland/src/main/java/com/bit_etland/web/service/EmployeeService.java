package com.bit_etland.web.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bit_etland.web.domain.EmployeeDTO;
@Component
public interface EmployeeService {
	
	public void registEmployee(EmployeeDTO emp);

	public List<EmployeeDTO> bringEmployee();

	public List<EmployeeDTO> retriveEmployees(String serachWord);

	public EmployeeDTO retriveEmployee(String serachWord);

	public int countEmplotees();

	public boolean existEmployee(EmployeeDTO emp);

	public void modfyEmployee(EmployeeDTO emp);

	public void removeEmployee(EmployeeDTO emp);
}
