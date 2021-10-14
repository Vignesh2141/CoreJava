package com.task;

public class TwoThreads1 extends Thread{
	String tname; 
	 Thread t; 
	 
	 TwoThreads1(String s) 
	 { 
	 tname = s; 
	 t = new Thread(this, s); 
	 System.out.println ("New thread :" + t); 
	 t.start(); 
	 } 
	 public void run() 
	 { 
	 try 
	 { 
	 for(int i = 5; i > 0; i--) 
	 { 
	 System.out.println (tname + ":" + i ); 
	 Thread.sleep (500) ; 
	 } 
	 } catch (InterruptedException e) { } 
	 System.out.println(tname+"exiting…."); 
	 }
}
