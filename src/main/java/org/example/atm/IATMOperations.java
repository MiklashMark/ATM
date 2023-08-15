package org.example.atm;

import org.example.atm.ComputingOperations.ComputingOperations;
import org.example.model.ATMCollection;
import org.example.model.Command;

public interface IATMOperations {
    void readActualATMBalanceFromFile();
    void writeActualATMBalanceToFile(ComputingOperations.OperationType operationType);
    void writeCollectionReportToFile(Command command, ATMCollection atmCollection);



}
