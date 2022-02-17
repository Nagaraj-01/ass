package com.example.curd.service;

import java.util.List;

import com.example.curd.dto.EmployeeDTO;
import com.example.curd.modal.Employee;

public interface EmployeeService {

	public EmployeeDTO addEmployee(EmployeeDTO employeeDTO);

	public List<Employee> getAllEmployees();

	public EmployeeDTO updateEmployee(EmployeeDTO employeeDTO);

	public String deleteEmployee(Long id);

	public EmployeeDTO getEmployeeById(Long id);

	public String updateEmployeeStatus(long id, String status);

}
