package com.example.springWebOne;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

@Controller
public class Controller2 {

    @GetMapping("/str2") //реагировать на запрос localhost:8080/str2 или <IP-адрес>:<Port>/str2
    public String str2(Model model) {
        //параметр класса Model - это словарь всех атрибутов, которые передаются внутрь шаблона
        System.out.println("получен запрос к str2"); //отладка, видна в консоли сервера
        int x = new Random().nextInt(1, 100);
        int y = new Random().nextInt(30, 70);
        model.addAttribute("num1", x);//помещаем значение Х под именем num 1 в шаблон
        model.addAttribute("num2", y); //model.asMap().put("num2", y);
        return "template2"; //использовать шаблон template2.html из папки ресурсов
    }

    @GetMapping("/addition") //такой запрос может прийти с параметрами a, b или без них
    public String addition(@RequestParam(name = "a", defaultValue = "0") int a,
                           @RequestParam(name = "b", defaultValue = "0") int b, Model model) {
        model.addAttribute("result", a + b);
        return "templateSum";
    }

}
