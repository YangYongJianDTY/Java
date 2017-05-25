package com.user;

public class User {
	//声明变量
	private String userName;
	private String passWord;
	private String email;
	private int num;
	//构造函数
	public User(String userName, String passWord) {
		this.userName = userName;
		this.passWord = passWord;
		this.email = userName + "@game.com";
		num ++;
		 
	}	
	public User(String userName, String passWord, String email) {
		this.userName = userName;
		this.passWord = passWord;
		this.email = email;
		num ++;
	}	
	//定义方法
	public void setUser(String userName, String passWord) {
		this.userName = userName;
		this.passWord = passWord;
	}
	public String getName() {
		return userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public String getEmail() {
		return email;
	}
	public int getNum() {
		return num;
	}
	//重新构造equals,比较用户是否相同，系统的equals仅比较对象所存储的地址
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(obj.getClass() != getClass())
			return false;
		if(this == obj)
			return true;
		User other = (User) obj;
		return this.equals(other.userName) && this.equals(other.passWord);
	}
}
