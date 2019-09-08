package d;

import a.Person;

public class DemoToString2 {

	public static void main(String[] args) {

		Person p1 = new Person(101, "aaa", 55);
		Person p2 = new Person(102, "bbb", 44);
		Person p3 = new Person(103, "ccc", 33);

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}
