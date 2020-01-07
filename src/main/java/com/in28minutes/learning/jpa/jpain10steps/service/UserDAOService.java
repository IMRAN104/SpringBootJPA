package com.in28minutes.learning.jpa.jpain10steps.service;

import com.in28minutes.learning.jpa.jpain10steps.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

//DAO => Data Access Object
@Repository   //Repository is something which interacts with database
@Transactional
public class UserDAOService {

    @PersistenceContext
    private EntityManager entityManager;
    public long insert(User user){
        entityManager.persist(user);  //stores a user to the database.
        return user.getId();
    }
}
