package com.task;

public class MyClass1 implements Runnable {
	 static String message [ ] = {"Java", "is", "hot", "aromatic","and", "invigorating."};  
			 String name; 
	 public MyClass1 (String id) 
	 { 
	 name = id; 
	 } 
	 public void run ( ) 
	 { 
	 for (int i =0;i<message.length;++i) 
	 { 
	 randomWait ( ); 
	 System.out.println (name + message[i]) ; 
	 } 
	 } 
	 
	 void randomWait ( ) 
	 { 
	 try 
	 { 
	 Thread.currentThread ().sleep((long)(3000*Math.random())); 
	 } 
	 catch (InterruptedException x) 
	 { 
	 System.out.println ("Interrupted !"); 
	 } 
	 } 
}
