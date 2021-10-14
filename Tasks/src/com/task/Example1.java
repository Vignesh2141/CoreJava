package com.task;

public class Example1 {
	 public static void main(String args[]){ 
		   try{ 
		     ThrowsExample obj=new ThrowsExample(); 
		     obj.myMethod(1); 
		   }catch(Exception ex){
		     System.out.println(ex);
		    } 
		  }
}
