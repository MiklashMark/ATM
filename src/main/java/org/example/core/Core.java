package org.example.core;

import org.example.dataBase.Dao;
import org.example.dataBase.atmcollectionDao.ATMCollectionDao;
import org.example.exception.ATMException;
import org.example.atm.atmCollectionOperations.ATMCollectionOperations;
import org.example.atm.atmCollectionOperations.IATMCollectionOperations;
import org.example.atm.atmClientOperations.IUserOperations;
import org.example.atm.atmClientOperations.UserOperations;
import org.example.model.ATMCollectionCredentials;
import org.example.model.ATMClientCredentials;
import org.example.model.ATMClient;
import org.example.ui.ConsoleUI;
import org.example.ui.UI;

import java.io.IOException;

public class Core {
    private UI ui;
    private IATMCollectionOperations iCollectionOperations;
    private IUserOperations iUserOperations;
    private Dao<A, O> dao;

    private ATMClientCredentials ATMClientCredentials;
    private ATMCollectionCredentials ATMCollectionCredentials;
    private ATMClient ATMClient;

    public void init() {
        ui = new ConsoleUI();
        iCollectionOperations = new ATMCollectionOperations();
        iUserOperations = new UserOperations();
        dao = new ATMCollectionDao();
        ATMClientCredentials = new ATMClientCredentials();
        ATMCollectionCredentials = new ATMCollectionCredentials("1234");


    }

    public void start() throws ATMException, IOException {
        init();
//        ui.showWelcomeMenu();
//        while (user == null) {
//            user = dao.get(ui.showAuthorizationMenu(credentials));
//            if(user == null) {
//                dao.userIsNotFound();
//            } else break;
//        }
        dao.





    }

}
