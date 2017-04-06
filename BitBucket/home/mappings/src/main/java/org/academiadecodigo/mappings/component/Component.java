package org.academiadecodigo.mappings.component;

import org.academiadecodigo.mappings.HibernateSessionManager;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 * Created by tekman on 21/03/2017.
 */
public class Component {


    public static void main(String[] args) {

        try {
            Session session = HibernateSessionManager.beginTransaction();

            Address address = new Address("Rua da Cal", "FUNdao", "13b");
            Customer customer = new Customer("Rod Dias", address);

            session.save(customer);

            HibernateSessionManager.commitTransaction();
        } catch (HibernateException ex) {
            HibernateSessionManager.rollbackTransaction();
        } finally {
            HibernateSessionManager.close();
        }

    }

}
