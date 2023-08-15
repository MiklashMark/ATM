package org.example.atm.ClientOperations;

import org.example.atm.ATM;

import java.io.IOException;

public interface IClientOperations {
    void replenishBalance(ATM atm, int money);
    void changePinCode(String newPinCode);
    void printCheck();
    public void getCash() throws IOException;
    public void checkCardBalance();
}
