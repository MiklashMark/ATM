package org.example.atm.ClientOperations;
import org.example.atm.atmClientOperations.IClientOperations;

import org.example.atm.ATM;
import org.example.model.ATMClient;

import java.io.IOException;

public class ClientOperations implements IClientOperations {
    ATMClient atmClient;
    // TODO Mark : replenishTheBalance, PrintChack;
    // TODO Dima : getCash;

    // All computing operations should be realized in ComputingOperation class
    // Dima : create ATM method, which should be call DB and update ATMClient information in DB


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
