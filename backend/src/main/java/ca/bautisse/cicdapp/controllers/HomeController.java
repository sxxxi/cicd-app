package ca.bautisse.cicdapp.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class HomeController {
    @GetMapping("/")
    public String getIndex(Model model) {
        return "index";
    }
}
