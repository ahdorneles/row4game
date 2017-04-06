package org.academiadecodigo.bootcamp.model.dao.hibernate;

import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.model.dao.UserDao;
import org.academiadecodigo.bootcamp.persistence.hibernate.HibernateSessionManager;
import org.academiadecodigo.bootcamp.persistence.transaction.TransactionException;
import org.academiadecodigo.bootcamp.service.user.UserService;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;


import java.util.List;

/**
 * Created by codecadet on 23/03/17.
 */
public class HibernateUserDao extends AbstractDao<User> implements UserDao {

   /* public HibernateUserDao(HibernateSessionManager hibernateSessionManager) {
        super(User.class, hibernateSessionManager);
    }*/


    @Override
    public List<User> findAll() {
        try {
            return getHibernateSessionManager().getSession().createQuery("from " + User.class.getSimpleName()).list();
        } catch (HibernateException ex) {
            throw new TransactionException(ex);
        }
    }

    @Override
    public List<User> findById() {
        return null;
    }

    @Override
    public User read(String user) {
        Session session;

        try {
            session = getHibernateSessionManager().getSession();
            Query query = session.createQuery("from User where userName = :user");
            query.setString("user", user);
            User user1 = (User) query.uniqueResult();
            return user1;
        } catch (HibernateException ex) {
            throw new TransactionException(ex);
        }
    }


    public int count() {
        Session session;

        int size = 0;

        try {
            session = getHibernateSessionManager().getSession();
            size = session.createQuery("select  count  (*) from User ")
                    .getFirstResult()
                    .intValue();
        } catch (HibernateException ex) {
            System.out.println(ex.getMessage());
            throw new TransactionException(ex);
        }
        return size;
    }


    public String getName() {
        return UserService.class.getSimpleName();
    }


}



