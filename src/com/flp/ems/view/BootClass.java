package com.flp.ems.view;

import java.io.IOException;
import java.util.Scanner;

public class BootClass 
{
public static void main(String[] args) throws IOException
{
BootClass b=new BootClass();
	b.menu_selection();
	
	
}

public void menu_selection()
{

System.out.println("Welcome to employee management");
System.out.println("1 : Adding employee");
System.out.println("2 : modify employee");
System.out.println("3 : remove employee");
System.out.println("4 : search employee");
System.out.println("5 : Get all");


int temp;
Scanner sc = new Scanner(System.in);
temp=sc.nextInt();
UserInteraction u= new UserInteraction();

if(temp==1)
	u.addEmployee();

if(temp==2)
	u.modifyEmployee();

if(temp==3)
	u.removeEmployee();

if(temp==4)
	u.searchEmployee();

if(temp==5)
 u.getAllEmployee();


sc.close();
}

		
}
