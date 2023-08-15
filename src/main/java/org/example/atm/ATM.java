package org.example.atm;

import org.example.atm.atmComputingOperations.ComputingOperations;
import org.example.atm.atmComputingOperations.IComputingOperations;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class ATM implements IATMOperations{
    private String password = "passwordATM";
    private final IComputingOperations iATMComputingOperations = new ComputingOperations();
    private final String atmBalancePath = "C:\\Users\\markm\\Desktop\\javaProjectsHome\\ATM\\src" +
            "\\main\\java\\org\\example\\atmOperations\\atmBalance";
    private final  String collectionReportsPath = "C:\\Users\\markm\\Desktop\\javaProjectsHome\\ATM" +
            "\\src\\main\\java\\org\\example\\atmOperations\\atmCollectionReports";

    private HashMap<Integer, Integer> actualATMBalance = new LinkedHashMap<>();
    private HashMap<Integer, Integer> addedInATMCash = new LinkedHashMap<>();



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

    public IComputingOperations getIATMComputingOperations() {
        return iATMComputingOperations;
    }

    public String getAtmBalancePath() {
        return atmBalancePath;
    }


}
