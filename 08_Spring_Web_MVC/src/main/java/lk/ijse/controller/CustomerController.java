package lk.ijse.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//web mvc
//model,view, controller
//model - business logic and data access karanna - model eka application wala use karana widi wens samahara ewage data transfer widiyata use karanawa
//-methnin issrht model use wenne dto widiyata(encapsulated bean ekak wisdiyata use krnnr ee kiynne getters setters dala method public krl hdn ew)

//view - http req ekk eddi view return wen wiiyt hdnne, meka krnn wenn confugurwation cls ekka -  facaet eka ganne view tika daganna
@RestController
@RequestMapping("customer")
public class CustomerController {

    @GetMapping
    public String getCustomer(){

        return "Hello Customer........: )";
    }
}
