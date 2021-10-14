package com.task;

public class triangle extends shape{
	public void draw() {
		System.out.println("Drawing a trangle");
	}
    public void erase() {
    	System.out.println("Erasing a trangle");
    }
    public static void main(String[] args) {
 	   triangle tr=new triangle();
 	   tr.draw();
 	   tr.erase();

}
}