/**
 * 
 */
package com.chapter1;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author jane
 *
 */


public class TestOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1=new String("you are a student");
		String s2=new String("how are you");
		if(s1.equals(s2)) //�ж�s1��s2�Ƿ���ͬ
		{
			System.out.println("s1��s2��ͬ");
		} 
		else
		{
			System.out.println("s1��s2����ͬ"); 
		}
		String s3=new String("22030219851022024");
		if(s3.startsWith("220302"))//�ж�s3��ǰ׺�Ƿ��ǡ�220302����
		{
			System.out.println("����ʡ�����֤");
		}
		
		String s4=new String("��");
		String s5=new String("��");
		if(s4.compareTo(s5)>0)//�����ֵ���Ƚ�s4��s5�Ĵ�С��
		{
			System.out.println("���ֵ���s4����s5");
		}
		else
		{
			System.out.println("���ֵ���s4С��s5");
		}

		int position=0;
		String path="c:\\java\\jsp\\A.java";
		position = path.lastIndexOf("\\"); //��ȡpath��������Ŀ¼�ָ����ŵ�λ��
		System.out.println("c:\\java\\jsp\\A.java��������\\��λ��:"+position); 
		path = path.substring(0,position);//��ȡ ��A.java���ļ���·����
		System.out.println(path);//�����A.java�ļ���·��Ϊ����c:\java\jsp�� 

		double m = 123.67;
		String s8=String.valueOf(m); //String����valuOf(int n)������mת��Ϊ�ַ�������
		position=s8.indexOf(".");//����s8�С�.����λ��
		String temp= s8.substring(position+1);//����substring������ȡs8�ġ�.��֮����ַ���
		System.out.println("����"+m+"��"+temp.length()+"λС��") ; //����м�λС��


		

	}
	
	

}
