package org.example.atm.atmClientOperations;

import org.example.atm.ATM;

import java.io.IOException;
import java.util.HashMap;

public interface IClientOperations {
    void replenishTheBalance(ATM atm, HashMap<Integer, Integer> money);
    void changePinCode(String newPinCode);
    void printCheck();
    public void getCash(ATM atm) throws IOException;
    public double checkCardBalance();
}
