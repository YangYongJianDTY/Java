package practice_02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
	/**
	 * һ����Ϊid��int����˽�����ݣ�Ĭ��Ϊ0
	 * һ����Ϊbalance��double����˽�����ݣ�Ĭ��Ϊ0
	 * һ����ΪannualRate��double����˽�����ݣ���ʾ��ǰ��������ʣ�Ĭ��Ϊ0
	 * һ����ΪdateCreated��Date����˽�����ݣ��洢�˻��Ŀ�������
	 */
	private int id = 0;
	private double balance = 0;
	private double annualRate = 0;
	private Date dateCreated = new Date();
	
	/** 
	 * һ���ܴ���Ĭ���˻����޲ι��췽��
	 * һ���ܴ������ض�id����ʼ���������ʵ��˻��Ĺ��췽��
	 */
	public Account() {}
	public Account(int aId, double aBalance, double aAnnualRate) {
		this.id = aId;
		this.balance = aBalance;
		this.annualRate = aAnnualRate;
	}

	/** 
	 * id��balance��annualRate�ķ��������޸���
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
	 * dateCreated�ķ�����
	 */
	public Date getDateCreated() {
		return dateCreated;
	}

	/** 
	 * һ����ΪgetMonthlyRate()�ķ��������ڷ���������
	 */
	public double getMonthlyRate() {
		return annualRate / 12;
	}

	/** 
	 * һ����ΪwithDraw�ķ��������˻���ȡ�ض�����
	 */
	public void withDraw(double draw) {
		this.balance -= draw;
	}

	/** 
	 * һ����Ϊdeposit�ķ��������˻��洢�ض����
	 */
	public void deposit(double add) {
		this.balance += add;
	}
	
	/*
	 * ����һ���˻�IDΪ1122�����Ϊ20000Ԫ��������Ϊ4.5%��Account����
	 * ʹ�÷���ȡ��2500Ԫ��ʹ�÷�������3000Ԫ
	 * Ȼ���ӡ���������Լ�����˻��Ŀ�������
	 */
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��  HH:mm:ss");
		Account a = new Account(16058230, 20000, 0.045);
		a.withDraw(2500);
		a.deposit(3000);
		Date date = a.getDateCreated();
		System.out.println("��" + a.getBalance() + "�� �����ʣ�" + 
				a.getMonthlyRate() * 100 + "%�� �������ڣ�" + sdf.format(date));
	}

}
