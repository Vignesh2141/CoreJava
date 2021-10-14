package com.task;

public class TestMyThread {
	public static void main(String args[]) 
	 { 
	 new MyThread(); 
	 try { 
	 for ( int k = 5; k < 0; k--) 
	 { 
	 System.out.println ("Running main thread :" + k); 
	 Thread.sleep(1000); 
	 } 
	 }catch (InterruptedException e) { } 
	 System.out.println ("Exiting main thread . . ."); 
	 }
}
