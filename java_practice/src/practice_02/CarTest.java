package practice_02;

public class CarTest {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setNum("��A9752");
		car1.speedUp(20);
		
		Car car2 = new Car("��B5086", 150, 200);
		car2.speedDown(20);
		
		System.out.println("���ƺţ�" + car1.getNum() + " ���٣�" + car1.getSpeed() + 
				" ��������" + car1.getLoad());
		System.out.println("���ƺţ�" + car2.getNum() + " ���٣�" + car2.getSpeed() + 
				" ��������" + car2.getLoad());

	}

}
