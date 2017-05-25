package com.chapter6;

public class Circle {

	private double radius;
	
	Circle(double radius) throws FushuException
	{
		if(radius < 0)
			 throw new FushuException("Բ�뾶Ϊ����",radius);
		this.radius = radius;
	}
	
	public void setRadius(double radius) throws FushuException
	{
		if(radius < 0)
			 throw new FushuException("Բ�뾶Ϊ����",radius);
		this.radius = radius;
	}
	
	public double getArea()
	{
		return radius * radius * 3.14;
	}
	
}
