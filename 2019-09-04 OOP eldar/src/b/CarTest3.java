package b;

public class CarTest3 {

	public static void main(String[] args) {

		// invoke static methods using the class as the reference (static reference)
		System.out.println("cars made: " + Car.getNumberOfCarsMade());

		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car(111, 30, "Red");

		// Car.numberOfCarsMade = 100;

		System.out.println("cars made: " + Car.getNumberOfCarsMade());

		System.out.println("max car speed: " + Car.MAX_SPEED);
//		Car.MAX_SPEED++;
	}

}
