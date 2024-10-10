package com.example.springWebOne;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerRect {
    @GetMapping("/rectangles")
    public String rect(@RequestParam(name = "a", defaultValue = "0") int a,
                           @RequestParam(name = "b", defaultValue = "0") int b, Model model) {
        model.addAttribute("result", a * b);
              return "tempRect";



        }
    }