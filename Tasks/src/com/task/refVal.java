package com.task;

public class refVal {

	public void add(int a,int b) {
		int sum=0;
		sum=a+b;
		System.out.println("the sum of 2 numbers are="+sum);
		
	}
	public static void main(String[] args) {
		int a=6,b=4;
		refVal ob=new refVal();
		ob.add(10, 54);//call by value
		ob.add(a, b);//call by reference

	}

}
