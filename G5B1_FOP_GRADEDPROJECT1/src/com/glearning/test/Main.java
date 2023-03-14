package com.glearning.test;

import com.glearning.department.AdminDepartment;
import com.glearning.department.HrDepartment;
import com.glearning.department.TechDepartment;

public class Main {
	
	public static void main(String[] args) {
		//Object created for Admin Department
		AdminDepartment adminDepartment=new AdminDepartment();
		//Object created for Hr Department
		HrDepartment hrDepartment=new HrDepartment();
		//Object created for Tech Department
		TechDepartment techDepartment=new TechDepartment();
		
		//output of all the functionalities in Admin Department
		System.out.println(adminDepartment.departmentName());
		System.out.println(adminDepartment.getTodaysWork());
		System.out.println(adminDepartment.getWorkDeadline());
		System.out.println(adminDepartment.isTodayAHoliday());
		
		System.out.println("--------------------------------");
		
		//output of all the functionalities in Hr Department
		System.out.println(hrDepartment.departmentName());
		System.out.println(hrDepartment.getTodaysWork());
		System.out.println(hrDepartment.getWorkDeadline());
		System.out.println(hrDepartment.doActivity());
		System.out.println(hrDepartment.isTodayAHoliday());
		
		System.out.println("--------------------------------");
		
		//output of all the functionalities in Tech Department
		System.out.println(techDepartment.departmentName());
		System.out.println(techDepartment.getTodaysWork());
		System.out.println(techDepartment.getWorkDeadline());
		System.out.println(techDepartment.getTechStackInformation());
		System.out.println(techDepartment.isTodayAHoliday());
		
	}

}
