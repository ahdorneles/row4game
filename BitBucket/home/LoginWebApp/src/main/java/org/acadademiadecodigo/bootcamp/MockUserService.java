package org.acadademiadecodigo.bootcamp;

import java.util.ArrayList;

/**
 * Created by codecadet on 04/04/17.
 */
public class MockUserService {
    private int count = 0;
    private ArrayList<User> users;

    public MockUserService() {
        users = new ArrayList<User>();

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
        count++;
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
        return count;
    }


    public ArrayList<User> getUsers() {
        return users;
    }


}

