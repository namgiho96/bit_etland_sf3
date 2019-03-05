package com.bit_etland.web.mapper;

import java.util.List;

import com.bit_etland.web.domain.EmployeeDTO;

	

public interface EmployeeMapper {
	
	public void insertEmployee(EmployeeDTO emp);

	public List<EmployeeDTO> selectEmployee();

	public List<EmployeeDTO> selectEmployees(String serachWord);

	public EmployeeDTO selectEmployee(String serachWord);

	public int countEmplotees();

	public boolean existsEmployee(EmployeeDTO emp);

	public void updateEmployee(EmployeeDTO emp);

	public void deleteEmployee(EmployeeDTO emp);
}
