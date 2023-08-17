package org.example.ui;

import org.example.exception.Exception;
import org.example.model.ClientCredentials;

public interface UI {
    ClientCredentials showAuthorizationMenu(ClientCredentials credentials) throws Exception;
    void showWelcomeMenu();


    void showCollectionMenu();

    void showBalanceReplenish();

    ClientCredentials getCredentials(ClientCredentials credentials);
}
