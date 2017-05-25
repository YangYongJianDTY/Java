package practice_02;

public class Counter {
	private int count;
	private int maxValue;
	
	public void increment() {
		this.count++;
		if(this.count > this.maxValue) {
			System.out.println("超过了最大值，出错");
			System.exit(-1);			
		}
	}
	public void dacrement() {
		this.count--;
		if(this.count < 0) {
			System.out.println("计数器值为负，出错");
			System.exit(-1);			
		}
	}
	
	public void setCount(int aCount) {
		this.count = aCount;
		if(this.count > this.maxValue) {
			System.out.println("超过了最大值，出错");
			System.exit(-1);			
		}
	}
	public void setMaxValue(int aMaxValue) {
		this.maxValue = aMaxValue;
		if(this.maxValue >= 2147483647) {
			System.out.println("最大值超出限度，出错");
			System.exit(-1);			
		}
	}
	
	public int getCount() {
		return this.count;
	}
	public int getMaxValue() {
		return this.maxValue;
	}
	
	public static void main(String[] args) {
        Counter c = new Counter();
        c.setMaxValue(20);
        c.setCount(10);
        System.out.println("计数器的值: " + c.getCount());
        System.out.println("计数器的最大值: " + c.getMaxValue());
    }
}
