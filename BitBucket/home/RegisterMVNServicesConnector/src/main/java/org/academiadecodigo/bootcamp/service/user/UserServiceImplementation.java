package org.academiadecodigo.bootcamp.service.user;

import org.academiadecodigo.bootcamp.model.Role;
import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.model.dao.RoleDao;
import org.academiadecodigo.bootcamp.model.dao.UserDao;
import org.academiadecodigo.bootcamp.persistence.hibernate.TransactionManager;
import org.academiadecodigo.bootcamp.persistence.transaction.TransactionException;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by codecadet on 23/03/17.
 */
public class UserServiceImplementation implements UserService {
    private UserDao userDao;
    private RoleDao roleDao;

    public UserServiceImplementation(UserDao userDao, RoleDao roleDao) {
        this.userDao = userDao;
        this.roleDao = roleDao;

    }

    @Transactional
    @Override
    public boolean authenticate(String user, String pass) {
        System.out.println("asdasd: " + findByName(user));
        if (findByName(user) == null) {
            return false;
        }
        if (findByName(user).getUserName().equals(user)) {
            User myUser = findByName(user);
            if (myUser.getPassword().equals(pass)) {
                return true;
            }
        }
        return false;
    }


    @Transactional
    @Override
    public void addUser(User user) {
        if (userDao.read(user.getUserName()) == null) {
            userDao.create(user);
        }
    }

    @Transactional
    @Override
    public void addUserRole(String username, String role) {
        User user = userDao.read(username);
        Role role1 = roleDao.read(role);
        if (user != null && role1 != null) {
            user.userSetRole(role1);
        }
        System.out.println("User or role not available");
    }

    @Transactional
    @Override
    public User findByName(String user) {
        if (user == null) {
            System.out.println("No username");
        }
        User user1 = userDao.read(user);
        return user1;

    }

    @Transactional
    @Override
    public int count() {
        int count = userDao.count();
        return count;

    }


    @Transactional
    @Override
    public boolean doesUserExists(String user, String email) {
        if (user.length() == 0) {
            System.out.println("User is empty");
            return false;
        }
        if (findByName(user) != null) {
            return false;
        }
        return true;
    }

    @Override
    public String getName() {
        return UserService.class.getSimpleName();
    }
}

