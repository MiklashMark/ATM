package org.example.core;

import org.example.exception.ATMException;
import org.example.atm.collectionOperations.CollectionOperations;
import org.example.atm.collectionOperations.ICollectionOperations;
import org.example.atm.userOperations.IUserOperations;
import org.example.atm.userOperations.UserOperations;
import org.example.dataBase.userDao.IUserDao;
import org.example.dataBase.userDao.UserDao;
import org.example.model.UserCredentials;
import org.example.model.User;
import org.example.ui.ConsoleUI;
import org.example.ui.UI;

import java.io.IOException;

public class Core {
    private UI ui;
    private ICollectionOperations iCollectionOperations;
    private IUserOperations iUserOperations;
    private IUserDao dao;

    private UserCredentials credentials;
    private User user;

    public void init() {
        ui = new ConsoleUI();
        iCollectionOperations = new CollectionOperations();
        iUserOperations = new UserOperations();
        dao = new UserDao();
        credentials = new UserCredentials();

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
        iCollectionOperations.checkBalance();


    }

}
