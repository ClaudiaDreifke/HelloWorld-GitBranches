package com.example.helloworldgitbranches;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloWorld")
public class HelloWorld {

    @GetMapping("/en")
    public String sayHelloWorldEn(){
        return "Hello World!";
    }

    @GetMapping("/de")
    public String sayHelloWorldDe(){
        return "Hallo Welt!";
    }
}
