package org.example.atm.atmCollectionOperations;

import org.example.model.Command;

import java.io.IOException;

public interface ICollectionOperations {
    void addCash() throws IOException;
    public void getCash() throws IOException;
    public void checkATMBalance() throws IOException;
    void enterBanknotesNumber();
    void report(Command command) throws IOException;
    String getATMPassword();
}
