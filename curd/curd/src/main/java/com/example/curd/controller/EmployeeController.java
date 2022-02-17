package com.example.curd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.curd.dto.EmployeeDTO;
import com.example.curd.modal.Employee;
import com.example.curd.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/save")
	private EmployeeDTO saveEmployee(@RequestBody EmployeeDTO employeeDTO) {
		return employeeService.addEmployee(employeeDTO);
	}

	@GetMapping("/get/{id}")
	private EmployeeDTO getEmployeeById(@PathVariable Long id) {
		return employeeService.getEmployeeById(id);
	}
	
	@GetMapping("/getAll")
	private List<Employee> getEmployeeById() {
		return employeeService.getAllEmployees();
	}
	
	@PutMapping("/update")
	private EmployeeDTO updateEmployee(@RequestBody EmployeeDTO employeeDTO) {
		return employeeService.updateEmployee(employeeDTO);
	}
	
	@DeleteMapping("/delete/{id}")
	private String updateEmployee(@PathVariable Long id) {
		return employeeService.deleteEmployee(id);
	}
	
	@PutMapping("/updateStatus")
	private String updateEmployee(@RequestParam String status, @RequestParam long id) {
		return employeeService.updateEmployeeStatus(id, status);
	}
	
}
