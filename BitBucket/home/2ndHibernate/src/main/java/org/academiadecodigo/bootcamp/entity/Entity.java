package org.academiadecodigo.bootcamp.entity;

import org.academiadecodigo.bootcamp.HibernateSessionManager;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 * Created by codecadet on 21/03/17.
 */
public class Entity {

    public static void main(String[] args) {
        try {
            Session session = HibernateSessionManager.beginTransaction();
            User user = new User("Blumel", "blumel@gmail.com", "password");
            session.save(user);
            HibernateSessionManager.commitTransaction();
        } catch (HibernateException e) {
            e.printStackTrace();
            HibernateSessionManager.rollbackTransaction();
        }
        finally {
            HibernateSessionManager.close();
        }
    }
}
