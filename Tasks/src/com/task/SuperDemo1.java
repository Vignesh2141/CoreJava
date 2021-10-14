package com.task;

public class SuperDemo1 extends SuperDemo {
 static	int c;
	

	


	





	public SuperDemo1(int a, int b, int c) {
		super(a, b);
		this.c = c;
	}

  public static int add() {
      int sum=0;
      try {
	 sum=  a+b+c;
      }catch(Exception e) {
    	  e.printStackTrace();
      }
	  return sum;
  }









	public static void main(String[] args) {
	    SuperDemo1 ob=new SuperDemo1(4,7,4); 
	    System.out.println("The sum of 3 numbers is "+add());
      
	}

}
