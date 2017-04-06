package org.academiadecodigo.bootcamp.service.user;

import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.service.Service;

import java.util.ArrayList;

/**
 * Created by codecadet on 07/03/17.
 */
public interface UserService extends Service {
    public boolean authenticate(String user, String pass);

    public void addUser(User user);

    public void addUserRole(String username, String role);

    public User findByName(String string);

    public int count();

    public boolean doesUserExists(String user, String email);
}
