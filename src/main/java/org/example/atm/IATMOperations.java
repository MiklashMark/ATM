package org.example.atm;

import org.example.atm.ComputingOperations.ComputingOperations;
import org.example.model.Client;
import org.example.model.Collection;
import org.example.model.Command;

import java.util.HashMap;

public interface IATMOperations {
    void readActualATMBalanceFromFile();
    void writeActualATMBalanceToFile(ComputingOperations.OperationType operationType);
    void writeCollectionReportToFile(Command command, Collection collection);

    void setNewClientBalance(Client client, HashMap<Integer, Integer> money);
}
