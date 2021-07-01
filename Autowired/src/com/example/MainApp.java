package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee e = (Employee)context.getBean("emp");
		
		Address a1=new Address();
		a1.setCity("BLR");
		e.setAddress(a1);
		System.out.println(e.getEmpId());
		System.out.println(e.getName());
		System.out.println(e.getAddress().getCity());
		
		
		//emp2
		Employee e2 = (Employee)context.getBean("emp2");
		Address a2=new Address();
		a2.setCity("Delhi");
		e2.setAddress(a2);
		System.out.println(e2.getEmpId());
		System.out.println(e2.getName());
		
		System.out.println(e2.getAddress().getCity());

	}

}
