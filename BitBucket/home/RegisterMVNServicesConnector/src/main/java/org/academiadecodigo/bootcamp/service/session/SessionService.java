package org.academiadecodigo.bootcamp.service.session;

import org.academiadecodigo.bootcamp.service.Service;

/**
 * Created by Asus on 26/03/2017.
 */
public interface SessionService extends Service {

    boolean login(String username, String password);

    void logout();

    boolean isLOggedIn();

}
