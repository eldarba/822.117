package b.equalityCheckc.methodOverloading;

public class Calculator {

	// method
	public int sum(int a, int b) {
		return a + b;
	}

	// method overloading
	public int sum(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int a, b, c;
		a = 3;
		b = 2;
		c = 5;
		int sum = calc.sum(a, b);
		System.out.println(a + " + " + b + " = " + sum);

		sum = calc.sum(a, b, c);

		System.out.println(4);
		System.out.println(4.4);
		System.out.println("4.4");
	}
}
