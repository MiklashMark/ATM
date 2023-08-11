package org.example.atm.atmCollectionOperations;

import org.example.atm.ATM;
import org.example.model.ATMCollection;
import org.example.model.Command;

import java.io.IOException;

public interface IATMCollectionOperations  {
    void addCash() throws IOException;
    public void getCash() throws IOException;
    public void checkATMBalance();
    void enterBanknotesNumber();
    void report(Command command) throws IOException;
    String getATMPassword();
}
