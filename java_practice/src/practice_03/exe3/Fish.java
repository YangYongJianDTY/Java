package practice_03.exe3;

public class Fish extends Animal implements Pet{
	private String name;
	public Fish() {
		super(0);
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
		System.out.println("�����㣬�һ���ˣ");
	}
	public void walk() {
		System.out.println("�����㣬�Ҳ�������");
	}
	@Override
	public void eat() {
		System.out.println("�����㣬�һ��Ϻ");
	};
}
