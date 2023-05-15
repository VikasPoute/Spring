package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {

    // // Simple using the redirect prefix
    // @RequestMapping("/one")
        // public String one() {
        // System.out.println("This is one!");
        // return "redirect:/second";
    // }

    // using the redirectView prefix
    @RequestMapping(value = "/one")
    public RedirectView one() {
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("second");
        return redirectView;
    }

    @RequestMapping("/second")
    public String second() {
        System.out.println("This is second!");
        return "contact";
    }
}
