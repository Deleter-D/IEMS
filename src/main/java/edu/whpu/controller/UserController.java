package edu.whpu.controller;

import edu.whpu.pojo.User;
import edu.whpu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public User login(String username, String password) {
        return userService.userLogin(username, password);
    }

    @RequestMapping(value = "getUserById", method = RequestMethod.POST)
    @ResponseBody
    public User getUserById(String uid) {
        return userService.getUserById(Integer.parseInt(uid));
    }
}
