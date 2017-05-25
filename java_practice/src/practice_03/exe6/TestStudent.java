package practice_03.exe6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestStudent {
	//用list集合存放学生信息
	List <Student> students = new ArrayList();
	//添加学生信息
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
	//删除重复的学生信息
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
	//测试方法
	public static void main(String[] args) {
		TestStudent ts = new TestStudent();
		ts.add();
		ts.remove();
	}

}
