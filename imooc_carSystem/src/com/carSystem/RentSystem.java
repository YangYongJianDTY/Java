package com.carSystem;

import java.util.Scanner;

public class RentSystem {
	Car cars[] = {
			new PassengerCar("�µ�A4",500,4),
			new PassengerCar("���Դ�",400,4),
			new Pickup("Ƥ��ѩ",450,2,4),
			new PassengerCar("����",800,20),
			new GoodsVan("�ɻ���",400,4),
			new GoodsVan("��ά��",1000,20)
		};
	int count;
	int day;
	int money;
	//����һ�������飬ԭ����cars.length,һ���⳵��������6�Ͳ��� 
	Car[] rent = new Car[100];
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		RentSystem hello = new RentSystem();
		System.out.println("��ӭʹ�ô���⳵ϵͳ��");
		System.out.println("���Ƿ�Ҫ�⳵��1 �� 0 ��");
		int select = input.nextInt();
		
		if(select == 0) {
			input.close();
			System.exit(-1);
		}
		System.out.println("�����⳵�����ͼ����Ŀ��");
		System.out.println("��� �������� ��� ����");
		System.out.println("1. �µ�A4  500/�� ���ˣ�4��");
		System.out.println("2. ���Դ�   400/�� ���ˣ�4��");
		System.out.println("3. Ƥ��ѩ   450/�� ���ˣ�4�ˣ��ػ���2��");
		System.out.println("4. ��һ��   800/�� ���ˣ�20��");
		System.out.println("5. �ɻ���   500/�� �ػ���4��");
		System.out.println("6. ��ά�� 1000/�� �ػ���20��");
		System.out.println("��������Ҫ�⳵��������");
		
		int rentNum = input.nextInt();
		for(int i = 0; i < rentNum; i++) {
			System.out.println("��Ҫ��ĵ�" + (i + 1) + "���������");
			int a = input.nextInt();
			while(a < 1 || a > 6) {
				System.out.println("����������������⣬����������");
				int b = input.nextInt();
				a = b;
			}
			int p = hello.cars[a-1].price;
			hello.money += p;
			hello.rent[i] = hello.cars[a-1];
		}
		System.out.println("��Ҫ�⳵��������");
		int c = input.nextInt();
		hello.money *= c;
		System.out.println("�����⳵�˵�");
		int loadAmount = 0;
		int passengerAmount = 0;
		for(int i = 0; i < rentNum; i++) {
			System.out.print(hello.rent[i].name + " ");
			loadAmount += hello.rent[i].load;
			passengerAmount += hello.rent[i].pNum;
		}
		System.out.println();
		System.out.println("�����⳵����������" + passengerAmount + "��");
		System.out.println("�����⳵�ػ�����" + loadAmount + "��");
		System.out.println("�����⳵�ܷ��ã�" + hello.money + "Ԫ");
	}
}

