package com.bit_etland.web.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bit_etland.web.domain.EmployeeDTO;
@Repository
public class EmployeeMapperImpl implements EmployeeMapper {

	@Override
	public void insertEmployee(EmployeeDTO emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<EmployeeDTO> selectEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeDTO> selectEmployees(String serachWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeDTO selectEmployee(String serachWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countEmplotees() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existsEmployee(EmployeeDTO emp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateEmployee(EmployeeDTO emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(EmployeeDTO emp) {
		// TODO Auto-generated method stub
		
	}

}
