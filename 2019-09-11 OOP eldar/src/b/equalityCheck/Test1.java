package b.equalityCheck;

public class Test1 {

	public static void main(String[] args) {

		Person p1 = new Person(101, "Dan", 25);
		Person p2 = new Person(101, "Dani", 26);

		System.out.println(p1 == p2);

		System.out.println(p1.equals(p2));

	}
}
