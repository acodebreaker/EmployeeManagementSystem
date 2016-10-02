package com.flp.ems.service;

import java.util.HashMap;

import com.flp.ems.dao.EmployeeDaoImplForList;
import com.flp.ems.domain.Employee;

public class EmployeeServiceImpl implements IEmployeeService 
{

	
	public void AddEmployee(HashMap<String, String >hm)
	{
	Employee e= new Employee();
	e.setAddress(hm.get("Address"));
	e.setDateofjoining(hm.get("dateofjoining"));
		e.setDeptid(hm.get("deptId"));
		
		e.setEmailid(hm.get("emailId"));
		
		e.setKin(hm.get("kin"));
		
		e.setName(hm.get("name"));
		
		e.setPhoneno(hm.get("phoneno"));
		
		e.setProjectid(hm.get("projectId"));
		
		
		e.setRole(hm.get("role"));
		e.setEmployeeid("employeeid");
		
		
		EmployeeDaoImplForList temp= new EmployeeDaoImplForList();
			temp.add_employee(e);
		
		
	}
	public void  ModifyEmployee(String employeeid)
	{
        EmployeeDaoImplForList temp= new EmployeeDaoImplForList();
        temp.modify_employee();





	}
	public void RemoveEmployee(HashMap<String, String >hm){}
	public void SearchEmployee(HashMap<String, String >hm){}
	public void getAllEmployee(){
		
		
		EmployeeDaoImplForList temp= new EmployeeDaoImplForList();
		temp.printall();
	}
	
	
	
	
	
}
