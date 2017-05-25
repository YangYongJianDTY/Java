package com.chapter4.jicheng;

class Depend {  
	int i = 10;   
	public Depend() {  
		print();  
		i = 20;  
	}   
	void print() {  
		System.out.println("Depend=> " + this.i);  
	}  
}   
class Test1 extends Depend {  
	int i = 30;   
	public Test1() {  
		print();  
		super.print();  
		i = 40;  
	}   
	void print() {  
		System.out.println("Target=> " + i);  
	}  
}


public class Test {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new Test1();
	}

}
