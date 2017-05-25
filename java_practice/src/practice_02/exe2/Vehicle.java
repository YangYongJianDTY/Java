package practice_02.exe2;

public class Vehicle {
	private double load;
	private double maxLoad;
	
	public Vehicle(double max_load) {
		this.maxLoad = max_load;
	}

	public double getLoad() {
		return this.load;
	}
	public double getMaxLoad() {
		return this.maxLoad;
	}
	public boolean addBox(double weight) {
		if(this.load + weight <= this.maxLoad) {
			this.load += weight;
			return true;
		}
		return false;
	}
}
