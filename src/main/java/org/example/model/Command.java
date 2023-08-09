package org.example.model;

public enum Command {
    MAIN_MENU_CONTINUE(1),
    MAIN_MENU_ESCAPE(2),

    AUTHORIZATION_MENU_CHECK_BALANCE(1),
    AUTHORIZATION_MENU_GET_CASH(2),
    AUTHORIZATION_MENU_REPLENISH_THE_BALANCE(3),
    AUTHORIZATION_MENU_CHANGE_PIN_CODE(4),
    AUTHORIZATION_MENU_PRINT_CHECK(5),

    COLLECTION_MENU_GET_CASH(1),
    COLLECTION_MENU_ADD_CASH(2),
    COLLECTION_MENU_CHECK_BALANCE(3),
    COLLECTION_MENU_REPORT(4);

    private int value = 0;

    private Command(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
