package org.academiadecodigo.bootcamp.service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by codecadet on 14/03/17.
 */
public final class ServiceRegistry {
    private static ServiceRegistry instance = null;
    private HashMap<String, Service> services = new HashMap<>();


    public static synchronized ServiceRegistry getInstance() {
        if (instance == null) {
            instance = new ServiceRegistry();
        }
        return instance;
    }

    public void addService(String key, Service service) {
        if (!services.containsKey(key)) {
            services.put(key, service);
        }
    }


    public HashMap<String, Service> getServices() {
        return services;
    }

    public Service getService(String key) {
        return services.get(key);
    }

    public void removeService(String key) {
        services.remove(key);
    }
}
