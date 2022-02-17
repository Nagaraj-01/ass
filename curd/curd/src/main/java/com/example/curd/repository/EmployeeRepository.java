package com.example.curd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.curd.modal.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
	@Transactional
	@Modifying
	@Query("update Employee e set e.active = :status where e.id = :id ")
	public void updateEmployeeStatusById(@Param("id") long id, @Param("status") String status );

}
