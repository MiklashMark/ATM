package org.example.atm.atmClientOperations;

import org.example.atm.IATMOperations;

import java.io.IOException;

public interface IUserOperations extends IATMOperations {
    void replenishTheBalance();
    void changePinCode();
    void printCheck();
    public void getCash() throws IOException;
    public void checkBalance();
}
