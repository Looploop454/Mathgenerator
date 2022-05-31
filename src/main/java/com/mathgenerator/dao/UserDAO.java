package com.mathgenerator.dao;

import io.dropwizard.hibernate.AbstractDAO;
import com.mathgenerator.module.*;
import org.hibernate.SessionFactory;

import java.util.*;

public class UserDAO extends AbstractDAO<User> {
    public UserDAO(SessionFactory sessionFactory){
        super(sessionFactory);
    }

    public Optional<User> findById(UUID id){
        return Optional.of(get(id));
    }
}
