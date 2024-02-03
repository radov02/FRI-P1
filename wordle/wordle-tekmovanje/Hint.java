/**
 * Nastevni tip za generiranje namiga (maska)
 */

public enum Hint {

    MISPLACED(0), CORRECT(1), ABSENT(2);

    private final int value;

    private Hint(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
	
	@Override
    public String toString() {
        return String.format("(%d)", value);
    }
}