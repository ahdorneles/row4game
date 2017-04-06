package org.academiadecodigo.bootcamp;

import java.util.List;

/**
 * Created by codecadet on 04/04/17.
 */

public class MockUserService implements UserService {
    private List<User> users;


    public MockUserService() {
    }

    public MockUserService(List<User> users) {
        this.users = users;
    }


    public boolean authenticate(String user, String pass) {
        for (int i = 0; i < getUsers().size(); i++) {
            if (getUsers().get(i).getUsername().equals(user)) {
                if (getUsers().get(i).getPassword().equals(pass)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean doesUserExists(String user, String email) {
        for (int i = 0; i < getUsers().size(); i++) {
            if (getUsers().get(i).getUsername().equals(user)) {
                System.out.println("User Already exists");
                return false;

            }
            if (getUsers().get(i).getFunction().equals(email)) {
                System.out.println("Email already in use");
                return false;
            }

        }
        return true;
    }

    public void addUser(User mockUser) {
        users.add(mockUser);
    }


    public User findByName(String string) {
        for (int i = 0; i < getUsers().size(); i++) {
            if (getUsers().get(i).getUsername().equals(string)) {
                return getUsers().get(i);
            }
        }
        System.out.println("User unknown");
        return null;
    }

    public int count() {
        return users.size();
    }


    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}

