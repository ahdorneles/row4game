package org.academiadecodigo.bootcamp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by codecadet on 29/03/17.
 */
public class HelloWorld extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("username");

        if (name != null && name.equals("trash")) {
            throw new ServletException("Server is in trouble");
        }

        if (name != null) {
            resp.setContentType("text/html");

            resp.getWriter().printf("<html>" +
                    "<body>" +
                    "<h1>Hello %s </h1>" +
                    "</body" +
                    "<html", name);
        } else {
            resp.getWriter().println("I need a name");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("username");

        if (name == null || name.isEmpty()) {
            resp.sendRedirect("/hello/index.html");
        } else {
            resp.getWriter().printf("Hello Mr.  %s, welcome to out servlet!!", name);
        }
    }
}
