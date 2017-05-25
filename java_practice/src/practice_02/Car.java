package practice_02;

public class Car {
	private String num;
	private int speed;
	private double load;
	
	public Car() {
		this.num = "XX1234";
		this.speed = 100;
		this.load = 100;
	}
	public Car(String aNum, int aSpeed, double aLoad) {
		this.num = aNum;
		this.speed = aSpeed;
		this.load = aLoad;
	}
	
	public void speedUp(int temp) {
		this.speed += temp;
	}
	public void speedDown(int temp) {
		this.speed -= temp;
	}
	public void setNum(String aNum) {
		this.num = aNum;
	}
	
	public String getNum() {
		return this.num;
	}
	public int getSpeed() {
		return this.speed;
	}
	public double getLoad() {
		return this.load;
	}
}
