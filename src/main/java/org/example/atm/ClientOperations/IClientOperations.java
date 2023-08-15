package org.example.atm.atmClientOperations;

import org.example.atm.ATM;
import org.example.model.ATMClient;

import java.io.IOException;

public interface IClientOperations {
    void replenishTheBalance(ATM atm, int money);
    void changePinCode(String newPinCode);
    void printCheck();
    public void getCash() throws IOException;
    public double checkCardBalance();
}
