package com.speaya.library.repository;

import com.speaya.library.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepositoy extends JpaRepository<User, Integer> {
}
