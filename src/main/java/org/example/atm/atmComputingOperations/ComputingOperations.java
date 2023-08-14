package org.example.atm.atmComputingOperations;

import org.example.atm.ATM;
import org.example.model.Banknotes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class ComputingOperations implements IComputingOperations {

    public enum OperationType {
        ADD,
        SUBTRACT
    }

    @Override
    public HashMap<Integer, Integer> getNewBalance(ATM atm, OperationType operationType) {
        HashMap<Integer, Integer> actualMapBalance = atm.getActualATMBalance();
        HashMap<Integer, Integer> addedMapBalance = atm.getAddedInATMCash();

        HashMap<Integer, Integer> resultHashMap = new LinkedHashMap<>();
        for (Integer key : actualMapBalance.keySet()) {
            if (addedMapBalance.containsKey(key)) {
                int value;
                if (operationType == OperationType.ADD) {
                    value = actualMapBalance.get(key) + addedMapBalance.get(key);
                } else {
                    value = actualMapBalance.get(key) - addedMapBalance.get(key);
                }
                resultHashMap.put(key, value);
            } else {
                resultHashMap.put(key, actualMapBalance.get(key));
            }
        }

        if (operationType == OperationType.ADD) {
            for (Integer key : addedMapBalance.keySet()) {
                if (!actualMapBalance.containsKey(key)) {
                    resultHashMap.put(key, addedMapBalance.get(key));
                }
            }
        }

        return resultHashMap;
    }

    @Override
    public ArrayList<Banknotes> getBanknotesList() {
        ArrayList<Banknotes> banknotesArrayList = new ArrayList<>();
        banknotesArrayList.add(Banknotes.FIVE);
        banknotesArrayList.add(Banknotes.TEN);
        banknotesArrayList.add(Banknotes.TWENTY);
        banknotesArrayList.add(Banknotes.FIFTY);
        banknotesArrayList.add(Banknotes.ONE_HUNDRED);
        banknotesArrayList.add(Banknotes.TWO_HUNDRED);
        banknotesArrayList.add(Banknotes.FIVE_HUNDRED);

        return banknotesArrayList;
    }
}
