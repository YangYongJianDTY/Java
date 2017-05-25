package practice_01;

import java.util.Scanner;

public class T03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一个四位数：");
		Scanner scanner = new Scanner(System.in);
		String num = scanner.next();
		//int[] num = new int[4];
		for(int i = 0; i < 4; i++){
			System.out.print(num.charAt(i) + " ");
		}
		scanner.close();
	}

}
