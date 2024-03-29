package b;

public class Line {

	private int length;

	public Line(int length) {
		super();
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void print() {
		for (int i = 0; i < length; i++) {
			System.out.print(" * ");
		}
		System.out.println();
	}

	@Override
	public String toString() {
		return "this is a line of length: " + this.length;
	}

}
