package g.switchDemo;

public class Demo1 {

	public static void main(String[] args) {
		// 0 off
		// 1 on
		// 2 stand by
		int x = (int) (Math.random() * 5);
		System.out.println(x);
		int machineMode = x;

		switch (machineMode) {
		case 0:
			System.out.println("OFF");
			break;
		case 1:
			System.out.println("ON");
			break;
		case 2:
			System.out.println("STAND_BY");
			break;
		default:
			System.out.println(x + " is not a valid mode value");

		}
	}

}
