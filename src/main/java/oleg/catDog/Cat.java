package oleg.catDog;

public class Cat {
	// конструктор по умолчанию
	public Cat() {
		this.name = "";
		weight = 0;
	}
	
	// конструктор с параметрами
	public Cat(String newName, double newWeight) {
		name = newName;
		weight = newWeight;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		name = newName;
	}

	public double getWeight() {
		return weight;
	}
	public void setWeight(double newWeight) {
		weight = newWeight;
	}
	
	private String name;
	private double weight;
}
