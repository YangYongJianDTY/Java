package com._abstract;

public abstract class Polygon {
	private int num = 0;
	
	public Polygon(int num) {
		this.num = num;
	}
	
	public void print() {
		System.out.println("这是一个" + this.num + "边形;");
	}
}
