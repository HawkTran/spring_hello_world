package com.Springframework_Jdbc;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeJDBCTemplate implements EmployeeDAO {
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	public void setDataSource(DataSource dataSource) {
		 this.dataSource = dataSource;
		 this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	public void create(String name, Integer age) {
		 String SQL = "insert into Employee (NAME, AGE) values (?, ?)";
		      
		  jdbcTemplateObject.update( SQL, name, age);
		  System.out.println("Created Record NAME = " + name + " AGE = " + age);
		  return;
	}
	public Employee getEmployee(Integer id) {
		      String SQL = "select * from Employee where ID = ?";
		      Employee employee = jdbcTemplateObject.queryForObject(SQL, 
		                        new Object[]{id}, new EmployeeMapper());
		      return employee;
	}
	public List<Employee> listEmployees() {
		      String SQL = "select * from Employee";
		      List <Employee> employees = jdbcTemplateObject.query(SQL, 
		                                new EmployeeMapper());
		      return employees;
	}
	
	public void delete(Integer id) {
	      String SQL = "delete from Employee where ID = ?";
	      jdbcTemplateObject.update(SQL, id);
	      System.out.println("Deleted Record with ID = " + id );
	      return;
		
	}
	
	public void update(Integer id, Integer age) {
	      String SQL = "update Employee set AGE = ? where ID = ?";
	      jdbcTemplateObject.update(SQL, age, id);
	      System.out.println("Updated Record with ID = " + id );
	      return;
		
	}	
}
