package lk.ijse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("character")
public class CharacterMappingController {

    @GetMapping("test1/I???")  //ques marks ganata values danna , meken apita puluwn id wage dewal denna ilakkam gana ema ekka
    public String test1(){
        return "test 1 get Invoked method";
    }

    @GetMapping("????/test2")  //ques marks ganata values danna , meken apita puluwn id wage dewal denna ilakkam gana ema ekka
    public String test2(){
        return "test 2 get Invoked method";
    }
}
