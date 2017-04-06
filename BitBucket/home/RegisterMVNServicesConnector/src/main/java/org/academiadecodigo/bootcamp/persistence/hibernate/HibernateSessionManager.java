package org.academiadecodigo.bootcamp.persistence.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

/**
 * Created by codecadet on 20/03/17.
 */
public  class HibernateSessionManager {
    private  SessionFactory sessionFactory;

   /* static {
        try {

// Hold services needed by Hibernate
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .configure("persistenceResources/hibernate.cfg.xml") // Load settings from persistenceResources.cfg.xml
                    .build();

            sessionFactory = new MetadataSources(serviceRegistry)
                    .buildMetadata() // Tell Hibernate about sources of metadata (database mappings)
                    .buildSessionFactory();

        } catch (HibernateException ex) {
            throw new ExceptionInInitializerError("Error creating persistenceResources session factory: " + ex.getMessage());
        }
    }*/

    public  Session getSession() {
        // Hibernate will automatically open a new session if needed
        // Closing the session is not required
        return sessionFactory.getCurrentSession();
    }

    // Required to stop persistenceResources and allow the application to terminate
    public  void close() {
        sessionFactory.close();
    }

    public  Session beginTransaction() {
        Session session = getSession();
        session.beginTransaction();
        return session;
    }

    public  void commitTransaction() {
        getSession().getTransaction().commit();
    }

    public  void rollbackTransaction() {
        getSession().getTransaction().rollback();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
