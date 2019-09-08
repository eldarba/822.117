package a;

public class Test1 {

	public static void main(String[] args) {

		Person p = new Person(101, "aaa", 33);
		Employee e = new Employee(102, "bbb", 22, 56_000);

		System.out.println(p.getName());
		System.out.println(e.getName());

		System.out.println(e.getSalary());

	}

}
