package b.equalityCheck;

public class TestCar {

	public static void main(String[] args) {

		Car car1 = new Car(111, 100);
		Car car2 = new Car(111, 50);
		Car car3 = new Car(222, 50);
		Person person = new Person(101, "Avi", 32);

		System.out.println(car1 + " vs " + car2);
		System.out.println(car1.hashCode() + " vs " + car2.hashCode());
		System.out.println(car1.equals(car2));

		System.out.println(car1 + " vs " + car3);
		System.out.println(car1.hashCode() + " vs " + car3.hashCode());
		System.out.println(car1.equals(car3));

		System.out.println(car1 + " vs " + person);
		System.out.println(car1.equals(person));
	}

}
