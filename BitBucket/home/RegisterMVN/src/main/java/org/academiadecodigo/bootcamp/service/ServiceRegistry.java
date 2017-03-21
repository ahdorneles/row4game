package org.academiadecodigo.bootcamp.service;

import java.util.HashMap;

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

    public void addService(Service service) {
        if (!services.containsKey(service)) {
            services.put(service.getName(), service);
        }
    }

    public HashMap<String, Service> getServicesHashMap() {
        return services;
    }

    public Service getServiceValue(String key) {
        return services.get(key);
    }

    public void removeService(Service service) {
        services.remove(service.getName());
    }
}
