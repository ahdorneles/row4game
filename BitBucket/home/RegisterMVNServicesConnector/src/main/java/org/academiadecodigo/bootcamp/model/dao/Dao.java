package org.academiadecodigo.bootcamp.model.dao;

import org.academiadecodigo.bootcamp.model.Role;

/**
 * Created by codecadet on 24/03/17.
 */
public interface Dao<T> {
    void create(T genericObject);

    void update(T genericObject);

    void delete(T genericObject);




}
