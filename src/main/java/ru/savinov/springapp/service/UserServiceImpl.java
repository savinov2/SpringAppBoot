package ru.savinov.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.savinov.springapp.models.User;
import ru.savinov.springapp.repositories.UserRepositories;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepositories userRepositories;
    @Autowired
    public UserServiceImpl(UserRepositories userRepositories) {
        this.userRepositories = userRepositories;
    }

    @Transactional
    @Override
    public List<User> findAll() {
        return userRepositories.findAll();
    }
    @Transactional
    @Override
    public User findUserById(int id) {
        Optional<User> userResult = userRepositories.findById(id);
        return userResult.orElse(null);
    }
    @Transactional
    @Override
    public void saveUser(User user) {
        userRepositories.save(user);
    }
    @Transactional
    @Override
    public void updateUserByUserAndId(User updateUser, int id) {
        updateUser.setId(id);
        userRepositories.save(updateUser);
    }
    @Transactional
    @Override
    public void deleteUserById(int id) {
        userRepositories.deleteById(id);
    }
}
