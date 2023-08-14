package org.example.dataBase;

public interface IDao<T> {
    void getAll();
    void update(T t);

}
