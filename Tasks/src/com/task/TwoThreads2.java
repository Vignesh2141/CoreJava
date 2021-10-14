package com.task;

public class TwoThreads2 {
	public static void main(String args[]) 
	 { 
	 TwoThreads1 m1 =new TwoThreads1("one"); 
	 TwoThreads1 m2 = new TwoThreads1("two"); 
	 System.out.println("Thread m1 is alive :"+ m1.t.isAlive()); 
	 System.out.println ("Thread m2 is alive:" + m1.t.isAlive()); 
	 try { 
	 System.out.println ("Waiting for thread to finish …."); 
	 m1.t.join(); 
	 m2.t.join(); 
	 } catch (InterruptedException e) { } 
	 System.out.println(" Thread m1 is alive :" + m1.t.isAlive()); 
	 System.out.println(" Thread m2 is alive :"+ m2.t.isAlive()); 
	 System.out.println (" Main thread exiting …"); 
	 }
}
