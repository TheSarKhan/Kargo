package az.sarkhan.yasilkargo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping(path = { "/index","/","/home"})
    public String getHome(){
        return "home";
    }
    @GetMapping(path = "/nav")
    public String getNav(){
        return "nav";
    }
}
