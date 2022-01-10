package com.assignment;

	import javax.annotation.PostConstruct;
	import javax.annotation.PreDestroy;

	public class Program {
		
		private String text;
		  
		  public String getText() {
		    return text;
		  }

		  public void setText(String text) {
		    this.text = text;
		  }

		  public void doSomething(){
		    System.out.println("Bean method called. Text is: " + text);
		  }
		  
		  @PostConstruct
		  public void initialize(){
		    System.out.println("After bean initialization");
		  }
		  
		  @PreDestroy
		  public void cleanup(){
		    System.out.println("Cleaning up");
		  }
	}



