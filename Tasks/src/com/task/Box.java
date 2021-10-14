package com.task;

public class Box {
	private int length; 
	 private int breadth; 
	 public Box( ) 
	 { 
	 length =0; 
	 breadth =0; 
	 } 
	public Box(int x, int y) 
	{ 
	 length = x; 
	 breadth =y; 
	 } 
	public void setval(int x, int y) 
	{ 
	 length = x; 
	 breadth=y; 
	}
	public int area ( ) 
	{ 
	 return (length * breadth); 
	 } 
}
