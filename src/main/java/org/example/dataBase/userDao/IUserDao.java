package org.example.dataBase.userDao;

import org.example.model.UserCredentials;
import org.example.model.User;

import java.io.IOException;

public interface IUserDao {
    void update(User user) throws IOException;
}
