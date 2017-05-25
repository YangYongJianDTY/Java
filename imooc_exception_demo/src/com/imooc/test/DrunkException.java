package com.imooc.test;

public class DrunkException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6276365945894721782L;

	public DrunkException(){
		
	}
	
	public DrunkException(String message){
		super(message);
	}
}
