package com.example.curd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.curd.dto.EmployeeDTO;
import com.example.curd.modal.Employee;
import com.example.curd.repository.EmployeeRepository;
import com.example.curd.service.EmployeeService;
import com.example.curd.utils.EmployeeUtils;

@Service
public class EmplyeeServiceImpl extends EmployeeUtils implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public EmployeeDTO addEmployee(EmployeeDTO employeeDTO) {
		Employee save = employeeRepository.save(convertEmployeeDTOToDO(employeeDTO));
		return convertEmployeeDOToDTO(save);
	}

	@Override
	public EmployeeDTO updateEmployee(EmployeeDTO employeeDTO) {
		Employee save = employeeRepository.save(convertEmployeeDTOToDO(employeeDTO));
		return convertEmployeeDOToDTO(save);
	}

	@Override
	public String deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
		return "Employee Deleted Successfully";
	}

	@Override
	public EmployeeDTO getEmployeeById(Long id) {
		return convertEmployeeDOToDTO(employeeRepository.findById(id).get());
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> findAll = employeeRepository.findAll();
		return findAll;
	}

	@Override
	public String updateEmployeeStatus(long id, String status) {
		employeeRepository.updateEmployeeStatusById(id, status);
		return "Employee Status Updated Successfully";
	}

}
