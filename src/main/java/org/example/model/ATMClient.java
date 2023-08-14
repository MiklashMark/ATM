package org.example.model;

public class ATMClient {

    private ClientCard clientCard;


    public ATMClient() {
    }

    public ClientCard getATMClientCard() {
        return clientCard;
    }

    @Override
    public String toString() {
        return "ATMClient{" +
                "atmClientCardsList=" + clientCard +
                '}';
    }
}
