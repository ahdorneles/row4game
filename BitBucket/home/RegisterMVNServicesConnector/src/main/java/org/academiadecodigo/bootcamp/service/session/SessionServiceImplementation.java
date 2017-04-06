package org.academiadecodigo.bootcamp.service.session;

import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.model.dao.UserDao;
import org.academiadecodigo.bootcamp.persistence.hibernate.TransactionManager;
import org.academiadecodigo.bootcamp.persistence.transaction.TransactionException;
import org.academiadecodigo.bootcamp.service.user.UserService;

/**
 * Created by Asus on 26/03/2017.
 */
public class SessionServiceImplementation implements  SessionService {
    private UserDao userDao;
    private TransactionManager transactionManager;
    private Integer userId;

    public SessionServiceImplementation(UserDao userDao, TransactionManager transactionManager){
        this.userDao = userDao;
        this.transactionManager = transactionManager;
    }

    @Override
    public String getName() {
        return UserService.class.getSimpleName();
    }

    @Override
    public boolean login(String username, String password) {
        boolean result = false;

        try{
            transactionManager.beginTransaction();
            User user = userDao.read(username);
            result = (user != null && user.getPassword().equals(password));
            if(result){
                userId = user.getId();
            }
            transactionManager.commitTransaction();
        }catch (TransactionException ex) {
            transactionManager.rollbackTransaction();
        }
        return false;
    }

    @Override
    public void logout() {
        userId = null;
    }

    @Override
    public boolean isLOggedIn() {
        return false;
    }
}
