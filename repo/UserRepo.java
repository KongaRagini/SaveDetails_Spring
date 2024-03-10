package com.infy.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.entiy.UserEntity;
@Repository
public interface UserRepo extends JpaRepository<UserEntity, Long> {

}
