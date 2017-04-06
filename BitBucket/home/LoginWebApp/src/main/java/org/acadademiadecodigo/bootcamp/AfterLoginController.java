package org.acadademiadecodigo.bootcamp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by codecadet on 04/04/17.
 */
public class AfterLoginController extends HttpServlet{
    private RequestDispatcher requestDispatcher;
    private MockUserService mockUserService;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        requestDispatcher = getServletContext().getRequestDispatcher("/afterLogin.jsp");
        mockUserService = (MockUserService) getServletContext().getAttribute("mockUserService");
        req.setAttribute("users", mockUserService.getUsers());
        requestDispatcher.forward(req, resp);




    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         req.getSession().getServletContext().getAttribute("userName");
    }
}
