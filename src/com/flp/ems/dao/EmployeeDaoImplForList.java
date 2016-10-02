package com.flp.ems.dao;
import com.flp.ems.domain.Employee;
import java.util.ArrayList;

import java.util.List;
Scanner sc = new Scanner(System.in);
public class EmployeeDaoImplForList implements IemployeeDao
{
 List<Employee> Employee_list = new ArrayList<Employee>();	
 
 Employee add_employee(Employee e)
 {
	 Employee_list.add(e);
	 
	 return e;
 }


 public void modify_employee(String emp_id)
 {
    for(Employee temp : Employee_list)
    {
        if(temp.getEmployeeid()==emp_id)
        {
            System.out.println("enter new name of employee");
            String name;
            name = sc.nextLine();
            temp.setEmployeeid(name);
        }

    }




 }

 public void remove_employee(String emp_id)
 {

for(int i=0;i< Employee_list.size();i++) {
    if ((Employee_list.get[i]).getEmployeeid() == emp_id) {
        Employee_list.remove(i);
    }

}



 
 
 
	


}
