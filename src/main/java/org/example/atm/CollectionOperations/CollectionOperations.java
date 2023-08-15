package org.example.atm.CollectionOperations;

import org.example.atm.ATM;
import org.example.atm.atmComputingOperations.ComputingOperations;
import org.example.model.ATMCollection;
import org.example.model.Banknotes;
import org.example.model.Command;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CollectionOperations implements ICollectionOperations {

    private ATM atm = new ATM();
    private ATMCollection atmCollection;

    @Override
    public void addCash() throws IOException {
        enterBanknotesNumber();
        checkATMBalance();
        atm.writeActualATMBalanceToFile(ComputingOperations.OperationType.ADD);
        report(Command.COLLECTION_MENU_ADD_CASH);
    }

    @Override
    public void enterBanknotesNumber() {
        ArrayList<Banknotes> banknotesArrayList = atm.getIATMComputingOperations().getBanknotesList();
        Scanner scanner = new Scanner(System.in);
        int banknotesNumber;
        for (Banknotes banknotes : banknotesArrayList) {
            System.out.println("Enter the numerous of " + banknotes + " rubles banknotes : ");
            banknotesNumber = scanner.nextInt();
            atm.getAddedInATMCash().put(banknotes.getValue(), banknotesNumber);
        }
    }


    @Override
    public void report(Command command) throws IOException {
        atm.writeCollectionReportToFile(command, atmCollection);
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
        atm.readActualATMBalanceFromFile();
        report(Command.COLLECTION_MENU_CHECK_BALANCE);
    }

    public void setAtmCollection(ATMCollection atmCollection) {
        this.atmCollection = atmCollection;
    }
}
