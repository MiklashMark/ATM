package org.example.core;

import org.example.dataBase.atmClientDao.ATMClientDao;
import org.example.dataBase.atmClientDao.IATMClientDao;
import org.example.dataBase.atmcollectionDao.ATMCollectionDao;
import org.example.dataBase.atmcollectionDao.IATMCollectionDao;
import org.example.exception.ATMException;
import org.example.atm.atmCollectionOperations.ATMCollectionOperations;
import org.example.atm.atmCollectionOperations.IATMCollectionOperations;
import org.example.atm.atmClientOperations.IATMClientOperations;
import org.example.atm.atmClientOperations.ATMClientOperations;
import org.example.model.ATMCollectionCredentials;
import org.example.model.ATMClientCredentials;
import org.example.model.ATMClient;
import org.example.ui.ConsoleUI;
import org.example.ui.UI;

import java.io.IOException;

public class Core {
    private UI ui;
    private IATMCollectionOperations iCollectionOperations;
    private IATMClientOperations iATMClientOperations;
    private IATMCollectionDao atmCollectionDao;
    private IATMClientDao atmClientDao;
    private ATMClientCredentials iATMClientCredentials;
    private ATMCollectionCredentials iATMCollectionCredentials;
    private ATMClient atmClient;

    public void init() {
        ui = new ConsoleUI();
        iCollectionOperations = new ATMCollectionOperations();
        iATMClientOperations = new ATMClientOperations();
        iATMClientCredentials = new ATMClientCredentials();
        iATMCollectionCredentials = new ATMCollectionCredentials("1234");
        atmClientDao = new ATMClientDao();
        atmCollectionDao = new ATMCollectionDao();



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



    }

}
