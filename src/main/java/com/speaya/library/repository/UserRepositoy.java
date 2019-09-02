package com.speaya.library.repository;

import com.speaya.library.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Transactional
@Repository
public class UserRepositoy {

    @PersistenceContext
    private EntityManager entityManager;

    public  UserRepositoy(){

    }
    public long insert(User user) {

        this.entityManager.persist(user);
        return user.getId();
    }
}
