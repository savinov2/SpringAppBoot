package ru.savinov.springapp.service;


import ru.savinov.springapp.models.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findUserById(int id);
    void saveUser(User user);
    void updateUserByUserAndId(User user, int id);
    void deleteUserById(int id);
}
