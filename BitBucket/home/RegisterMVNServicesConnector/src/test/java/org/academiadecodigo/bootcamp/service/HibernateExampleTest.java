/*package org.academiadecodigo.bootcamp.service;

import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.persistence.hibernate.HibernateSessionManager;
import org.hibernate.Session;
import org.junit.Test;

*
 * Created by codecadet on 20/03/17.

public class HibernateExampleTest {
    @Test
    public void addUser(){
        Session session = HibernateSessionManager.getSession();
        session.beginTransaction();

        User user = new User("Elton Jorge", "nikita", "jorge@hotmail.com");
        user.setUserName("Elton Jorge");
        user.setPassword("nikita");

        session.save(user);

        session.getTransaction().commit();
    }

    @Test
    public void removeUser(){
        Session session = HibernateSessionManager.getSession();
        session.beginTransaction();

        User user = session.load(User.class, 1);
        System.out.println(user);
        session.delete(user);

        session.getTransaction().commit();
    }

    @Test
    public void editWithinSession(){
        Session session = HibernateSessionManager.getSession();
        session.beginTransaction();

        User user = session.load(User.class, 1);

    }

    @Test
    public void editOutsdeSession(){
        Session session = HibernateSessionManager.getSession();
        session.beginTransaction();

        User user = session.load(User.class, 4);




    }
}*/
