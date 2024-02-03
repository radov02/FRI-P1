/**
 * Nastevni tip za obliko ploscice.
 */

public enum TileShape {

	OCTAGON(0), SQUARE(1);

	private final int value;

	private TileShape(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}

	@Override
	public String toString() {
		return String.format("%s (%d)", value == 0 ? "OCTAGON" : "SQUARE", value);
	}
}