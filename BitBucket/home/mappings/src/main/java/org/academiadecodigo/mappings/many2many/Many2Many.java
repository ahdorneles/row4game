package org.academiadecodigo.mappings.many2many;

import org.academiadecodigo.mappings.HibernateSessionManager;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by tekman on 21/03/2017.
 */
public class Many2Many {

    public static void main(String[] args) {

        try {

            Session session = HibernateSessionManager.beginTransaction();

            User u1 = new User("xalana", "password");
            User u2 = new User("Jesse", "leave_me_alone");

            Set<User> users = new HashSet<User>();

            users.add(u1);
            users.add(u2);


            SecurityGroup g1 = new SecurityGroup("admin", users);

            SecurityGroup g2 = new SecurityGroup("codeMonkey", users);

            session.save(g1);
            session.save(g2);

            System.out.println(session.get(User.class, 1));


            HibernateSessionManager.commitTransaction();



        } catch (HibernateException ex) {

            ex.printStackTrace();
            HibernateSessionManager.rollbackTransaction();

        } finally {
            HibernateSessionManager.close();
        }


    }

}
