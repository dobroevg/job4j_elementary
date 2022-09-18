package oleg.catDog;

public class CatDog {
	public CatDog(Cat cat, Dog dog) {
		this.cat = cat;
		this.dog = dog;
		
		cashName();
	}
	
	public String getName() {
		//return cat.getName() + " " + dog.name;
		return nameCash;
	}
	public void setName(String newName) {
		String[] names = newName.split(" ", 2);
		cat.setName(names[0]);
		dog.name = names[1];
//
		cashName();
	}
	
	public double getWeight() {
		return cat.getWeight() + dog.weight;
	}
	
	public void setDog(Dog newDog) {
		dog = newDog;
		cashName();
	}
	public void setCat(Cat newCat) {
		cat = newCat;
		cashName();
	}

	
	private void cashName() {
		nameCash = cat.getName() + " " + dog.name;
	}
	
	
	private String nameCash;
	
	private Cat cat;
	private Dog dog;
}
