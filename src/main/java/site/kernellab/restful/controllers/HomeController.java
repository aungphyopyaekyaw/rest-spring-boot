package site.kernellab.restful.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {
    @RequestMapping("/")
    String home() {
        return "home";
    }

    @RequestMapping("/hello")
    public ModelAndView homePage() {
        String message = "Hello World";
		return new ModelAndView("hello", "helloJSP", message);
    }
}