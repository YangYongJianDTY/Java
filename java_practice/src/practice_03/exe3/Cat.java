package practice_03.exe3;

public class Cat extends Animal implements Pet{
	private String name;
	public Cat(String name) {
		super(4);
		this.name = name;
		System.out.println("所有的猫有" + this.legs + "条腿");
	}
	public Cat() {
		this("");
	}
	@Override
	public String getName() {
		return this.name;
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void play() {
		System.out.println("我是猫，我会玩耍");
	}
	@Override
	public void eat() {
		System.out.println("我是猫，我会吃鱼");
	};
}
