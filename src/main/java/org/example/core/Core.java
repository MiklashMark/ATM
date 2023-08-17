package org.example.core;

import org.example.dataBase.atmClientDao.ClientDao;
import org.example.dataBase.atmClientDao.IClientDao;
import org.example.dataBase.atmCollectionDao.CollectionDao;
import org.example.dataBase.atmCollectionDao.ICollectionDao;
import org.example.exception.Exception;
import org.example.atm.CollectionOperations.CollectionOperations;
import org.example.atm.ClientOperations.ClientOperations;
import org.example.model.CollectionCredentials;
import org.example.model.ClientCredentials;
import org.example.model.Client;
import org.example.ui.ConsoleUI;
import org.example.ui.UI;

import java.io.IOException;

public class Core {
    private UI ui;
    private CollectionOperationsImp collectionOperationsImp;
    private ClientOperations ATMIClientOperations;
    private ICollectionDao atmCollectionDao;
    private IClientDao atmClientDao;
    private ClientCredentials iClientCredentials;
    private CollectionCredentials iCollectionCredentials;
    private Client client;

    public void init() {
        ui = new ConsoleUI();
        collectionOperationsImp = new CollectionOperations();
        ATMIClientOperations = new ClientOperationsImp();
        iClientCredentials = new ClientCredentials();
        iCollectionCredentials = new CollectionCredentials("1234");
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
