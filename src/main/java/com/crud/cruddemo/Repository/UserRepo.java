package com.crud.cruddemo.Repository;

import com.crud.cruddemo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

}