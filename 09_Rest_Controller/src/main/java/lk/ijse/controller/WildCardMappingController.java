package lk.ijse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("wildcard")
public class WildCardMappingController {

    @GetMapping("test1/*/hello")
    public String getWildCardMapping1(){
        return " get WildCard Mapping1 invoked: )";
    }

    @GetMapping("test2/*/*")
    public String getWildCardMapping2(){
        return " get WildCard Mapping2 invoked: )";
    }

}

