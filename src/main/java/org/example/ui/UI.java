package org.example.ui;

import org.example.exception.ATMException;
import org.example.model.ATMClientCredentials;

public interface UI {
    ATMClientCredentials showAuthorizationMenu(ATMClientCredentials credentials) throws ATMException;
    void showWelcomeMenu();


    void showCollectionMenu();

    void showBalanceReplenish();

    ATMClientCredentials getCredentials(ATMClientCredentials credentials);
}
