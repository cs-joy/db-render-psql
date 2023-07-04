package com.database.psql.model;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    List<User> findBySize(int size);
    List<User> findByNameAndPassword(String name, String password);
}