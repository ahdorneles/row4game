package org.academiadecodigo.mappings.inheritance;

import org.academiadecodigo.mappings.HibernateSessionManager;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 * Created by tekman on 21/03/2017.
 */
public class Inheritance {

    public static void main(String[] args) {

        try {

            Session session = HibernateSessionManager.beginTransaction();

            Boat boat = new Boat("Sunked", 0, 2);

            Car car = new Car("Mustang", 400, 19);

            session.save(boat);

            session.save(car);

            HibernateSessionManager.commitTransaction();

        } catch (HibernateException ex) {

            ex.printStackTrace();
            HibernateSessionManager.rollbackTransaction();

        } finally {
            HibernateSessionManager.close();
        }


    }



}
