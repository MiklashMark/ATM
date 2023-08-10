package org.example.atm.collectionATMOperations;

import org.example.atm.IATMOperations;
import org.example.model.Collection;
import org.example.model.Command;

import java.io.IOException;

public interface ICollectionOperations extends IATMOperations {
    void addCash() throws IOException;
    void enterBanknotesNumber();
    void report(Command command) throws IOException;

    void getCollectionNumber(Collection collection);

}
