package services;

import java.util.List;

public interface DataBase <T> {

    T find (int id);
    List<T> findAll();

    void insert(T register);
    void update(T register, int id) throws Exception;
    void delete( int id) throws Exception;



}