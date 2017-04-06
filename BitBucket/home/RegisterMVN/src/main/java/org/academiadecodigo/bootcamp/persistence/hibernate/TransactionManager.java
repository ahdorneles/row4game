package org.academiadecodigo.bootcamp.persistence.hibernate;

import org.hibernate.Session;

/**
 * Created by codecadet on 23/03/17.
 */
public interface TransactionManager {

    public Session getSession();

    public Session beginTransaction();

    public  void commitTransaction();

    public  void rollbackTransaction();

    public void close();



    }
