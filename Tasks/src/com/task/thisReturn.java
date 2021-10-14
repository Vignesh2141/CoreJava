package com.task;

public class thisReturn {
	private int i = 0;
	thisReturn increment()
	 {
	 i++;
	 return this ;
	 }
	void print()
	 {
		 System.out.println ("The i value is" + i);
		 }
		public static void main (String arg[])
		 {
		 thisReturn tr = new thisReturn();
		 tr.increment().increment().increment().increment().print();
		 }
		} 


