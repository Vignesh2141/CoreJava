package com.task;

public class Dog extends MultipleInherit{

	
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void food() {
		System.out.println("Dogs eat dogfood");
	}
	
	public static void main(String[] args) {
		Dog d=new Dog();
		d.Breath();
		d.food();

	}

}
