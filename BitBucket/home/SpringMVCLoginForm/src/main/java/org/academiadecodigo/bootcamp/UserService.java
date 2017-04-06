package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 05/04/17.
 */
public interface UserService {

    boolean authenticate(String username, String password);

    boolean doesUserExists(String user, String email);

    public void addUser(User mockUser);

    public User findByName(String string);



    }
