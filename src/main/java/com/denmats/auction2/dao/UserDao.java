package com.denmats.auction2.dao;

import com.denmats.auction2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Long> {

}
