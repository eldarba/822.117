package d.animals;

public class Bird extends Animal {
	@Override
	public void speak() {
		System.out.println("speak like a bird");
	}

	// method overloading
	public void speak(int times) {
		for (int i = 0; i < times; i++) {
			speak();
		}
	}

	public void fly() {
		System.out.println("fly like a bird");
	}
}
