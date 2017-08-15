package com.websystique.springboot.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.websystique.springboot.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByName(String name);
    List<User> findByAge(Integer edad);

}
