package com.task;
interface A4{
	void meth1();
	void meth2();
}
public class MyClass implements A4  {

	@Override
	public void meth1() {
		System.out.println("The first method is implemented");		
	}

	@Override
	public void meth2() {
		System.out.println("The second method is implemented");
		
	}
	public static void main(String[] args) {
		MyClass myname=new MyClass();
		myname.meth1();
		myname.meth2();
	}
	
 
}
