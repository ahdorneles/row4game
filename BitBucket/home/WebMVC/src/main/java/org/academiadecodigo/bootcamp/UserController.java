package org.academiadecodigo.bootcamp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by codecadet on 03/04/17.
 */
public class UserController extends HttpServlet {
    private RequestDispatcher requestDispatcher;
    private User user;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        requestDispatcher = getServletContext().getRequestDispatcher("/user.jsp");
        user = new User("Fred", "FED", "BeingME");

     /*   getServletContext().setAttribute("user", user);

        req.getSession().setAttribute("user", user);*/

        req.setAttribute("user", user);

        requestDispatcher.include(req, resp);

        requestDispatcher.forward(req, resp);

    }



}
