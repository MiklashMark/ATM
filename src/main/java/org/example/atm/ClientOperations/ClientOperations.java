package org.example.atm.ClientOperations;
import org.example.atm.atmClientOperations.IClientOperations;

import org.example.atm.ATM;
import org.example.model.Client;
import org.example.ui.UI;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class ClientOperations implements IClientOperations {
    Client client;
    // TODO Mark : replenishTheBalance, PrintCheck;
    // TODO Dima : getCash;

    // All computing operations should be realized in ComputingOperation class
    // Dima : create ATM method, which should be call DB and update ATMClient information in DB


    @Override
    public void replenishTheBalance(ATM atm, HashMap<Integer, Integer> money) {
        atm.setNewClientBalance(client, money);
    }

    @Override
    public void changePinCode(String newPinCode) {
        client.getATMClientCard().setCardPassword(newPinCode);
    }

    @Override
    public void printCheck() {
        
    }

    public void setAtmClient(Client client) {
        this.client = client;
    }

    @Override
    public void getCash(ATM atm) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int cash = scanner.nextInt();
        if(cash <= (int) checkCardBalance() && cash <= atm.getTotalBalance()){
            atm.getCash(cash);
        }
    }

    @Override
    public double checkCardBalance() {
        return client.getATMClientCard().getRublesBalance()
                + client.getATMClientCard().getPenniesBalance() * 0.01;
    }
}
