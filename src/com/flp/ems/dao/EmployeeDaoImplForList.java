package com.flp.ems.dao;
import com.flp.ems.domain.Employee;
import java.util.ArrayList;

import java.util.List;

public class EmployeeDaoImplForList implements IemployeeDao
{
 List<Employee> Employee_list = new ArrayList<Employee>();	
 
 public void add_employee(Employee e)
 {
	 Employee_list.add(e);
	 
	 
	 System.out.println("name is  " +e.getName());
	 
	 System.out.println("emp id  is  " + e.getEmployeeid()   );
	 
	 
 }
 public void printall()
 {
	 for(int i=0;i<Employee_list.size();i++)
	 {
		String s=(Employee_list.get(i)).getName(); 
	System.out.println(s);
		 
	 }
	 
	 
	 
 }
 
 
 
 
 
	
	
	
	
	
	





}
