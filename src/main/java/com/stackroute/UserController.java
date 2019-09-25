package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UserController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String loginModel(ModelMap model) {
        return "login";
    }

    @RequestMapping(value = "/displayUser", method = RequestMethod.POST)
    public String displayModel(@RequestParam(value = "userName") String userName,
                               @RequestParam(value = "pass") String pass, ModelMap model) {
        if(!pass.equals("password")) {
            return "displayError";
        }
        User user = new User(userName);
        model.addAttribute("user", user);
        return "displayUser";
    }
}
