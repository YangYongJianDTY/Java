package com.carSystem;

import java.util.Scanner;

public class RentSystem {
	Car cars[] = {
			new PassengerCar("奥迪A4",500,4),
			new PassengerCar("马自达",400,4),
			new Pickup("皮卡雪",450,2,4),
			new PassengerCar("金龙",800,20),
			new GoodsVan("松花江",400,4),
			new GoodsVan("依维柯",1000,20)
		};
	int count;
	int day;
	int money;
	//定义一个大数组，原来是cars.length,一旦租车数量大于6就不行 
	Car[] rent = new Car[100];
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		RentSystem hello = new RentSystem();
		System.out.println("欢迎使用答答租车系统：");
		System.out.println("您是否要租车：1 是 0 否");
		int select = input.nextInt();
		
		if(select == 0) {
			input.close();
			System.exit(-1);
		}
		System.out.println("您可租车的类型及其价目表：");
		System.out.println("序号 汽车名称 租金 容量");
		System.out.println("1. 奥迪A4  500/天 载人：4人");
		System.out.println("2. 马自达   400/天 载人：4人");
		System.out.println("3. 皮卡雪   450/天 载人：4人，载货：2吨");
		System.out.println("4. 金一龙   800/天 载人：20人");
		System.out.println("5. 松花江   500/天 载货：4吨");
		System.out.println("6. 依维柯 1000/天 载货：20吨");
		System.out.println("请输入您要租车额数量：");
		
		int rentNum = input.nextInt();
		for(int i = 0; i < rentNum; i++) {
			System.out.println("您要租的第" + (i + 1) + "辆车的序号");
			int a = input.nextInt();
			while(a < 1 || a > 6) {
				System.out.println("您输入的数据有问题，请重新输入");
				int b = input.nextInt();
				a = b;
			}
			int p = hello.cars[a-1].price;
			hello.money += p;
			hello.rent[i] = hello.cars[a-1];
		}
		System.out.println("您要租车的天数：");
		int c = input.nextInt();
		hello.money *= c;
		System.out.println("您的租车账单");
		int loadAmount = 0;
		int passengerAmount = 0;
		for(int i = 0; i < rentNum; i++) {
			System.out.print(hello.rent[i].name + " ");
			loadAmount += hello.rent[i].load;
			passengerAmount += hello.rent[i].pNum;
		}
		System.out.println();
		System.out.println("您的租车载人数量：" + passengerAmount + "人");
		System.out.println("您的租车载货量：" + loadAmount + "吨");
		System.out.println("您的租车总费用：" + hello.money + "元");
	}
}

