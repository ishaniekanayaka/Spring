package lk.ijse.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("params")
public class ParamsController {

   /* @GetMapping(params = {"id"})
    public String test1(@RequestParam String id){
        return "Hello Params id: " + id;
    }*/
    //eke error ekak enw eka sold out karanne------->


   //   http://localhost:8080/09_Rest_Controller_Web_exploded/params?id=15
    @GetMapping(params = {"id"})
    public String test1(@RequestParam("id") String id){
        return "Hello Params id: " + id;
    }

    //http://localhost:8080/09_Rest_Controller_Web_exploded/params?id=15&name=isha
    @GetMapping(params = {"id", "name"})
    public String test1(@RequestParam("id") String id, @RequestParam("name") String name){
        return "Hello Params id: " + id+" name: " + name;
    }

    //http://localhost:8080/09_Rest_Controller_Web_exploded/params/new?id=123&name=ishani
    @GetMapping(path = "new", params={"id", "name"})
    public String  test3(@RequestParam("id") String id, @RequestParam("name") String name){
        return "Hello Params id: " + id+" name: " + name;
    }

}

