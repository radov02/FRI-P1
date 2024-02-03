/**
 * Nastevni tip za status igre
 */

public enum GameStatus {

    IN_PROGRESS(1), SOLVED(2), GAME_OVER(3);

    private final int value;

    private GameStatus(int value) {
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