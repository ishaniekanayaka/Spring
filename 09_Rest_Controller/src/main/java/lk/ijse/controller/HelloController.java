package lk.ijse.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("hello")
public class HelloController {
    public HelloController(){
        System.out.println("Hello Controller...........:)");
    }

    @GetMapping
    public String sayHello(){
        return "Get Mapping Invoked...";

    }

    @PostMapping
    public String sayHelloo(){
        return "Post Mapping Invoked...";
    }

    @DeleteMapping
    public String sayHelloooo(){
        return "Delete Mapping Invoked...";
    }

    @PutMapping
    public String sayHellooooo(){
        return "Put Mapping Invoked...";
    }

    @PatchMapping
    public String sayHelloooooo(){
        return "Patch Mapping Invoked...";
    }
}
