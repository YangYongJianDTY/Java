package practice_02;

public class CarTest {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setNum("辽A9752");
		car1.speedUp(20);
		
		Car car2 = new Car("辽B5086", 150, 200);
		car2.speedDown(20);
		
		System.out.println("车牌号：" + car1.getNum() + " 车速：" + car1.getSpeed() + 
				" 载重量：" + car1.getLoad());
		System.out.println("车牌号：" + car2.getNum() + " 车速：" + car2.getSpeed() + 
				" 载重量：" + car2.getLoad());

	}

}
