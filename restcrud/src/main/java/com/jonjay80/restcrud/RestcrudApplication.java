package com.jonjay80.restcrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jonjay80.restcrud.model.Employee;
import com.jonjay80.restcrud.repository.EmployeeRepository;

@SpringBootApplication
public class RestcrudApplication implements ApplicationRunner {

	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(RestcrudApplication.class, args);
	}
	@Override
	public void run(ApplicationArguments arg0) throws Exception {
	   System.out.println("Adding data to H2 database");
	   employeeRepository.save(new Employee("John", "Smith", "johnsmith@gmail.com"));
	   employeeRepository.save(new Employee("Tina", "Cook", "tinacook242@gmail.com"));
	   employeeRepository.save(new Employee("Maria", "Jones", "mrsmariajones@gmail.com"));
	   employeeRepository.save(new Employee("Jose", "Rodriguez", "jrod2000@gmail.com"));
	   employeeRepository.save(new Employee("Malcolm", "Jones", "mj4ever@gmail.com"));

	}
}
