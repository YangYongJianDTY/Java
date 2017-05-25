package practice_02;

public class Student {
	private String sName;
	private String sSex;
	private int sNo;
	private int sAge;
	private double sJava;
	
	public Student(String aName, String aSex, int aNo, int aAge, double aJava) {
		this.sName = aName;
		this.sSex = aSex;
		this.sAge = aAge;
		this.sNo = aNo;
		this.sJava = aJava;
	}

	public String getName() {
		return this.sName;
	}
	public String getSex() {
		return this.sSex;
	}
	public int getNo() {
		return this.sNo;
	}
	public int getAge() {
		return this.sAge;
	}
	public double getJava() {
		return this.sJava;
	}

	public static void main(String[] args) {
		Student s1 = new Student("s1", "man", 101, 18, 68);
		Student s2 = new Student("s2", "man", 102, 18, 69);
		Student s3 = new Student("s3", "man", 103, 18, 70);
		Student s4 = new Student("s4", "man", 104, 18, 71);
		Student s5 = new Student("s5", "man", 105, 18, 72);
		Student[] ss = new Student[5];
		ss[0] = s1;
		ss[1] = s2;
		ss[2] = s3;
		ss[3] = s4;
		ss[4] = s5;
		double sum = 0;
		double aver = 0;
		double min = 100;
		double max = 0;
		
		for(int i = 0; i < 5; i++) {
			if(ss[i].sJava >= max) {
				max = ss[i].sJava;
			}
			if(ss[i].sJava <= min) {
				min = ss[i].sJava;
			}
			sum += ss[i].sJava;
			System.out.println("ѧ�ţ�" + ss[i].getNo() + " ������" + ss[i].getName() + " �Ա�" + 
			ss[i].getSex() + " ���䣺" + ss[i].getAge() + " �ɼ���" + ss[i].getJava());
		}
		
		aver = sum / 5;
		System.out.println("�����ѧ��Java���Գɼ���ƽ��ֵΪ��" + aver);
		System.out.println("�����ѧ��Java���Գɼ������ֵΪ��" + max);
		System.out.println("�����ѧ��Java���Գɼ�����СֵΪ��" + min);

	}
}
