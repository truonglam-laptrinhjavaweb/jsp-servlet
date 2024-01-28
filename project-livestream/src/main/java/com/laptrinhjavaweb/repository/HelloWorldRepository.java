package com.laptrinhjavaweb.repository;

import com.laptrinhjavaweb.entity.HelloWorldEntity;
import com.laptrinhjavaweb.util.HibernateUtil;
import org.hibernate.Session;

public class HelloWorldRepository {

    public HelloWorldEntity find(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return session.get(HelloWorldEntity.class, id);
    }
}
