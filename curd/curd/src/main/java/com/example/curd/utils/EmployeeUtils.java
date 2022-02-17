package com.example.curd.utils;

import com.example.curd.dto.EmployeeDTO;
import com.example.curd.modal.Employee;

public class EmployeeUtils {

	public Employee convertEmployeeDTOToDO(EmployeeDTO employeeDTO) {
		Employee employee = new Employee();
		employee.setFirstName(employeeDTO.getFirstName());
		employee.setEmailid(employeeDTO.getEmailid());
		employee.setLasName(employeeDTO.getLasName());
		employee.setId(employeeDTO.getId());
		return employee;
	}

	public EmployeeDTO convertEmployeeDOToDTO(Employee employee) {
		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setFirstName(employee.getFirstName());
		employeeDTO.setEmailid(employee.getEmailid());
		employeeDTO.setLasName(employee.getLasName());
		employeeDTO.setId(employee.getId());
		return employeeDTO;
	}

}
