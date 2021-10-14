package com.task;
interface test{
	void square(int a);
}
public class arithmetic implements test {

	@Override
	public void square(int a) {
	 System.out.println("The Square of "+a+" is "+(a*a));
		
	}

	
}
