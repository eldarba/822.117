package b;

public class WLine extends Line {

	private int width;

	public WLine(int length, int width) {
		super(length);
		this.width = width;
	}

	@Override
	public void print() {
		for (int width = 0; width < this.width; width++) {
			super.print();
		}
	}

}
