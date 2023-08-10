package org.example.atm.userATMOperations;

import org.example.atm.IATMOperations;

public interface IUserOperations extends IATMOperations {
    void replenishTheBalance();
    void changePinCode();
    void printCheck();
}
