package org.example.atm;

import org.example.atm.computingATMOperations.ComputingOperations;
import org.example.atm.computingATMOperations.IComputingOperations;
import org.example.model.Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class ATM {
    protected String password = "passwordATM";
    protected Collection collection;
    protected final IComputingOperations iComputingOperations = new ComputingOperations();
    protected final String ATMbalancePath = "C:\\Users\\markm\\Desktop\\javaProjectsHome\\ATM\\src" +
            "\\main\\java\\org\\example\\atmOperations\\atmBalance";
    protected final  String collectionReportsPath = "C:\\Users\\markm\\Desktop\\javaProjectsHome\\ATM" +
            "\\src\\main\\java\\org\\example\\atmOperations\\collectionReports";

    protected HashMap<Integer, Integer> actualATMBalance = new LinkedHashMap<>();
    protected HashMap<Integer, Integer> addedInATMCash = new LinkedHashMap<>();


    protected Scanner collectionInput = new Scanner(System.in);
    protected int input;

    public void getCollectionNumber(Collection collection) {
        this.collection = collection;
    }

    public HashMap<Integer, Integer> getActualATMBalance() {
        return actualATMBalance;
    }

    public HashMap<Integer, Integer> getAddedInATMCash() {
        return addedInATMCash;
    }
}
