package org.academiadecodigo.bootcamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by codecadet on 04/04/17.
 */

@Controller
@SessionAttributes("loginUser")
public class AfterLoginController {
    @Autowired
    private UserService userService;


    @RequestMapping(method = RequestMethod.GET, value = "/main")
    public String showMain(Model model) {

        model.addAttribute(Attribute.MAIN, new User());
        return "main";

    }

    @RequestMapping(method = RequestMethod.POST, value = "/main")
    public String showUsersList(Model model, @RequestParam("loginUser") String loginUser) {

        model.addAttribute("message", "Hello " + loginUser);
        return "main";

    }

}

