package org.example.core;

import org.example.dataBase.atmClientDao.ClientDao;
import org.example.dataBase.atmClientDao.IClientDao;
import org.example.dataBase.atmCollectionDao.CollectionDao;
import org.example.dataBase.atmCollectionDao.ICollectionDao;
import org.example.exception.Exception;
import org.example.atm.CollectionOperations.CollectionOperations;
import org.example.atm.ClientOperations.ClientOperations;
import org.example.model.ATMCollectionCredentials;
import org.example.model.ATMClientCredentials;
import org.example.model.ATMClient;
import org.example.ui.ConsoleUI;
import org.example.ui.UI;

import java.io.IOException;

public class Core {
    private UI ui;
    private CollectionOperationsImp collectionOperationsImp;
    private ClientOperations ATMIClientOperations;
    private ICollectionDao atmCollectionDao;
    private IClientDao atmClientDao;
    private ATMClientCredentials iATMClientCredentials;
    private ATMCollectionCredentials iATMCollectionCredentials;
    private ATMClient atmClient;

    public void init() {
        ui = new ConsoleUI();
        collectionOperationsImp = new CollectionOperations();
        ATMIClientOperations = new ClientOperationsImp();
        iATMClientCredentials = new ATMClientCredentials();
        iATMCollectionCredentials = new ATMCollectionCredentials("1234");
        atmClientDao = new ClientDao();
        atmCollectionDao = new CollectionDao();



    }

    public void start() throws Exception, IOException {
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
