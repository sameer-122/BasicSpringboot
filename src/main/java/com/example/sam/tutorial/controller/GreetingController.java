package com.example.sam.tutorial.controller;
// You can have multiple controller in your application with related route put together
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController                       // It contains routes of the application and what happens when user visit that route
public class GreetingController {

    // to make this function into route, these are annotation that are built in spring framework
    //The default request is get method, so we don't need necessary to add method here simply-@RequestMapping("/") or @GetMapping("/")
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String getInfo(){
        return "Hi its me Sameer";
    }

    @RequestMapping("/greeting")
    public String getGreeting(){
        return "WELCOME   HERE";
    }

}
