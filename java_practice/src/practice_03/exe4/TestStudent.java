package practice_03.exe4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestStudent {
	List <Student> s = new ArrayList();
	//添加学生信息
	public void add() {
		Student s1 = new Student("张    三", "class1", "Java", 85);
		Student s2 = new Student("周乐儿", "class1", "C#  ", 79);
		Student s3 = new Student("王    涛", "class2", "C#  ", 52);
		Student s4 = new Student("李    明", "class2", "Java", 48);
		Student [] ss = new Student[] {s1, s2, s3, s4};
		s.addAll(Arrays.asList(ss));
	}
	//打印所有学生信息
	public void printInfo() {
		Iterator <Student> it = s.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(s.name + "  " + s.className + " " 
			+ s.course + " " + s.score);
		}
	}
	//打印班级平均分
	public void printClass(String className) {
		int score = 0, i = 0;
		Iterator <Student> it = s.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			String str = (String) s.className;
			if(str.equals(className)) {
				score += s.score;
				i++;
			}
		}
		double averJava = score / i;
		System.out.println(className + "班级的平均分为" + averJava + "；");
	}
	//打印课程平均分
	public void printCourse(String course) {
		int score = 0, i = 0;
		Iterator <Student> it = s.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			String str = (String) s.course;
			if(str.equals(course)) {
				score += s.score;
				i++;
			}
		}
		double aver = score / i;
		System.out.println(course + "课程的平均分为" + aver + "；");
	}
	//测试函数
	public static void main(String[] args) {
		TestStudent ts = new TestStudent();
		ts.add();
		ts.printInfo();
		ts.printClass("class1");
		ts.printCourse("Java");
		ts.printCourse("C#  ");
	}

}
