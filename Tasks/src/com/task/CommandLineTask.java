package com.task;

public class CommandLineTask {

	public static void main(String[] args) {
		int[] arr=new int[args.length];
		int sum=0,invalid=0;
		int n=args.length;
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(args[i]);
		}
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		
		System.out.println("Sum of arguments is= "+sum);
		

	}

}
