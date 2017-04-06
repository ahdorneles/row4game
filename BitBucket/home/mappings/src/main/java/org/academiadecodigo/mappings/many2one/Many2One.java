package org.academiadecodigo.mappings.many2one;

import org.academiadecodigo.mappings.HibernateSessionManager;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 * Created by tekman on 21/03/2017.
 */
public class Many2One {


    public static void main(String[] args) {

        try {
            Session session = HibernateSessionManager.beginTransaction();

            Owner owner = new Owner("CR7");

            Car c1 = new Car("Panda", owner);

            session.save(c1);

            HibernateSessionManager.commitTransaction();



        } catch (HibernateException ex) {
            HibernateSessionManager.rollbackTransaction();


        }


        try {
            Session session = HibernateSessionManager.beginTransaction();

            Owner owner = session.get(Owner.class, 1);

            Car c2 = new Car("Boca de Sapo", owner);

            session.save(c2);

            HibernateSessionManager.commitTransaction();



        } catch (HibernateException ex) {
            HibernateSessionManager.rollbackTransaction();


        } finally {
            HibernateSessionManager.close();
        }


    }
}
