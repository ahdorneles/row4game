package org.academiadecodigo.bootcamp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by codecadet on 04/04/17.
 */
@Controller
public class HelloController {

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    public String sayHello(Model model) {

        // Add an attribute to the request
        model.addAttribute("greeting", "Hello World");

        // Return the view name
        return "hello";

    }

    /*public String showLogin(Model model) {
        model.addAllAttributes("user", new User) {
            return "login";
        }
    }*/

}
