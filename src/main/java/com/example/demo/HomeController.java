package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class HomeController {
    @RequestMapping("/carform")
    public String loadCarForm(Model model) {
        model.addAttribute("car", new Car());
        return "carform";
    }

    @PostMapping("carform")
    public String processCarForm(@Valid Car car, BindingResult result) {
        if (result.hasErrors()) {
            return "carform";
        }
        return "carconfirm";
    }
}
