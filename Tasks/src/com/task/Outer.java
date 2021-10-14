package com.task;


public class Outer {
 public void display() {
	 System.out.println("The outer class");
	 
	 
 }
 public void test() {
	 Inner in=new Inner();
	 in.display();
 }
 

}
 class Inner extends Outer{
	
	

	public void display()
{
		System.out.println("inner class");
		}
}
