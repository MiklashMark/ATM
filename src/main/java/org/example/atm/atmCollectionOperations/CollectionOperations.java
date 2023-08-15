package org.example.atm.atmCollectionOperations;

import org.example.atm.ATM;
import org.example.atm.atmComputingOperations.ComputingOperations;
import org.example.model.ATMCollection;
import org.example.model.Banknotes;
import org.example.model.Command;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
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
        atm.setNewBalance(ComputingOperations.OperationType.ADD);
        report(Command.COLLECTION_MENU_ADD_CASH);
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
        atm.collectionReport(command, atmCollection);
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
    public void checkATMBalance() throws IOException {
        atm.getActualBalance();
        report(Command.COLLECTION_MENU_CHECK_BALANCE);
    }
}
