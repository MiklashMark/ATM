package org.example.atm;

import org.example.atm.atmComputingOperations.ComputingOperations;
import org.example.atm.atmComputingOperations.IComputingOperations;
import org.example.model.ATMCollection;
import org.example.model.Command;

import java.io.*;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class ATM implements IATMOperations {
    private String password = "passwordATM";
    private final IComputingOperations iATMComputingOperations = new ComputingOperations();
    private final String atmBalancePath = "C:\\Users\\markm\\Desktop\\javaProjectsHome\\ATM\\src" +
            "\\main\\java\\org\\example\\atmOperations\\atmBalance";
    private final String collectionReportsPath = "C:\\Users\\markm\\Desktop\\javaProjectsHome\\ATM" +
            "\\src\\main\\java\\org\\example\\atmOperations\\atmCollectionReports";

    private HashMap<Integer, Integer> actualATMBalance = new LinkedHashMap<>();
    private HashMap<Integer, Integer> addedInATMCash = new LinkedHashMap<>();



    @Override
    public void getActualBalance() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream(this.getAtmBalancePath()))) {
            Object object = objectInputStream.readObject();

            if (object instanceof HashMap) {
                this.setActualATMBalance((HashMap<Integer, Integer>) object);
            }
        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void setNewBalance(ComputingOperations.OperationType operationType) {
        this.setActualATMBalance(this.getIATMComputingOperations()
                .getNewBalance(this, operationType));

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream(this.getAtmBalancePath()))) {
            objectOutputStream.writeObject(this.getActualATMBalance());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeCollection(Command command, ATMCollection atmCollection) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter(this.getCollectionReportsPath(), true))) {

            bufferedWriter.write("COLLECTION NUMBER : "
                    + atmCollection.getIdentificationNumber()
                    + " OPERATION : " + command.toString()
                    + " \nTIME : " + LocalDateTime.now() + "\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



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
