package org.example.atm;

import org.example.atm.atmComputingOperations.ATMComputingOperations;
import org.example.atm.atmComputingOperations.IATMComputingOperations;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class ATM {
    private String password = "passwordATM";
    private final IATMComputingOperations iATMComputingOperations = new ATMComputingOperations();
    private final String atmBalancePath = "C:\\Users\\markm\\Desktop\\javaProjectsHome\\ATM\\src" +
            "\\main\\java\\org\\example\\atmOperations\\atmBalance";
    private final  String collectionReportsPath = "C:\\Users\\markm\\Desktop\\javaProjectsHome\\ATM" +
            "\\src\\main\\java\\org\\example\\atmOperations\\atmCollectionReports";

    private HashMap<Integer, Integer> actualATMBalance = new LinkedHashMap<>();
    private HashMap<Integer, Integer> addedInATMCash = new LinkedHashMap<>();
    private int input;


    public String getCollectionReportsPath() {
        return collectionReportsPath;
    }

    public String getPassword() {
        return password;
    }
    public HashMap<Integer, Integer> getActualATMBalance() {
        return actualATMBalance;
    }

    public void setActualATMBalance(HashMap<Integer, Integer> actualATMBalance) {
        this.actualATMBalance = actualATMBalance;
    }

    public HashMap<Integer, Integer> getAddedInATMCash() {
        return addedInATMCash;
    }

    public IATMComputingOperations getiATMComputingOperations() {
        return iATMComputingOperations;
    }

    public String getAtmBalancePath() {
        return atmBalancePath;
    }

    public int getInput() {
        return input;
    }

    public void setInput(int input) {
        this.input = input;
    }
}
