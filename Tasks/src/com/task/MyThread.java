package com.task;

public class MyThread extends Thread{
	MyThread() 
	 { 
	 super ("Using Thread class"); 
	 System.out.println("Child thread:" + this);
	 start(); 
	 } 
	 public void run() 
	 { 
	 try 
	 { 
	 for ( int i =5; i > 0; i--) 
	 { 
	 System.out.println ("Child thread" + i); 
	 Thread.sleep(500); 
	 } 
	 } catch (InterruptedException e) { } 
	 System.out.println ("exiting child thread …"); 
	 } 
}
