package practice_01;

import java.util.Scanner;

public class T10 {
	//封装函数，计算整数中每个数字出现的次数
	public static int count (String str, int num) {
		int time = 0;
		for(int index = 0; index < str.length(); index++) {
			int inum = Integer.parseInt(str.charAt(index) + "");
			//System.out.println(inum == num);
			if(inum == num) {
				time++;
			};
		}
		return time;
	}
	public static void main(String[] args) {
		System.out.println("请输入一位整数：");
		
		Scanner scanner = new Scanner(System.in);
		int aNum = scanner.nextInt();	//接收整数aNum
		int [] nums = new int[10];	//储存每个数字的个数
		int max = 0, temp = 0;
		String str = aNum + "";	//将整数转化为字符串
		//遍历，输出数字出现的次数
		for(int i = 0; i <= 9; i++) {
			nums[i] = count(str, i);
			if(nums[i] != 0) {
				System.out.println("数字" + i + "出现了" + nums[i] + "次");
			}
		}
		//遍历，从大到小找出最多的次数并输出
		for(int i = 9; i >= 0; i--) {
			if(nums[i] > max) {
				max = nums[i];
				temp = i;
			}
		}
		System.out.println("最多的是" + temp + "，出现了" + max + "次");
		scanner.close();
	}
}
