package com.example.springWebOne;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controller1 {
    @GetMapping ("/str1") //реагировать на запрос localhost:8080/str1 или <IP-адрес>:<Port>/str1
    public String str1(){
        System.out.println("получен запрос к str1"); //отладка, видна в консоли сервера
        return "template1"; //использовать шаблон template1.html из папки ресурсов
    }


}

