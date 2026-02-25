package com.example.EmployeegRPC.repository;

import com.example.EmployeegRPC.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
