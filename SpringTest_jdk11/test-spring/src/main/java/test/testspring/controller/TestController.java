package test.testspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!");
        return "hello";
    }

    //SIMPLE LOGIN TEST
/*
    @GetMapping("mvcLogin")
    public String mvcLogin(){
        System.out.println("index => mvcLogin_Controller");
        return "mvcLogin";
    }
*/

}
