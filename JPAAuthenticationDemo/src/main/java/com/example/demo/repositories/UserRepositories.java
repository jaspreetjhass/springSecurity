package com.example.demo.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.User;

public interface UserRepositories extends CrudRepository<User, Integer>{

	Optional<User> findByUserName(String name);
}
