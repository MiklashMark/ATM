package org.example.atm.ComputingOperations;

import org.example.atm.ATM;
import org.example.model.Banknotes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

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

    @Override
    public int countAddedClientMoney(HashMap<Integer, Integer> money) {
        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : money.entrySet()) {
            sum += entry.getKey() * entry.getValue();
        }
        return sum;
    }

    @Override
    public void withdrawUsingGreedyAlgorithm(ATM atm, int cash) {
        HashMap<Integer, Integer> actualMapBalance = atm.getActualATMBalance();
        HashMap<Integer, Integer> withdrawnCash = new LinkedHashMap<>();

        //sort nominals from Hi to Lo (500, 200 etc.)
        ArrayList<Integer> denominations = new ArrayList<>(actualMapBalance.keySet());
        denominations.sort((a, b) -> b - a);

        int cashToWithdraw = cash;

        //alghoritm
        for (Integer denomination : denominations) {
            int notesAvailable = actualMapBalance.get(denomination);
            if (notesAvailable > 0) {
                int notesToWithdraw = cashToWithdraw / denomination;
                if (notesToWithdraw > 0) {
                    // Определяем, сколько купюр можно выдать
                    int notesToIssue = Math.min(notesAvailable, notesToWithdraw);
                    withdrawnCash.put(denomination, notesToIssue);
                    cashToWithdraw -= denomination * notesToIssue;
                }
            }
        }

        //update ATM balance
        for (Map.Entry<Integer, Integer> entry : withdrawnCash.entrySet()) {
            int denomination = entry.getKey();
            int notesWithdrawn = entry.getValue();
            actualMapBalance.put(denomination, actualMapBalance.get(denomination) - notesWithdrawn);
        }
        atm.setActualATMBalance(actualMapBalance);

    }
}
