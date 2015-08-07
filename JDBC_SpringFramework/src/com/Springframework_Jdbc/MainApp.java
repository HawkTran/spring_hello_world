package com.Springframework_Jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.Springframework_Jdbc.EmployeeJDBCTemplate;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("Beans.xml");
		
		EmployeeJDBCTemplate employeeJDBCTemplate = 
				(EmployeeJDBCTemplate)context.getBean("employeeJDBCTemplate");
		System.out.println("---------Creation--------");
		employeeJDBCTemplate.create("Hawk Tran", 22);
		employeeJDBCTemplate.create("Hieu Tran", 22);
		employeeJDBCTemplate.create("Harold Nguyen", 21);
		employeeJDBCTemplate.create("Huck Nguyen", 23);
		employeeJDBCTemplate.create("Tom Tran", 22);
		
		System.out.println("---------List Employee--------");
		List<Employee> employees = employeeJDBCTemplate.listEmployees();
		for(Employee record : employees){
	         System.out.print("ID : " + record.getId() );
	         System.out.print(", NAME : " + record.getName() );
	         System.out.println(", AGE : " + record.getAge());			
		}
		
		System.out.println("---------Update Employee with ID = 1--------");
		employeeJDBCTemplate.update(1,25);
		System.out.println("---------Employee with ID = 1 --------");
		Employee employee = employeeJDBCTemplate.getEmployee(1);
	     System.out.print("ID : " + employee.getId() );
	     System.out.print(", NAME : " + employee.getName() );
	     System.out.println(", AGE : " + employee.getAge());			
		
		
	}

}
