package practice_03.exe4;

public class Student {
	protected String name;
	protected String className;
	protected String course;
	protected int score;
	
	public Student(String name, String className, String course, int score) {
		this.name = name;
		this.className = className;
		this.course = course;
		this.score = score;
	}

/*	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		if (course == null) {
			if (other.course != null)
				return false;
		} else if (!course.equals(other.course))
			return false;
		return true;
	}
*/	
	
}
