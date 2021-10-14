package com.task;

public class staticTask2 {

	 static int a = 42;
	 static int b = 99;
	 static void callme()
	 {
	 System.out.println ("a =" + a);
	 }
	 }
	 class StaticByName
	 {
	 public static void main( String args[])
	 {
		 staticTask2.callme();
		 System.out.println ("b =" + staticTask2.b);
		 } 
}
