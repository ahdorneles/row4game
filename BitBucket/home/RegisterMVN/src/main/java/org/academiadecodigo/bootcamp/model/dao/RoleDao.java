package org.academiadecodigo.bootcamp.model.dao;

import org.academiadecodigo.bootcamp.model.Role;
import org.academiadecodigo.bootcamp.model.User;

/**
 * Created by codecadet on 23/03/17.
 */
public interface RoleDao extends Dao<Role> {
    Role read(String role);



}
