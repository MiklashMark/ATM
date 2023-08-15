package org.example.atm;

import org.example.model.ATMCollection;
import org.example.model.Command;

import java.io.IOException;

public interface IATMOperations {
    void getActualBalance();
    void setNewBalance();
    void collectionReport(Command command, ATMCollection atmCollection);



}
