package org.academiadecodigo.bootcamp.inheritance;

import org.academiadecodigo.bootcamp.HibernateSessionManager;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import java.awt.event.HierarchyBoundsAdapter;

/**
 * Created by codecadet on 21/03/17.
 */
public class Inheritance {
    public static void main(String[] args) {
        try {
            Session session = HibernateSessionManager.beginTransaction();
            Boat boat = new Boat("Sunked", 18);
            Car car = new Car("Mustang", 400, 19);

            session.save(boat);
            session.save(car);

            HibernateSessionManager.commitTransaction();;
        }
        catch (HibernateException ex){
            ex.printStackTrace();
            HibernateSessionManager.rollbackTransaction();
        }
        finally {
            HibernateSessionManager.close();
        }
    }
}
