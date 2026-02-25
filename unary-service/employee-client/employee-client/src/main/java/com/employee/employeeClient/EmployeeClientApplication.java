package com.employee.employeeClient;

import com.employee.employeeClient.service.EmployeeClientService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeClientApplication implements CommandLineRunner {

	EmployeeClientService employeeClientService;

	public EmployeeClientApplication(EmployeeClientService employeeClientService) {
		this.employeeClientService = employeeClientService;
	}

	public static void main(String[] args) {
		SpringApplication.run(EmployeeClientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Employee Client Application Started");
		System.out.println("Employee Details: " + employeeClientService.getEmployeeByName("Amit Kumar"));
	}
}
