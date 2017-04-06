package org.academiadecodigo.bootcamp.service.user;

import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.model.dao.RoleDao;
import org.academiadecodigo.bootcamp.model.dao.UserDao;
import org.academiadecodigo.bootcamp.persistence.hibernate.TransactionManager;
import org.academiadecodigo.bootcamp.persistence.transaction.TransactionException;


/**
 * Created by codecadet on 23/03/17.
 */
public class UserServiceImplementation implements UserService {
    private UserDao userDao;
    private RoleDao roleDao;
    private TransactionManager transactionManager;

    public UserServiceImplementation(UserDao userDao, TransactionManager transaction, RoleDao roleDao) {
        this.userDao = userDao;
        this.roleDao = roleDao;
        this.transactionManager = transaction;

    }

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

    @Override
    public void addUser(User user) {
        try {
            transactionManager.beginTransaction();
            System.out.println("BEFORE SAVE");
            userDao.create(user);
            System.out.println("After SAVE");
            transactionManager.commitTransaction();
        } catch (TransactionException ex) {
            transactionManager.rollbackTransaction();
        }
    }

    @Override
    public User findByName(String user) {
        try {
            transactionManager.beginTransaction();
            User user1 = userDao.read(user);
            transactionManager.commitTransaction();
            return user1;
        } catch (TransactionException ex) {
            transactionManager.rollbackTransaction();
        }
        return null;
    }

    @Override
    public int count() {
        try {
            transactionManager.beginTransaction();
            int count = userDao.count();
            transactionManager.commitTransaction();
            return count;
        } catch (TransactionException ex) {
            transactionManager.rollbackTransaction();
        }
        return 0;
    }

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

