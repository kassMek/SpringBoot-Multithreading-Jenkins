package com.kass.multhithread.repository;


import com.kass.multhithread.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
