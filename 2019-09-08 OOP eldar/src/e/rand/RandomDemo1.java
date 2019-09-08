package e.rand;

public class RandomDemo1 {

	public static void main(String[] args) {

		int r = (int) (Math.random() * 11) + 10;

		System.out.println(r);

		// you can use a formula
		int a = 115;
		int b = 117;

		int x = (int) (Math.random() * (b - a + 1) + a);

		System.out.println(x);

	}

}
