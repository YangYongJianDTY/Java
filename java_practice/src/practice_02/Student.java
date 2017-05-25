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
			System.out.println("学号：" + ss[i].getNo() + " 姓名：" + ss[i].getName() + " 性别：" + 
			ss[i].getSex() + " 年龄：" + ss[i].getAge() + " 成绩：" + ss[i].getJava());
		}
		
		aver = sum / 5;
		System.out.println("这五个学生Java语言成绩的平均值为：" + aver);
		System.out.println("这五个学生Java语言成绩的最大值为：" + max);
		System.out.println("这五个学生Java语言成绩的最小值为：" + min);

	}
}
