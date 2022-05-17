package com.example.escuela.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author admin
 */
@Controller
public class EscuelaIndexController {
    
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
