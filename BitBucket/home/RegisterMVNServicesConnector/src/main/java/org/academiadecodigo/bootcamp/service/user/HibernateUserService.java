/*
package org.academiadecodigo.bootcamp.service.user;

import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.persistence.hibernate.HibernateSessionManager;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

*
 * Created by codecadet on 20/03/17.


public class HibernateUserService implements UserService {
    private Session session;

    public HibernateUserService() {
    }

    @Override
    public boolean authenticate(String user, String pass) {
        System.out.println("asdasd: " + findByName(user));
        if (findByName(user) == null) {
            return false;
        }
        if (findByName(user).getUserName().equals(user)) {
            User myUser = findByName(user);
            if (myUser.getPassword().equals(pass)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void addUser(User user) {
        try {
            session = HibernateSessionManager.beginTransaction();
            session.save(user);
            HibernateSessionManager.commitTransaction();
        } catch (HibernateException ex) {
            ex.printStackTrace();
            HibernateSessionManager.rollbackTransaction();
        }
    }

    @Override
    public User findByName(String user) {
        try {
            session = HibernateSessionManager.beginTransaction();
            Query query = session.createQuery("from User where userName = :user");
            query.setString("user", user);
            User user1 = (User) query.uniqueResult();
            return user1;
        } catch (HibernateException ex) {
            ex.printStackTrace();
            HibernateSessionManager.rollbackTransaction();
        }
        return null;
    }

    @Override
    public int count() {
        int size = 0;

        try {
            Session session = HibernateSessionManager.beginTransaction();
            size = session.createQuery("select  count  (*) from User ")
                    .getFirstResult()
                    .intValue();
            HibernateSessionManager.commitTransaction();
        } catch (HibernateException ex) {
            System.out.println(ex.getMessage());
            HibernateSessionManager.rollbackTransaction();
        }
        return size;
    }

    @Override
    public boolean doesUserExists(String user, String email) {
        if (user.length() == 0) {
            System.out.println("User is empty");
            return false;
        }
        if (findByName(user) != null) {
            return false;
        }
        return true;
    }

    @Override
    public String getName() {
        return UserService.class.getSimpleName();
    }
}

*/
