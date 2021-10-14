package com.task;

import java.io.File;

public class FileTask {
	
	 public static void main(String args[]) 
	 { 
	 for (int i = 0; i<args.length; i++) 
	 { 
	 File f = new File("C:\\Users\\user\\eclipse-training\\Tasks\\src\\com\\task\\", args[i]); 
	 File f1 = new File("C:\\Users\\user\\eclipse-training\\Tasks\\src\\com\\task\\renfile"); 
	 if (f.exists()) 
	 { 
	 System.out.println(f + " does exists."); 
	 System.out.println("Its size is" + f.length()+ "bytes"); 
	 f.renameTo(f1); 
	 System.out.println("Renamed file name :" + f1 + (i+1)); 
	 System.out.println("deleting the renamed file"+f1+(i+1)); 
	 System.out.println ("======================="); 
	 f.delete(); 
	 } 
	 else 
	 System.out.println(f +" does not exists"); 
	 } 
	 } 
	 } 

