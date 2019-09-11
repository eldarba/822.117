package d.animals;

public class Test {

	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		animals[0] = new Dog();
		animals[1] = new Cat();
		animals[2] = new Bird();

		for (int i = 0; i < animals.length; i++) {
			animals[i].speak();
			if (animals[i] instanceof Dog) {
				Dog dog = (Dog) animals[i];
				dog.bite();
			}
			if (animals[i] instanceof Bird) {
				Bird bird = (Bird) animals[i];
				bird.fly();
				bird.speak(5);
			}
			System.out.println("===========");
		}
	}

}
