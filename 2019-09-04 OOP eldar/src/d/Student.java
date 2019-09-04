package d;

public class Student {

	// fields
	private final int id;
	private String name;
	private int age = MIN_AGE;
	public static final int MAX_AGE = 120;
	public static final int MIN_AGE = 6;
	private static int counter;

	// initializer
	{
		counter++;
		this.id = Student.counter;
	}

	// CTOR 1
	/**
	 * creates a student with minimum age
	 */
	public Student() {

	}

	// CTOR 2
	public Student(String name, int age) {
		super();
		this.name = name;
		setAge(age);
	}

	// get / set methods

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= MIN_AGE && age <= MAX_AGE) {
			this.age = age;
		}
	}

	public int getId() {
		return id;
	}

	/** returns a string representation of this Student instance */
	public String getDetails() {
		return "Student[id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
