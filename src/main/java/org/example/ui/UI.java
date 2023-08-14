package org.example.ui;

import org.example.exception.Exception;
import org.example.model.ATMClientCredentials;

public interface UI {
    ATMClientCredentials showAuthorizationMenu(ATMClientCredentials credentials) throws Exception;
    void showWelcomeMenu();


    void showCollectionMenu();

    void showBalanceReplenish();

    ATMClientCredentials getCredentials(ATMClientCredentials credentials);
}
