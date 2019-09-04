package b;

public class PersonTest {

	public static void main(String[] args) {

		// create a primitive variable
		int x = 5;

		// create an object of type Person
		Person p1 = new Person();
		// set the state
		p1.id = 101;
		p1.name = "Dan";

		// create an object of type Person
		Person p2 = new Person();
		// set the state
		p2.id = 102;
		p2.name = "Danna";

		System.out.println("p1 id: " + p1.id);
		System.out.println("p1 name: " + p1.name);
		System.out.println("p1 email: " + p1.email);

		System.out.println("p2 id: " + p2.id);
		System.out.println("p2 name: " + p2.name);
		System.out.println("p2 email: " + p2.email);
	}

}
