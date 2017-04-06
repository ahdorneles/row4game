package org.academiadecodigo.bootcamp.model.dao;

import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.service.user.UserService;

import java.util.List;

/**
 * Created by codecadet on 23/03/17.
 */
public interface UserDao extends Dao<User> {
    List<User> findAll();

    List<User> findById();

    User read(String user);

    int count();
}
