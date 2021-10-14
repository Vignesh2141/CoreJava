package com.task;

public class InterThread extends Thread {
	private int delay; 
	InterThread(String name, float seconds) 
	 { 
	 super (name); 
	 delay = (int)seconds * 1000;// delays are in milliseconds 
	 start(); // start up ourself!
	 
	 } 
	public void run ( ) 
	{ 
	 while (true) 
	 { 
	 System.out.println (Thread.currentThread( ).getName( ) ); 
	 try 
	 { 
	 Thread.sleep (delay); 
	 } 
	 catch (InterruptedException e) 
	 { 
	 return ; 
	 } 
	 } 
	} 
	public static void main (String argc[ ]) 
	 {
		new InterThread("one potato", 1.1F); 
	 new InterThread("two potato", 1.3F); 
	 new InterThread("three potato", 0.5F); 
	 new  InterThread("four", 0.7F); 
	}
}
