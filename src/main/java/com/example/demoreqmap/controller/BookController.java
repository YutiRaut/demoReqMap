package com.example.demoreqmap.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo1")
public class BookController {

    @RequestMapping("/book")
    @ResponseBody
    public String getBookName(){
        return "Spring Framework";
    }


}
