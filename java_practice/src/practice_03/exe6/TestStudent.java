package practice_03.exe6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestStudent {
	//��list���ϴ��ѧ����Ϣ
	List <Student> students = new ArrayList();
	//���ѧ����Ϣ
	public void add() {
		Student[] ss = new Student[] {
				new Student(1, "Tom", 20),
				new Student(2, "Jack", 21),
				new Student(3, "John", 22),
				new Student(4, "Tom", 20),
				new Student(5, "John", 22)
		};
		students.addAll(Arrays.asList(ss));
	}
	//ɾ���ظ���ѧ����Ϣ
	public void remove() {
		List <Student> li = new ArrayList();
		for(Student s : students) {
			if(!li.contains(s)) {
				li.add(s);
			} 
		}
		for(Student l : li) {
			System.out.println("sid:" + l.num + ", name:"
				+ l.name + "; age:" + l.age);
		}
	}
	//���Է���
	public static void main(String[] args) {
		TestStudent ts = new TestStudent();
		ts.add();
		ts.remove();
	}

}
