package org.academiadecodigo.bootcamp.service.user;

import org.academiadecodigo.bootcamp.model.User;

import java.util.ArrayList;

/**
 * Created by codecadet on 07/03/17.
 */
public class MockUserService implements UserService {
    private int count = 0;
    private ArrayList<User> users;

    public MockUserService() {
        users = new ArrayList<>();

    }

    @Override
    public String getName() {
        return UserService.class.getSimpleName();
    }

    public boolean authenticate(String user, String pass) {
        for (int i = 0; i < getUsers().size(); i++) {
            if (getUsers().get(i).getUserName().equals(user)) {
                if (getUsers().get(i).getPassword().equals(pass)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean doesUserExists(String user, String email) {
        for (int i = 0; i < getUsers().size(); i++) {
            if (getUsers().get(i).getUserName().equals(user)) {
                System.out.println("User Already exists");
                return false;

            }
            if (getUsers().get(i).getEmail().equals(email)) {
                System.out.println("Email already in use");
                return false;
            }

        }
        return true;
    }

    public void addUser(User mockUser) {
        users.add(mockUser);
        count++;
    }

    public User findByName(String string) {
        for (int i = 0; i < getUsers().size(); i++) {
            if (getUsers().get(i).getUserName().equals(string)) {
                return getUsers().get(i);
            }
        }
        System.out.println("User unknown");
        return null;
    }

    public int count() {
        return count;
    }


    public ArrayList<User> getUsers() {
        return users;
    }


}
