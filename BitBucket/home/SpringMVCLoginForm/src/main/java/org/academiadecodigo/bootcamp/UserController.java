package org.academiadecodigo.bootcamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.validation.Valid;

/**
 * Created by codecadet on 03/04/17.
 */

@Controller
@SessionAttributes("loginUser")
public class UserController {

    @Autowired
    private UserService userService;




    @RequestMapping(method = RequestMethod.GET, value = "/login")
    public String showLogin(Model model) {

        model.addAttribute(Attribute.USER, new User());
        return "login";

    }


    @RequestMapping(method = RequestMethod.POST, value = "/login")
    public String doLogin(Model model, @Valid @ModelAttribute(Attribute.USER) User user, BindingResult bindingResult) {



        if (bindingResult.hasErrors()) {
            return "login";
        }

        // If user/pass fields are empty, display the same view again
        if (user.getUsername() == null || user.getUsername().isEmpty() || user.getPassword() == null || user.getPassword().isEmpty()) {
            return "login";
        }

        // If auth succeeds, render a new view
        if (userService.authenticate(user.getUsername(), user.getPassword())) {
            model.addAttribute("greeting", "Welcome");
            model.addAttribute("loginUser", user);
            return "main";

            // If auth fails, render the same view with error message
        } else {
            model.addAttribute("error", "Authentication Failure");
            return "login";
        }

    }

}
