package org.academiadecodigo.mappings.entity;

import org.academiadecodigo.mappings.HibernateSessionManager;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 * Created by tekman on 21/03/2017.
 */
public class Entity {


    public static void main(String[] args) {


        try {
            Session session = HibernateSessionManager.beginTransaction();

            User user = new User("Blumel", "blumel@dazzle.me.com", "password");

            session.save(user);

            HibernateSessionManager.commitTransaction();
        } catch (HibernateException ex) {
            ex.printStackTrace();
            HibernateSessionManager.rollbackTransaction();
        } finally {
            HibernateSessionManager.close();
        }


    }
}
