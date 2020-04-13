package com.org.lab1.collection;

import java.util.ArrayList;
import java.util.List;
import com.org.lab1.employee.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Collection {

	private List<Employee> empList= new ArrayList<Employee>();
	
	@Bean
	public List<Employee> getEmpList()
	{
		empList.add(new Employee(1001, "smriti",890000.0));
		empList.add(new Employee(1002,"ritu",95000.0));
		empList.add(new Employee(1003,"stuti", 20000.0));
		empList.add(new Employee(1004,"atul",55000.0));
		
		return empList;
	}
}
