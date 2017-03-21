package org.academiadecodigo.bootcamp.service.user;

import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.persistence.ConnectionManager;

import java.sql.*;

/**
 * Created by codecadet on 13/03/17.
 */
public class JdbcUserService implements UserService {
    Connection connection = null;
    ConnectionManager connectionManager;


    public JdbcUserService(ConnectionManager connectionManager) {
        this.connectionManager = connectionManager;
    }

    @Override
    public String getName() {
        return UserService.class.getSimpleName();
    }

    @Override
    public boolean authenticate(String user, String pass) {
        try {
            if (connection == null) {
                connection = connectionManager.getConnection();
            }
            PreparedStatement statement = null;
            String query = "SELECT user_name FROM users WHERE user_name = ? and user_pass = ?";
            statement = connection.prepareStatement(query);
            statement.setString(1, user);
            statement.setString(2, pass);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                return true;
            }

        } catch (SQLException ex) {
            System.out.println("Failure to connect to database : " + ex.getMessage());
        }
        return false;
    }

    @Override
    public void addUser(User user) {
        if (connection == null) {
            connection = connectionManager.getConnection();
        }
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            String userName = user.getUserName();
            String password = user.getPassword();
            String email = user.getEmail();
            String query = "INSERT INTO USERS (user_name, user_pass, USER_email) VALUES (?,?,?)";
            statement = connection.prepareStatement(query);
            statement.setString(1, userName);
            statement.setString(2, password);
            statement.setString(3, email);
            statement.executeUpdate();
            connection.commit();

        } catch (SQLException e) {
            e.printStackTrace();
            try {
                connection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    @Override
    public User findByName(String userName) {
        if (connection == null) {
            connection = connectionManager.getConnection();
        }
        PreparedStatement statement = null;
        try {
            String query = "SELECT user_name FROM users WHERE user_name = ? ;";
            statement = connection.prepareStatement(query);
            statement.setString(1, userName);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String usernameValue = resultSet.getString("user_name");
                String passwordValue = resultSet.getString("user_pass");
                String emailValue = resultSet.getString("user_email");
                User user = new User(usernameValue, passwordValue, emailValue);
                return user;
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    @Override
    public int count() {
        if (connection == null) {
            connection = connectionManager.getConnection();
        }
        int result = 0;
        try {
            Statement statement = connection.createStatement();
            String query = "SELECT COUNT(*) FROM users";
            ResultSet resultSet = null;
            resultSet = statement.executeQuery(query);
            if (resultSet.next()) {
                result = resultSet.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }


    @Override
    public boolean doesUserExists(String user, String email) {
        try {
            if (connection == null) {
                connection = connectionManager.getConnection();
            }
            PreparedStatement statement = null;
            String query = "SELECT user_name FROM users WHERE user_name = ?;";
            statement = connection.prepareStatement(query);
            statement.setString(1, user);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String userValue = resultSet.getString("user_name");
                if (userValue.equals(user)) {
                    return false;
                }
            }

        } catch (SQLException ex) {
            System.out.println("Failure to connect to database : " + ex.getMessage());
        }
        return true;
    }

}
