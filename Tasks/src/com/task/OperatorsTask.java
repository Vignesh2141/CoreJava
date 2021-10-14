package com.task;

public class OperatorsTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int i=2;
         System.out.println("value of i:"+i);
         i++;
         System.out.println("value of i after using increment operator:"+i);
         i--;
         System.out.println("value of i after using decrement opertor:"+i);
         System.out.println("value of i "+i);
         System.out.println("value of i after using bitwise complement opertor:"+(~i));
         
         if(i != 0) {
        	 System.out.println("This statement will execute if the value of i is not equal to 0 ");
         }
         byte val1=5,val2=4;
         System.out.println("value of val1: "+val1+" value of val2: "+val2);
         System.out.println("Resuting value after using bitwise and operator on val1 and val2: "+(val1&val2));
         System.out.println("Resuting value after using bitwise or operator on val1 and val2: "+(val1|val2));
         System.out.println("Resuting value after using bitwise XoR operator on val1 and val2: "+(val1^val2));
         System.out.println("Resuting value after using bitwise left shift operator on val1 : "+(val1<<2));
         System.out.println("Resuting value after using bitwise right shift operator on val1 : "+(val1>>1));
         
         int a=1,b=4;
         
         int new1=(a+b)>5?1:0;
         System.out.println("The new vlaue is:"+new1);
         }
	

}
