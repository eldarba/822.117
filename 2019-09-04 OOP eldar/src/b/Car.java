package b;

public class Car {

	// constant
	public static final int MAX_SPEED = 120;

	// class variables
	private static int numberOfCarsMade;

	// class method
	public static int getNumberOfCarsMade() {
		return numberOfCarsMade;
	}

	// instance variables
	// fields
	int id; // default access level = package private
	private final int number; // final cannot be changed after initialization
	private int speed;
	private String color;

	{ // initializer (pre CTOR)
		numberOfCarsMade++;
	}

	// CTOR 1
	public Car() {
		this.number = -1;
	}

	// CTOR 2
	public Car(int number, int speed, String color) {
		this.number = number;
		setSpeed(speed);
		this.color = color;
	}

	// getter and setter methods
	public int getNumber() {
		return number;
	}

	public int getSpeed() {
		return this.speed;
	}

	public void setSpeed(int speed) {
		if (speed >= 0 && speed <= MAX_SPEED) {
			this.speed = speed;
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void go() {
		System.out.println("car is mooving");
	}

	public void stop() {
		System.out.println("car stopped");
	}

}
