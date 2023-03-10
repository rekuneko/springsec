package com.sevensevengsi.springsec.repo;

import com.sevensevengsi.springsec.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer>{

    public User findByUsername(String username);
}
