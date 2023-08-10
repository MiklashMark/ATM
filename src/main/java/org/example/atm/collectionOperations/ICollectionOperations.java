package org.example.atm.collectionOperations;

import org.example.model.Collection;
import org.example.model.Command;

import java.io.IOException;

public interface ICollectionOperations {
    void getCash() throws IOException;
    void addCash() throws IOException;
    void enterBanknotesNumber();
    void checkBalance();
    void report(Command command) throws IOException;

    void getCollectionNumber(Collection collection);

}
