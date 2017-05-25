package practice_02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
	/**
	 * 一个名为id的int类型私有数据，默认为0
	 * 一个名为balance的double类型私有数据，默认为0
	 * 一个名为annualRate的double类型私有数据，表示当前存款年利率，默认为0
	 * 一个名为dateCreated的Date类型私有数据，存储账户的开户日期
	 */
	private int id = 0;
	private double balance = 0;
	private double annualRate = 0;
	private Date dateCreated = new Date();
	
	/** 
	 * 一个能创建默认账户的无参构造方法
	 * 一个能创建带特定id、初始余额和年利率的账户的构造方法
	 */
	public Account() {}
	public Account(int aId, double aBalance, double aAnnualRate) {
		this.id = aId;
		this.balance = aBalance;
		this.annualRate = aAnnualRate;
	}

	/** 
	 * id、balance、annualRate的访问器和修改器
	 */
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return this.balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualRate() {
		return this.annualRate;
	}
	public void setAnnualRate(double annualRate) {
		this.annualRate = annualRate;
	}
	
	/** 
	 * dateCreated的访问器
	 */
	public Date getDateCreated() {
		return dateCreated;
	}

	/** 
	 * 一个名为getMonthlyRate()的方法，用于返回月利率
	 */
	public double getMonthlyRate() {
		return annualRate / 12;
	}

	/** 
	 * 一个名为withDraw的方法，从账户提取特定数额
	 */
	public void withDraw(double draw) {
		this.balance -= draw;
	}

	/** 
	 * 一个名为deposit的方法，向账户存储特定数额。
	 */
	public void deposit(double add) {
		this.balance += add;
	}
	
	/*
	 * 创建一个账户ID为1122、余额为20000元、年利率为4.5%的Account对象
	 * 使用方法取款2500元，使用方法存入3000元
	 * 然后打印余额、月利率以及这个账户的开户日期
	 */
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss");
		Account a = new Account(16058230, 20000, 0.045);
		a.withDraw(2500);
		a.deposit(3000);
		Date date = a.getDateCreated();
		System.out.println("余额：" + a.getBalance() + "； 月利率：" + 
				a.getMonthlyRate() * 100 + "%； 开户日期：" + sdf.format(date));
	}

}
