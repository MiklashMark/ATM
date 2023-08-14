package org.example.atm.atmClientOperations;

import org.example.atm.ATM;
import org.example.model.ATMClient;

import java.io.IOException;

public class ClientOperations implements IClientOperations {
    ATMClient atmClient = new ATMClient();
    @Override
    public void replenishTheBalance(ATM atm, int money) {

    }

    @Override
    public void changePinCode(String newPinCode) {
        atmClient.getATMClientCard().setCardPassword(newPinCode);
    }

    @Override
    public void printCheck() {

    }

    @Override
    public void getCash() throws IOException {

    }

    @Override
    public void checkBalance() {

    }
}
