package org.example.atm.collectionATMOperations;

import org.example.atm.ATM;
import org.example.atm.IATMOperations;
import org.example.atm.computingATMOperations.ComputingOperations;
import org.example.model.Banknotes;
import org.example.model.Command;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

public class CollectionOperations extends ATM implements  ICollectionOperations {

    @Override
    public void addCash() throws IOException {
        enterBanknotesNumber();
        checkBalance();
        actualATMBalance = iComputingOperations.getNewBalance(this,
                ComputingOperations.OperationType.ADD);
        report(Command.COLLECTION_MENU_ADD_CASH);

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(ATMbalancePath))) {
            objectOutputStream.writeObject(actualATMBalance);
        }

    }

    @Override
    public void enterBanknotesNumber() {
        ArrayList<Banknotes> banknotesArrayList = iComputingOperations.getBanknotesList();

        for (Banknotes banknotes : banknotesArrayList) {
            System.out.println("Enter the numerous of " + banknotes + " rubles banknotes : ");
            input = collectionInput.nextInt();
            addedInATMCash.put(banknotes.getValue(), input);
        }
    }


    @Override
    public void report(Command command) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(collectionReportsPath, true)))
        {
            switch (command.getValue()) {
                case 1 ->
                        bufferedWriter.write("COLLECTION NUMBER : " + collection.getIdentificationNumber() +  " OPERATION : " + Command.AUTHORIZATION_MENU_CHECK_BALANCE
                                + " \nTIME : " + LocalDateTime.now() +  "\n");
                case 2 ->
                        bufferedWriter.write("COLLECTION NUMBER : " + collection.getIdentificationNumber() +  " OPERATION : " + Command.COLLECTION_MENU_ADD_CASH
                                + " \nTIME : " + LocalDateTime.now() +  "\n");
                case 3 ->
                        bufferedWriter.write("COLLECTION NUMBER : " + collection.getIdentificationNumber() +  " OPERATION : " + Command.COLLECTION_MENU_CHECK_BALANCE
                                + " \nTIME : " + LocalDateTime.now() +  "\n");
            }
        }
    }

    @Override
    public void getCash() throws IOException {
        enterBanknotesNumber();
        actualATMBalance = iComputingOperations.getNewBalance(this,
                ComputingOperations.OperationType.SUBTRACT);
        report(Command.COLLECTION_MENU_GET_CASH);

    }

    @Override
    public void checkBalance() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(ATMbalancePath))) {
            Object object = objectInputStream.readObject();
            if (object instanceof HashMap) {
                actualATMBalance = (HashMap<Integer, Integer>) object;
            }
            report(Command.COLLECTION_MENU_CHECK_BALANCE);
        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
