package org.example.dataBase.userDao;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.example.dataBase.Dao;
import org.example.model.User;
import org.example.model.UserCredentials;

import java.io.*;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;

public class UserDao extends Dao<UserCredentials, Optional<User>> implements IUserDao {


    @Override
    public void update(User user) {
        getAll();

        Optional<User> foundUser = usersList.stream().filter(u -> user.getCardPassword().equals(u.getCardPassword())
                && user.getCardNumber().equals(u.getCardNumber())).findFirst();
        foundUser.ifPresent(existingUser -> usersList.set(usersList.indexOf(existingUser), user));

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(userDB))) {
            Gson gson = new Gson().newBuilder().setPrettyPrinting().create();
            gson.toJson(usersList, bufferedWriter);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public Optional<User> get(UserCredentials userCredentials) {
        User user = null;
        return usersList.stream().filter(u->u.getCardNumber().equals(userCredentials.getCardNumber())
                && u.getCardPassword().equals(userCredentials.getPinCode())).findFirst();
    }

    @Override
    public void getAll() {
        try( BufferedReader bufferedReader = new BufferedReader(new FileReader(userDB))) {
            Gson gson = new Gson();
            Type jsonType = new TypeToken<List<User>>() {
            }.getType();
            usersList = gson.fromJson(bufferedReader, jsonType);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void isNotFound() {
        System.out.println("Invalid input! Try again.");
    }
}
