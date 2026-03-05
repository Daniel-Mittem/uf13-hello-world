package it.marconi.hello_world.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
public class HelloController {
    
    //creo un handler
    @GetMapping("/")    
    public String saluta() {
        return "hello-world";
    }

    // query string
    @GetMapping(params = "papero")
    public String salutaConParametro(){
        return "hello-world-param";
    }

    @GetMapping("/model")
    public String salutaModel(){
        return "hello-world-model";
    }

    @ModelAttribute("maker")
    public String handlerMaker() {
        return "Marconi";
    }
}
