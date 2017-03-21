package org.academiadecodigo.bootcamp.service.user;

import org.academiadecodigo.bootcamp.persistence.HibernateSessionManager;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by codecadet on 20/03/17.
 */
public class HibernateUserService {


        public HibernateUserService(){

        }

    public void addUser(){
        Session session = HibernateSessionManager.getSession(); // or getCurrentSession
        Transaction tx = null;
        try {
            tx = session.beginTransaction();

            // do some work

            // Hibernate will close the session on commit
            tx.commit();
        } catch (HibernateException e) {
            // Hibernate will close the session on rollback
            tx.rollback();
        }
    }
}
