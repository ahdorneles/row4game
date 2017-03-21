package org.academiadecodigo.bootcamp.service;

import org.academiadecodigo.bootcamp.persistence.ConnectionManager;
import org.academiadecodigo.bootcamp.service.user.JdbcUserService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by codecadet on 15/03/17.
 */
public class ServiceRegistryTest {
    private JdbcUserService jdbcUserService;
    private static ServiceRegistry instance;

    @Before
    public void testStart(){
        jdbcUserService = new JdbcUserService(new ConnectionManager());
        instance = ServiceRegistry.getInstance();
    }


    @Test
    public void testAddingService(){
        ServiceRegistry.getInstance().addService(jdbcUserService);
        ServiceRegistry.getInstance().addService(jdbcUserService);
        assertTrue(ServiceRegistry.getInstance().getServicesHashMap().size() == 1);
    }


    @Test
    public void testHashMap() {
        assertFalse(ServiceRegistry.getInstance().getServicesHashMap().isEmpty());
    }

    @Test
    public void testInstance() {
        assertTrue(ServiceRegistry.getInstance() == instance);
    }

    @Test
    public void testGetService() {
        assertFalse(ServiceRegistry.getInstance().getServiceValue("UserService") == null);
    }

    @Test
    public void testIntelliJKnowsMath(){
        assertTrue(5 + 5  == 10);
    }

    @Test
    public void testRemove(){
        ServiceRegistry.getInstance().addService(jdbcUserService);
        ServiceRegistry.getInstance().removeService(jdbcUserService);
        assertTrue(ServiceRegistry.getInstance().getServicesHashMap().size() == 0);

    }

    @After
    public void testInstanceToNull(){
        instance = null;
    }
}
