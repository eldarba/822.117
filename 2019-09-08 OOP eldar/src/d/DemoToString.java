package d;

import b.Line;

public class DemoToString {

	public static void main(String[] args) {
		Line line = new Line(7);
		String str = line.toString();
		System.out.println(str);

		System.out.println(line.toString());

		System.out.println(line);
	}
}
