package com.arasys.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arasys.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
