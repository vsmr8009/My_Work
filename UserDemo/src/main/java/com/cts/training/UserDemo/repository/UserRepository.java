package com.cts.training.UserDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.training.UserDemo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
