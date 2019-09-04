package d;

public class StudentTest {

	public static void main(String[] args) {

		System.out.println("start");
		Student s1 = new Student();
		Student s2 = new Student("Yosi", 33);
		Student s3 = new Student("Yael", 25);

		System.out.println(s1.getDetails());
		System.out.println(s2.getDetails());
		System.out.println(s3.getDetails());
	}

}
