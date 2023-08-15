package org.example.atm.atmCollectionOperations;

import org.example.atm.ATM;
import org.example.atm.atmComputingOperations.ComputingOperations;
import org.example.model.ATMCollection;
import org.example.model.Banknotes;
import org.example.model.Command;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CollectionOperations implements ICollectionOperations {

    private ATM atm = new ATM();
    private ATMCollection atmCollection = new ATMCollection();
    private Scanner collectionInput = new Scanner(System.in);
    private int banknotesNumber;

    @Override
    public void addCash() throws IOException {
        enterBanknotesNumber();
        checkATMBalance();

        atm.setActualATMBalance(atm.getIATMComputingOperations()
                .getNewBalance(atm, ComputingOperations.OperationType.ADD));
        report(Command.COLLECTION_MENU_ADD_CASH);

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream(atm.getAtmBalancePath()))) {
            objectOutputStream.writeObject(atm.getActualATMBalance());
        }

    }

    @Override
    public void enterBanknotesNumber() {
        ArrayList<Banknotes> banknotesArrayList = atm.getIATMComputingOperations().getBanknotesList();

        for (Banknotes banknotes : banknotesArrayList) {
            System.out.println("Enter the numerous of " + banknotes + " rubles banknotes : ");
            banknotesNumber = collectionInput.nextInt();
            atm.getAddedInATMCash().put(banknotes.getValue(), banknotesNumber);
        }
    }


    @Override
    public void report(Command command) throws IOException {
       atm.collectionReport(command,atmCollection);
    }



    @Override
    public String getATMPassword() {
        return atm.getPassword();
    }

    @Override
    public void getCash() throws IOException {
        enterBanknotesNumber();
        atm.setActualATMBalance(atm.getIATMComputingOperations().getNewBalance(atm,
                ComputingOperations.OperationType.SUBTRACT));
        report(Command.COLLECTION_MENU_GET_CASH);

    }

    @Override
    public void checkATMBalance() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream(atm.getAtmBalancePath()))) {
            Object object = objectInputStream.readObject();

            if (object instanceof HashMap) {
                atm.setActualATMBalance((HashMap<Integer, Integer>) object);
            }
            report(Command.COLLECTION_MENU_CHECK_BALANCE);

        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
