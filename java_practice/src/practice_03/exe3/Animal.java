package practice_03.exe3;

public abstract class Animal {
	protected int legs;
	
	protected Animal(int legs) {
		this.legs = legs;
	}
	public abstract void eat();
	public void walk() {
		System.out.println("我会走，我有" + this.legs + "条腿");
	}
}
