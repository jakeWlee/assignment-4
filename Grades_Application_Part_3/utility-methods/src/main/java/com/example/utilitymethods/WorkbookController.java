package com.example.utilitymethods;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WorkbookController {
    @GetMapping(value="/")
    public String getMethodName(Model model) {
        model.addAttribute("menu", "I am studying Spring Boot");
        return "view";
    }
}
