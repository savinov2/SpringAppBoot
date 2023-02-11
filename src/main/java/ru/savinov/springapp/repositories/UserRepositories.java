package ru.savinov.springapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.savinov.springapp.models.User;

public interface UserRepositories extends JpaRepository<User,Integer> {
}
