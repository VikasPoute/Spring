package com.spring.search.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

    @RequestMapping("/home")
    public String home() {
        return "home";
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public RedirectView search(@RequestParam("querybox") String query) {
        RedirectView redirectView = new RedirectView();
        String url = "http://google.com/search?q=" + query;
        redirectView.setUrl(url);
        return redirectView;
    }
}
