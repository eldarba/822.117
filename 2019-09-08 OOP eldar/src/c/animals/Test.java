package c.animals;

public class Test {

	public static void main(String[] args) {

		Animal animal;

		animal = new Dog();
		animal.speak();

		animal = new Cow();
		animal.speak();

		animal = new Cat();
		animal.speak();
	}
}
