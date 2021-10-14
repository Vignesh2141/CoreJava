package com.task;

public class MultiThread1 {
	public static void main (String args[ ]) 
	 { 
	 Thread thread1 = new Thread (new MyClass1("thread1:") ); 
	 Thread thread2 = new Thread (new MyClass1("thread2:") ); 
	 thread1.start ( ); 
	 thread2.start ( ); 
	 boolean thread1IsAlive = true; 
	 boolean thread2IsAlive = true; 
	 do { 
	 if (thread1IsAlive && !thread1.isAlive ( ) ) 
	 { 
	 thread1IsAlive = false; 
	 System.out.println ("Thread 1 is dead."); 
	 } 
	 if (thread2IsAlive && !thread2.isAlive ( )) 
	 { 
	 thread2IsAlive = false; 
	 System.out.println ("Thread 2 is dead."); 
	 } 
	 } while (thread1IsAlive || thread2IsAlive ); 
	 }
}
