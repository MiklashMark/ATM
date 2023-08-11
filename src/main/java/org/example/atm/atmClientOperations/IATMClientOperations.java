package org.example.atm.atmClientOperations;

import java.io.IOException;

public interface IATMClientOperations {
    void replenishTheBalance();
    void changePinCode();
    void printCheck();
    public void getCash() throws IOException;
    public void checkBalance();
}
