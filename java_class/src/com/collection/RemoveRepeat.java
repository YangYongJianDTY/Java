package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class RemoveRepeat {
	/*
	 * ͨ��hashset����ȥ���ظ�Ԫ��
	 * �÷�����������
	 */
	public static void remove1(String[] str) {
	
		HashSet <String> hset = new HashSet<String> (Arrays.asList(str));
		
		System.out.println(hset);
	}
	
	/*
	 * ͨ��treeset����ȥ���ظ�Ԫ��
	 * �÷�����������
	 */
	public static void remove2(String[] str) {
		
		TreeSet <String> tset = new TreeSet<String> (Arrays.asList(str));
		
		System.out.println(tset);
	}
	
	/*
	 * ͨ��list����ȥ���ظ�Ԫ�أ�
	 * �÷���������������
	 */
	public static void remove3(String[] str) {
		List<String> li = new ArrayList<String> ();
		for(String s:str) {
			if(!li.contains(s)) {
				li.add(s);
			}
		}
		System.out.println(li);
	}
	public static void main(String[] args) {
		String string[] = {"1","2","4","6","2","4","3"};
		remove1(string);
		remove2(string);
		remove3(string);
	}

}