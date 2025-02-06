package lk.ijse.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("form")
public class FormDataController {

    //id-1
    //name-ishni
    //address - Matara


   // http://localhost:8080/09_Rest_Controller_Web_exploded/form?id=22
  /*  @GetMapping
    public String test1(@RequestParam("id") String id){
        return "Hello Form Data.........: )"+ id;
    }*/

    //http://localhost:8080/09_Rest_Controller_Web_exploded/form?name=Ishani&address=Matara
    @GetMapping
    public String test2(@RequestParam("name") String name,@RequestParam("address") String address){
        return "Hello Form Data.........: )"+ name +" "+ address;
    }

    //dan karanna hadann req eken ena data kelinma object ekakata allaganna-> ekata CustomerDto eka hadagannwa


}
