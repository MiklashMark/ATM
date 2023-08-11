package org.example.atm.ATMcomputingOperations;

import org.example.atm.ATM;
import org.example.atm.atmCollectionOperations.ATMCollectionOperations;
import org.example.model.Banknotes;

import java.util.ArrayList;
import java.util.HashMap;

public interface IATMComputingOperations {
     HashMap<Integer, Integer> getNewBalance(ATM atm, ATMComputingOperations.OperationType operationType);

     ArrayList<Banknotes> getBanknotesList();
}
