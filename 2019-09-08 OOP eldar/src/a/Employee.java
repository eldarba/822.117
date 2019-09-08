package a;

public class Employee extends Person {

	// fields
	private double salary;

	public Employee(int id, String name, int age, double salary) {
		super(id, name, age); // invoke super class CTOR
		setSalary(salary);
	}

	public Employee() {
	}

	// methods
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
