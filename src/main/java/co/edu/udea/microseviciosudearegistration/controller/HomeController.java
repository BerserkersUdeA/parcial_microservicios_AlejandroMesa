package co.edu.udea.microseviciosudearegistration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@ResponseBody
public class HomeController {
    @GetMapping(value = "/hello")
    public String returnGreettings(){
        return "Hola desde el mundo Spring Boot";
    }
    @GetMapping(value = "/")
    public String returnBlank(){
        return "";
    }
}
