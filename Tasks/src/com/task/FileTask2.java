package com.task;

import java.io.File;
import java.io.IOException;

public class FileTask2 {
	 public static void main (String args[]) throws IOException {
		 File f = new File ("C:\\Users\\user\\eclipse-training\\Tasks\\src\\com\\task\\temp"); 
		 if (f.mkdir()) 
		 System.out.println("created a directory"); 
		 else 
		 System.out.println ("unable to create a directory"); 
		 } 
	 }

