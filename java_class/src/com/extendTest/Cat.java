package com.extendTest;

public class Cat extends Animal{
	private String color;
	
	public Cat(int age, String name, String color) {
		super(age, name);
		this.color = color;
	}
	public void eat() {
		System.out.println("fish");
	}
	public void speak() {
		System.out.println("miao");
	}
	
	
}
