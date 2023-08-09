package org.example.ui;

import org.example.exception.ATMException;
import org.example.model.UserCredentials;

public interface UI {
    UserCredentials showAuthorizationMenu(UserCredentials credentials) throws ATMException;
    void showWelcomeMenu();


    void showCollectionMenu();

    void showBalanceReplenish();

    UserCredentials getCredentials(UserCredentials credentials);
}
