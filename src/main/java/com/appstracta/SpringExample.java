package com.appstracta;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.appstracta.bean.Employee;
import com.appstracta.bean.Operations;

public class SpringExample {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/com/appstracta/bean/beans.xml");

		Employee employee = ctx.getBean(Employee.class);
		Operations operations = ctx.getBean(Operations.class);

		employee.setName("verde3ro");

		System.out.println("Nombre :: " + employee.getName());
		operations.saludar(employee.getName());
	}

}
