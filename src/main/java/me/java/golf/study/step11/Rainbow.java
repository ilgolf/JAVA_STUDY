package me.java.golf.study.step11;

public enum Rainbow {
    RED(3), ORANGE(10), YELLOW(21), GREEN(5), BLUE(1), INDIGO(-1), VIOLET(-11);

    private final int value;

    Rainbow(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
