package practice_03.exe3;

public class Cat extends Animal implements Pet{
	private String name;
	public Cat(String name) {
		super(4);
		this.name = name;
		System.out.println("���е�è��" + this.legs + "����");
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
		System.out.println("����è���һ���ˣ");
	}
	@Override
	public void eat() {
		System.out.println("����è���һ����");
	};
}
