package org.example.atm.atmComputingOperations;

import org.example.atm.ATM;
import org.example.model.Banknotes;

import java.util.ArrayList;
import java.util.HashMap;

public interface IComputingOperations {
     HashMap<Integer, Integer> getNewBalance(ATM atm, ComputingOperations.OperationType operationType);

     ArrayList<Banknotes> getBanknotesList();
}
