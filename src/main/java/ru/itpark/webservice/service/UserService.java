package ru.itpark.webservice.service;

import ru.itpark.webservice.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    void add(User user);

    List<User> searchByName(String name);

    void delete(int id);
}
