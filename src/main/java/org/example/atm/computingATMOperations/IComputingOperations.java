package org.example.atm.computingATMOperations;

import org.example.atm.collectionOperations.CollectionOperations;
import org.example.model.Banknotes;

import java.util.ArrayList;
import java.util.HashMap;

public interface IComputingOperations {
     HashMap<Integer, Integer> getNewBalance(CollectionOperations collectionOperations,
                                             ComputingOperations.OperationType operationType);

     ArrayList<Banknotes> getBanknotesList();
}
