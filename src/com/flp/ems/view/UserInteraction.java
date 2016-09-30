package com.flp.ems.view;

import java.util.HashMap;
import java.util.Scanner;

import com.flp.ems.service.EmployeeServiceImpl;

public class UserInteraction 
{
	
	
	Scanner sc = new Scanner(System.in);
	String name,employeeid,kin;
	String emailid,phoneno, dateofjoining,address,deptid , projectid,role;
      HashMap<String, String> hm= new HashMap<String , String>() ;
      
      EmployeeServiceImpl obj = new EmployeeServiceImpl();
      
      
	public void addEmployee()
{
		
		
	System.out.println("enter name");
	name =sc.nextLine();
	hm.put("name", name);
	
	System.out.println("enter Employeeid");
	employeeid =sc.nextLine();
	hm.put("employeeId", employeeid);
	
	
	System.out.println("enter kin");
	kin =sc.nextLine();
	hm.put("KIN", kin);
	
	
	System.out.println("enter emailid");
	emailid =sc.nextLine();
	hm.put("emailId", emailid);
	
	
	
	System.out.println("enter phone number");
	phoneno =sc.nextLine();
	hm.put("phoneno", phoneno);
	
	System.out.println("enter dateofjoining");
	dateofjoining =sc.nextLine();
	hm.put("dateofjoining", dateofjoining);
	
	System.out.println("enter address");
	address =sc.nextLine();
	hm.put("Address", address);
	
	
	
	System.out.println("enter department id");
	deptid =sc.nextLine();
	hm.put("deptId", deptid);
	
	
	System.out.println("enter role");
	role =sc.nextLine();
	hm.put("role", role);
	
	
	System.out.println("enter projectid");
	projectid =sc.nextLine();
	hm.put("projectid", projectid);

	obj.AddEmployee(hm);

}
	
	
public void modifyEmployee()
{
	
	
	
	
	
	
	


}
	


public void removeEmployee()
{
	
	

}
	

public void searchEmployee()
{
	

	
}

public void getAllEmployee()
{
	



}
	
	
	
	
	
}
