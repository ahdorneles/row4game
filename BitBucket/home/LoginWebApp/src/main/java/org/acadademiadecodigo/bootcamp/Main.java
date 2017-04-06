package org.acadademiadecodigo.bootcamp;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by codecadet on 04/04/17.
 */
public class Main implements ServletContextListener {


    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {

        MockUserService mockUserService = new MockUserService();
        User fred = new User("FRED", "FRED", "BeingME");
        User alex = new User("ALEX", "ALEX", "BeingALEX");
        User pais = new User("PAIS", "PAIS", "BeingPais");
        User geraldes = new User("GERALDES", "GERALDES", "BeingGeraldes");
        mockUserService.addUser(fred);
        mockUserService.addUser(alex);
        mockUserService.addUser(pais);
        mockUserService.addUser(geraldes);
        servletContextEvent.getServletContext().setAttribute("mockUserService", mockUserService);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
