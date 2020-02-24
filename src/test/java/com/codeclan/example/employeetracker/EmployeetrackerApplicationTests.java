package com.codeclan.example.employeetracker;

import com.codeclan.example.employeetracker.models.Employee;
import com.codeclan.example.employeetracker.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeetrackerApplicationTests {
	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canAddEmployee(){
		Employee employee1 = new Employee("Gary", 33, "B1234", "theGreatest@life.com");
		employeeRepository.save(employee1);
	}

}
