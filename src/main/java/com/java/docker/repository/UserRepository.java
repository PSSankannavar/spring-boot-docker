package com.java.docker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.docker.beans.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
