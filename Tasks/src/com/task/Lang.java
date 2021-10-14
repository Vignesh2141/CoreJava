package com.task;

import java.io.IOException;

public class Lang {
	public static void main(String a[])throws IOException 
	 { 
	 Runtime r; 
	 r = Runtime.getRuntime(); 
	 System.out.println(r.freeMemory()); 
	 int x[] = {1}; 
	 r.gc(); 
	 System.out.println(r.freeMemory()); 
	Process p = r.exec("paint.exe"); 
	System.out.println(r.freeMemory()); 
	 }

}
