package com.example.Don.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Don.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
