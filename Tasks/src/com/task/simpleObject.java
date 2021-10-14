package com.task;

public class simpleObject {
	
	String message;

	public simpleObject(String message) {
		this.message = message;
	}

	public static void main(String[] args) {
		
      simpleObject mes=new simpleObject("Hello world");
      System.out.println("The message is "+mes.message);
	}

}
