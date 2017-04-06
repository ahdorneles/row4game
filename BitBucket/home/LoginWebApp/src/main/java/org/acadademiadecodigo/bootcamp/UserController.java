package org.acadademiadecodigo.bootcamp;

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
    private MockUserService mockUserService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        requestDispatcher = getServletContext().getRequestDispatcher("/login.jsp");
        mockUserService = (MockUserService) getServletContext().getAttribute("mockUserService");
        req.setAttribute("mockUserService", mockUserService);
        requestDispatcher.forward(req, resp);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("username");
        String password = req.getParameter("password");
        String message = "";

        if (validation(userName, password) == true) {
            req.getSession().setAttribute("userName", userName);
           /* requestDispatcher = getServletContext().getRequestDispatcher("/afterLogin.jsp");
            requestDispatcher.forward(req, resp);*/
            resp.sendRedirect("/FredApp/afterLogin");
        }

        if (validation(userName, password) == false) {
            message = "wrong user or Password!!!";
            req.setAttribute("message", message);
            requestDispatcher = getServletContext().getRequestDispatcher("/login.jsp");
            requestDispatcher.forward(req, resp);
        }
    }

    public boolean validation(String user, String pass) {
        if (mockUserService.authenticate(user, pass) == true) {
            return true;
        } else if (mockUserService.authenticate(user, pass) == true) {
            return false;
        }
        return false;
    }

}
