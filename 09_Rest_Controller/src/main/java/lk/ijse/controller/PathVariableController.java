package lk.ijse.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("variable")


public class PathVariableController {
    //   http://localhost:8080/09_Rest_Controller_Web_exploded/variable/  meke pitipassatama value add karana eka path variable

   /* @GetMapping(path = "{id}")
    public String test1(@PathVariable("id") String id){
        return "Hello path Variable!!! "+id; //api dena oni value ekak enaawa value nathuw ayawwoth not found
    }*/

    /*@GetMapping(path = "{id}/{name}")
    public String test1(@PathVariable("id") String id  , @PathVariable("name") String name){
        return "Hello path Variable!!! "+id + name; Hello ath Variable!!! Ishaniakila
    }*/


    @GetMapping(path = "{id:[A][0-9]{3}}") //mulata A iallkm 3k samaka
    public String test1(@PathVariable("id") String id ){
        return "Hello path Variable!!! "+id ; //Hello ath Variable!!! A001
    }
}
