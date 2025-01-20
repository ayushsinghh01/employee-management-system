package com.example.demo;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
    @Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Ayush");
		employee.setLastName("Singh");
		employee.setEmailId("ayushsingh723585@gmail.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstName("Piyush");
		employee1.setLastName("Singh");
		employee1.setEmailId("piyushsingh723585@gmail.com");
		employeeRepository.save(employee1);

		Employee employee2 = new Employee();
		employee2.setFirstName("Prince");
		employee2.setLastName("Pal");
		employee2.setEmailId("princepal652@gmail.com");
		employeeRepository.save(employee2);

		Employee employee3 = new Employee();
		employee3.setFirstName("Himanshu");
		employee3.setLastName("Yadav");
		employee3.setEmailId("himanshuyadav3585@gmail.com");
		employeeRepository.save(employee3);
	}
}
