package com.task;

public class Matrix {

	public static void main(String[] args) {
		int a[][]= {
				{1,5,34},
				{7,24,98},
				{3,6,4}
		};
		int b[][]= {
				{5,4,3},
				{
					7,4,3
				},
				{
					6,3,6
				}
		};
		int res1[][]= {{0,0,0},{0,0,0},{0,0,0}};
		int res2[][]={{0,0,0},{0,0,0},{0,0,0,}};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				res1[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				for(int k=0;k<a.length;k++)
				res2[i][j]=res2[i][j]+a[i][k]*b[k][j];
			}
		}
		System.out.println("The sum of 2 matrices is");
		for(int i=0;i<res1.length;i++) {
			for(int j=0;j<res1.length;j++) {
				System.out.print(res1[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("The product of 2 matrices is");
		
		for(int i=0;i<res2.length;i++) {
			for(int j=0;j<res2.length;j++) {
				System.out.print(res2[i][j]+" ");
			}
			System.out.println("");
		}

	}

}
