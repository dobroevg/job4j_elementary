package oleg.catDog;

public class App {
	public static void main(String[] args) {
//		CatDog catDog = new CatDog();
//		catDog.setCat(new Cat("Мурка", 1.5));
//		catDog.setDog(new Dog(4.2, "Merlin"));
		
		Cat cat = new Cat("Мурка", 1.5);
		Dog dog = new Dog(4.2, "Merlin");
		System.out.println(cat.getName());
		System.out.println(dog.name);
		CatDog catDog1 = new CatDog(cat, dog);
		System.out.println(catDog1.getName());
		System.out.println();

		CatDog catDog2 = new CatDog(cat, dog);
		catDog2.setName("cat dog");
		System.out.println(cat.getName());
		System.out.println(dog.name);
		System.out.println(catDog2.getName());
		System.out.println();

		catDog1.setCat(new Cat("Барсик", 0.9));
		System.out.println(cat.getName());
		System.out.println(dog.name);
		System.out.println(catDog1.getName());

//		CatDog catDog2 = new CatDog();
//		catDog2.setName("kitty puppy");
//		System.out.println(catDog2.getName());
	}
}
