package com.computerwala.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.computerwala.model.User;


public interface UserRepository extends JpaRepository<User, Long> {
}