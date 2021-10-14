package com.task;

public class circle extends shape{
	public void draw() {
		System.out.println("Drawing a circle");
	}
	public void erase() {
		System.out.println("Erasing a trangle");
	}
	 public static void main(String[] args) {
	 	   circle ci=new circle();
	 	   ci.draw();
	 	   ci.erase();

	}
}
