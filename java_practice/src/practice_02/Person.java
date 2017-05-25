package practice_02;

public class Person {
	private String name;
	private int age;
	private String sex;
	
	public void setName(String aName) {
		this.name = aName;
	}
	public void setAge(int aAge) {
		this.age = aAge;
	}
	public void setSex(String aSex) {
		this.sex = aSex;
	}

	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public String getSex() {
		return this.sex;
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("kiven");
		p.setAge(18);
		p.setSex("man");
	    System.out.println("姓名: " + p.getName());
	    System.out.println("年龄: " + p.getAge());
	    System.out.println("性别: " + p.getSex());
	}
	
}
