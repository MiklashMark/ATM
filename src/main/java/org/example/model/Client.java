package org.example.model;

public class Client {

    private ClientCard clientCard;


    public Client() {
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

    public Client getClient(){return this;}
}
