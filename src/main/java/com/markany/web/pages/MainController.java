package com.markany.web.pages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping(value = {"/", "/board"})
    public String entry() {
        return "index";
      }
    
}
