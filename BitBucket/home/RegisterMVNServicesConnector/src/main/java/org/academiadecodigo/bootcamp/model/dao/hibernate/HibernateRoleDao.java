package org.academiadecodigo.bootcamp.model.dao.hibernate;

import org.academiadecodigo.bootcamp.model.Role;
import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.model.dao.RoleDao;
import org.academiadecodigo.bootcamp.persistence.hibernate.HibernateSessionManager;
import org.academiadecodigo.bootcamp.persistence.transaction.TransactionException;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 * Created by codecadet on 23/03/17.
 */
public class HibernateRoleDao extends AbstractDao<Role> implements RoleDao {


    /*public HibernateRoleDao(HibernateSessionManager hibernateSessionManager) {
        super(Role.class, hibernateSessionManager);
    }*/


    @Override
    public Role read(String role) {
        Session session;

        try {
            session =  getHibernateSessionManager().getSession();
            Query query = session.createQuery("from Role where role = :role");
            query.setString("role", role);
            Role role1 = (Role) query.uniqueResult();
            return role1;
        } catch (HibernateException ex) {
            throw new TransactionException(ex);
        }
    }
}
