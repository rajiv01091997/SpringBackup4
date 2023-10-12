package com.globallogic.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.globallogic.model.Employee;

public class Main {
	
	public static void main(String args[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("object.xml");
		
		Employee e=(Employee) context.getBean("emp");
		
		System.out.println(e);
		e.setEmpId(101);
		e.setEmpName("niraj");
		System.out.println(e);
			
	}

}
