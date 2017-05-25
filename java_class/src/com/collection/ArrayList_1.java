package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_1 {

	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<String> ();
		alist.add("java001");
		alist.add("java002");
		alist.add("java001");
		alist.add("java003");
		alist.add("java002");
		alist.add("java004");
		
		ArrayList<String> newlist = singleElement(alist);
		System.out.println(newlist);
	}
	
	public static ArrayList<String> singleElement(ArrayList<String> alist) {
		ArrayList<String> arr = new ArrayList<String> ();
		
		Iterator<String> it = alist.iterator();
		while(it.hasNext()) {
			String s = it.next();
			if(!arr.contains(s)) {
				arr.add(s);
			}
		}
		return arr;
	}
}
