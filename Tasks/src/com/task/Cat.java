package com.task;

public class Cat extends MultipleInherit{
	public void food() {
		System.out.println("Cat drinks milk");
	}

	public static void main(String[] args) {
		Cat c=new Cat();
		c.Breath();
		c.food();

	}

}
