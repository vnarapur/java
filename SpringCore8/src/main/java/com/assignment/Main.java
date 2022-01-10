package com.assignment;

	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class Main {
		public static void main( String[] args ) {
		    ApplicationContext ctx = 
		       new ClassPathXmlApplicationContext("bean.xml");
		    Program b = (Program) ctx.getBean("Program");
		    b.doSomething();

		    // Explicitly closing application 
		    // context to force bean cleanup
		    ((ClassPathXmlApplicationContext)ctx).close();    
		  }

	}
