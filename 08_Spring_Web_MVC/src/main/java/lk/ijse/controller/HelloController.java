package lk.ijse.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController  //meka change krnw nomal controller ekkr , meken print wenne methna thiyn index iyna ekamy
@Controller //meka dammama facet eke eka print wenne

@RequestMapping("hello")
public class HelloController {
    /*public HelloController(){
        System.out.println("Hello Controller...........:)");
    }*/

    @GetMapping
    public String sayHello(){
       // return "index";
        return "hello";
    }

  /* // @PostMapping
    @GetMapping("/test1")
    public String Test1(){
        return "Test1........:)";
    }

    @GetMapping("/test2")
    public String Test2(){
        return "Test2....:)";
    }*/
}
