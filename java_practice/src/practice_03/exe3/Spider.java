package practice_03.exe3;

public class Spider extends Animal{
	public Spider() {
		super(8);
		System.out.println("所有的蜘蛛有" + this.legs + "条腿");
	}
	
	public void eat() {
		System.out.println("我是蜘蛛，我会吃虫");
	}
}
