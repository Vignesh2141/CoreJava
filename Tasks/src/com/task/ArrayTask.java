package com.task;

public class ArrayTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a1[]=new int[3];
   a1[0]=2;
   a1[1]=5;
   a1[2]=5;
   int a2[]= {3,6,2};
   int length=a1.length;
   System.out.println("The length of array is"+length);
   
  //Two dimensional array
   int a3[][]= {
		   {
			   3,46,54
		   },
		   {
			   54,56,79
		   }
   };
   System.out.println("The values of one dimensional array1 are");
   for(int i=0;i<3;i++) {
	   System.out.println(a1[i]);
	   
   }
   System.out.println("The values of one dimensional array2 are");
   for(int i=0;i<3;i++) {
	   System.out.println(a2[i]);
	   
   }
   System.out.println("The values of two dimensional array are");
   for(int i=0;i<a3.length;i++) {
	   for(int j=0;j<a3[i].length;j++) {
	   System.out.println(a3[i][j]);
	   }
	   
   }
   //Multi-dimensional array
   int a[][][]= {
		   {{64,578,356},{647,4736,578},{3635,4846,578}}
   };
   for(int i=0;i<a.length;i++) {
	   for(int j=0;j<a[i].length;j++) {
		   for(int k=0;k<a[i][j].length;k++)
	   System.out.println(a[i][j][k]);
	   }
	   
   }
   
	}

}
