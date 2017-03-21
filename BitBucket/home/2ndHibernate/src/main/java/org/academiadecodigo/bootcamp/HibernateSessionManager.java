package org.academiadecodigo.bootcamp;

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
public class HibernateSessionManager {
    private static SessionFactory sessionFactory;

    static {
        try {
// Hold services needed by Hibernate
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .configure("/hibernate.cfg.xml") // Load settings from persistenceResources.cfg.xml
                    .build();

            sessionFactory = new MetadataSources(serviceRegistry)
                    .buildMetadata() // Tell Hibernate about sources of metadata (database mappings)
                    .buildSessionFactory();

        } catch (HibernateException ex) {
            throw new ExceptionInInitializerError("Error creating persistenceResources session factory: " + ex.getMessage());
        }
    }

    public static Session getSession() {
        // Hibernate will automatically open a new session if needed
        // Closing the session is not required
        return sessionFactory.getCurrentSession();
    }

    // Required to stop persistenceResources and allow the application to terminate
    public static void close() {
        sessionFactory.close();
    }

    public static Session beginTransaction() {
        Session session = getSession();
        session.beginTransaction();
        return session;

    }

    public static void commitTransaction() {
        Session session = getSession();
        session.getTransaction().commit();
    }

    public static void rollbackTransaction() {
        Session session = getSession();
        session.getTransaction().rollback();
    }
}
