package lk.ijse.controller;


import lk.ijse.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

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
   /* @PostMapping
    public String test1(@RequestParam("name") String name,@RequestParam("address") String address){
        return "Hello Form Data.........: )"+ name +" "+ address;
    }
*/
    //dan karanna hadann req eken ena data kelinma object ekakata allaganna-> ekata CustomerDto eka hadagannwa

    @PostMapping
    public String test2(@RequestParam("firstName") String firstName,@RequestParam("lastName") String lastname,@RequestParam("age") Integer age){
        return "Hello Form Data.........: )"+ firstName+" "+ lastname+" "+age;
    }

    @PostMapping(path = "test2")
    public String test3(@ModelAttribute  CustomerDTO customerDTO){
        return customerDTO.toString();
    }

}
