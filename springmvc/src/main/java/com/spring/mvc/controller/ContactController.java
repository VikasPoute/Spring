package com.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RequestParam;

import com.spring.mvc.model.User;
import com.spring.mvc.service.UserService;

@Controller
public class ContactController {

    @Autowired
    private UserService userService;

    @RequestMapping("/contact")
    public String showForm() {
        return "contact";
    }

    // // Using RequesParam
    // @RequestMapping(path = "/processForm", method = RequestMethod.POST)
    // public String processForm(
    // @RequestParam("username") String username,
    // @RequestParam("email") String email,
    // @RequestParam("password") String password,
    // @RequestParam("city") String city,
    // @RequestParam("zip") int zip,
    // Model model) {

    // User user = new User();

    // user.setUsername(username);
    // user.setEmail(email);
    // user.setCity(city);
    // user.setZip(zip);
    // user.setPassword(password);

    // // model.addAttribute("city", city);
    // // model.addAttribute("zip", zip);
    // // model.addAttribute("password", password);
    // // model.addAttribute("name", username);
    // // model.addAttribute("email", email);

    // model.addAttribute("user", user);
    // return "sucess";
    // }

    @RequestMapping(path = "/processForm", method = RequestMethod.POST)
    public String processForm(@ModelAttribute User user) {
        this.userService.saveUser(user);
        return "sucess";
    }

}
