package org.example.atm.ComputingOperations;

import org.example.atm.ATM;
import org.example.model.Banknotes;

import java.util.ArrayList;
import java.util.HashMap;

public interface IComputingOperations {
     HashMap<Integer, Integer> getNewBalance(ATM atm, ComputingOperations.OperationType operationType);

     ArrayList<Banknotes> getBanknotesList();
     int countAddedClientMoney(HashMap<Integer,Integer> money);

}
