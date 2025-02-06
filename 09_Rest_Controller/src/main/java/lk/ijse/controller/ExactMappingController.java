package lk.ijse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("exact")
public class ExactMappingController {

    //exat/test1
    //get method 2k dmmoth 500 internal server error ekak enw
    //Ambiguous == aduraganna ba

    @GetMapping(path = "test1")
    public String test1(){
        return "Exact Mapping Test 1";
    }

    //path = "test2/Isha" mema dnnth puluwn
    //path kiyanne attribute ekak eken aduraganna puuwn wenawa
    @GetMapping(path = "test2")
    public String test2(){
        return "Exact Mapping Test 2";
    }
}
