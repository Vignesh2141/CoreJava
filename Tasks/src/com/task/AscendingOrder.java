package com.task;

public class AscendingOrder {

	public static void main(String[] args) {
		int ar[]= {36,85,3976,88,21};
		int temp=0;
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[j]<ar[i]) {
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		System.out.println("The numbers after arranging in asceding orders are");
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}

	}

}

