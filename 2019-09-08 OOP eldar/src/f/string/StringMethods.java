package f.string;

public class StringMethods {

	public static void main(String[] args) {

		String str = "ab cd ";
		System.out.println(str);
		// length
		System.out.println("string length: " + str.length());

		// character at given index
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(4));
		System.out.println(str.charAt(5));

		int index = str.indexOf(' ');
		System.out.println(index);

		str = "aaaabbbaaaaaaaaaacccaaaaaaaaa";

		// find a sub-string
		index = str.indexOf("ccc");
		System.out.println(index);

	}

}
