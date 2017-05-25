package com.extendTest;

public class Add2 extends Add1{
    public Add2(){
    	add(2);
    }
    public void add(int v){
	    i += v * 2;
        System.out.println(i);
    }
}