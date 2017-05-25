package practice_02;

public class Tree {
	private int ages = 0;
	public void grow(int years) {
		this.ages += years;
	}
	public int age() {
		return this.ages;
	}
	
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.grow(2);
		tree.grow(1);
	    System.out.println("Ê÷µÄÄêÁäÎª: " + tree.age());
	}
}
