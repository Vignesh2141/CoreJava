package com.task;
import java.math.*;

public class controlStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int sub1=60,sub2=72,sub3=86;
    int total=sub1+sub2+sub3;
    
    System.out.println("Your percentage"+total);
     if(total>105) {
    	 System.out.println("You have passed");
     }
     else {
    	 System.out.println("You have failed");
     }
     
     if(sub1<35) {
    	 System.out.println("You have failed in sub1");
     }
     else if(sub2<35) {
    	 System.out.println("You have failed in sub2");
     }
     else if(sub3<35) {
    	 System.out.println("You have failed in sub3");
     }
     else {
    	 System.out.println("You have passed in all subjects");
    	 
     }
    switch(sub1) {
    case 0:System.out.println("sub1 is 0");
            break;
    case 60:System.out.println("sub1 not 0");
            break;
    }
    
    for(int i=1;i<=3;i++) {
     System.out.println("This statemnet  is excuteed "+i+"time");
	}
	int j=1;
	
	while(j<=3) {
		System.out.println("value of j"+j);
		j++;
	}
	int k=5;
	do {
		System.out.println("value of k"+k);
	}while(k<3);
			
	}
}
