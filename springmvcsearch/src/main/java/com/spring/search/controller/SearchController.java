package com.spring.search.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/user/{id}/{name}")
    public String getUser(@PathVariable("id") int id, @PathVariable("name") String name) {
        // Your logic here

        System.out.println(id);
        System.out.println(name);
        return "home";
    }

    @RequestMapping("/number")
    public String numberException() {
        String name = "Vikas";
        int id = Integer.parseInt(name);
        return "Invalid";
    }

    // // Exception handling
    // @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    // @ExceptionHandler({ NullPointerException.class })
    // public String nullExceptionHandller(Model model) {
    //     model.addAttribute("msg", "Null Pointer Exception has occurred");
    //     return "null_page";
    // }

    // @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    // @ExceptionHandler({ NumberFormatException.class })
    // public String numberFormatException(Model model) {
    //     model.addAttribute("msg", "Number Format Exception has occurred");
    //     return "null_page";
    // }

    // @ExceptionHandler(NoHandlerFoundException.class)
    // @ResponseStatus(HttpStatus.NOT_FOUND)
    // public String error404(Model model) {
    //     model.addAttribute("msg", "404 Page Not Found");
    //     return "null_page";
    // }

}
