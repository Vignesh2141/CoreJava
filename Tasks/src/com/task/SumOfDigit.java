package com.task;

public class SumOfDigit {

	public static void main(String[] args) {
		int n=474847,temp=0,sum=0;
		while(n!=0) {
			temp=n%10;
			n=n/10;
			sum=sum+temp;
			
		}
		System.out.println("The sum of digits are"+sum);

	}

}
