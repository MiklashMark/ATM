package org.example.model;

public class ATMClient {

    private atmClientCard atmClientCard;


    public ATMClient() {
    }

    public org.example.model.atmClientCard getATMClientCard() {
        return atmClientCard;
    }

    @Override
    public String toString() {
        return "ATMClient{" +
                "atmClientCardsList=" + atmClientCard +
                '}';
    }
}
