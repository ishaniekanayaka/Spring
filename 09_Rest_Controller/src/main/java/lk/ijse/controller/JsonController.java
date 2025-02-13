package lk.ijse.controller;

import lk.ijse.dto.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("json")
public class JsonController {


    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String test1(@RequestBody CustomerDTO customerDTO) {
        return customerDTO.toString();
    }

    @GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDTO test3(){
        return new CustomerDTO("Ishani","Ekanayake",45);
    }

    /*Meken karanne arraylist ekak hadala json haraha get ekak gahana eka*/
    @GetMapping(path = "getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<CustomerDTO> test2(){
        ArrayList<CustomerDTO> result = new ArrayList<>();
        result.add(new CustomerDTO("Ishu", "kks", 25));
        result.add(new CustomerDTO("Akii", "Mark", 25));
        return result;
    }
}

