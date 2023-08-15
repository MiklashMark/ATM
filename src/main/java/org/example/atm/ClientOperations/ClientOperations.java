package org.example.atm.atmClientOperations;

import org.example.atm.ATM;
import org.example.model.ATMClient;

import java.io.IOException;

public class ClientOperations implements IClientOperations {
    ATMClient atmClient;

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

    public void setAtmClient(ATMClient atmClient) {
        this.atmClient = atmClient;
    }

    @Override
    public void getCash() throws IOException {

    }

    @Override
    public double checkCardBalance() {
        return atmClient.getATMClientCard().getRublesBalance()
                + atmClient.getATMClientCard().getPenniesBalance() * 0.01;
    }
}
