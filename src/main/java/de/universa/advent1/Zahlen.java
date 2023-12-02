package de.universa.advent1;

public enum Zahlen {
    one(1),
    two(2),
    three(3),
    four(4),
    five(5),
    six(6),
    seven(7),
    eigth(8),
    nine(9);
    final int value;

    private Zahlen(int value) {
        this.value = value;
    }

    public int intValue() {
        return this.value;
    }
}
