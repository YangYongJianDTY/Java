package practice_01;

import java.util.Scanner;

public class T10 {
	//��װ����������������ÿ�����ֳ��ֵĴ���
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
		System.out.println("������һλ������");
		
		Scanner scanner = new Scanner(System.in);
		int aNum = scanner.nextInt();	//��������aNum
		int [] nums = new int[10];	//����ÿ�����ֵĸ���
		int max = 0, temp = 0;
		String str = aNum + "";	//������ת��Ϊ�ַ���
		//������������ֳ��ֵĴ���
		for(int i = 0; i <= 9; i++) {
			nums[i] = count(str, i);
			if(nums[i] != 0) {
				System.out.println("����" + i + "������" + nums[i] + "��");
			}
		}
		//�������Ӵ�С�ҳ����Ĵ��������
		for(int i = 9; i >= 0; i--) {
			if(nums[i] > max) {
				max = nums[i];
				temp = i;
			}
		}
		System.out.println("������" + temp + "��������" + max + "��");
		scanner.close();
	}
}
