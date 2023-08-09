package org.example.model;

public enum Banknotes {
    FIVE(5), TEN(10), TWENTY(20),
    FIFTY(50), ONE_HUNDRED(100), TWO_HUNDRED(200), FIVE_HUNDRED(500);

    private int value = 0;

    Banknotes(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
