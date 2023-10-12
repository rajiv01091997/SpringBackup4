package com.globallogic.application;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.globallogic.model.Employee;

public class Main {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ApplicationContext context=new ClassPathXmlApplicationContext("object.xml");
		
		Employee e=(Employee) context.getBean("emp");
		System.out.println("Enter empId and name");
		e.setEmpId(sc.nextInt());
		e.setEmpName(sc.next());
		
		System.out.println(e);
	}

}
