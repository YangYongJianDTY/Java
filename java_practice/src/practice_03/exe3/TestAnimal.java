package practice_03.exe3;

public class TestAnimal {

	public static void main(String[] args) {
		Fish d = new Fish();
		Cat c = new Cat("Fluffy");
		Animal a = new Fish();
		Animal e = new Spider();
		Pet p = new Cat();
		d.eat();
		d.walk();
		c.eat();
		c.walk();
		System.out.println("我的名字是" + c.getName());
		a.eat();
		a.walk();
		e.eat();
		e.walk();
		((Cat) p).eat();
		((Cat) p).walk();
	}

}
