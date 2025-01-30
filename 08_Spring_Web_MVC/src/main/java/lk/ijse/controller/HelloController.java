package lk.ijse.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {
    public HelloController(){
        System.out.println("Hello Controller...........:)");
    }

    @GetMapping
    public String sayHello(){
        return "Hello World!!!";
    }

   // @PostMapping
    @GetMapping("/test1")
    public String Test1(){
        return "Test1........:)";
    }

    @GetMapping("/test2")
    public String Test2(){
        return "Test2....:)";
    }
}
