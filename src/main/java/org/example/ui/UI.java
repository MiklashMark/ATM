package org.example.ui;

import org.example.Exception.ATMException;
import org.example.model.UserCredentials;

public interface UI {
    UserCredentials showAuthorizationMenu(UserCredentials credentials) throws ATMException;
    void showWelcomeMenu();


    void showCollectionMenu();

    void showBalanceReplenish();

    UserCredentials getCredentials(UserCredentials credentials);
}
