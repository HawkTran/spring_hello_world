package com.Springframework_Jdbc;
import java.util.List;
import javax.sql.DataSource;

public interface EmployeeDAO {
	
	public void setDataSource(DataSource ds);

	public void create(String name,Integer age);
	
	public Employee getEmployee(Integer id);
	
	public List<Employee> listEmployees();
	
	public void delete(Integer id);
	
	public void update(Integer id,Integer age);
}
