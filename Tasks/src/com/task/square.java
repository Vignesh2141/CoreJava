package com.task;

public class square extends shape {
      public void draw() {
    	  System.out.println("Drawing a square");
      }
      public void erase() {
    	  System.out.println("Erasing a square");
      }
	public static void main(String[] args) {
	   square sq=new square();
	   sq.draw();
	   sq.erase();

	}

}
