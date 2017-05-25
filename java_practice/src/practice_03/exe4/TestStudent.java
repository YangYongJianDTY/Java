package practice_03.exe4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestStudent {
	List <Student> s = new ArrayList();
	//����ѧ����Ϣ
	public void add() {
		Student s1 = new Student("��    ��", "class1", "Java", 85);
		Student s2 = new Student("���ֶ�", "class1", "C#  ", 79);
		Student s3 = new Student("��    ��", "class2", "C#  ", 52);
		Student s4 = new Student("��    ��", "class2", "Java", 48);
		Student [] ss = new Student[] {s1, s2, s3, s4};
		s.addAll(Arrays.asList(ss));
	}
	//��ӡ����ѧ����Ϣ
	public void printInfo() {
		Iterator <Student> it = s.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(s.name + "  " + s.className + " " 
			+ s.course + " " + s.score);
		}
	}
	//��ӡ�༶ƽ����
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
		System.out.println(className + "�༶��ƽ����Ϊ" + averJava + "��");
	}
	//��ӡ�γ�ƽ����
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
		System.out.println(course + "�γ̵�ƽ����Ϊ" + aver + "��");
	}
	//���Ժ���
	public static void main(String[] args) {
		TestStudent ts = new TestStudent();
		ts.add();
		ts.printInfo();
		ts.printClass("class1");
		ts.printCourse("Java");
		ts.printCourse("C#  ");
	}

}