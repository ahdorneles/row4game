package org.academiadecodigo.bootcamp.components;

import org.academiadecodigo.bootcamp.HibernateSessionManager;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 * Created by codecadet on 21/03/17.
 */
public class Component {
    public static void main(String[] args) {
        try {
            Session session = HibernateSessionManager.beginTransaction();

            Address address = new Address("Rua da Cal", "Fundão", "130");
            Customer customer = new Customer("Rod Dias", address);

            session.save(customer);

            HibernateSessionManager.commitTransaction();
        } catch (HibernateException ex) {
            ex.printStackTrace();
            HibernateSessionManager.rollbackTransaction();
        } finally {
            HibernateSessionManager.close();
        }
    }
}
