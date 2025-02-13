package lk.ijse.z13_spring_boot.controller;

import lk.ijse.z13_spring_boot.dto.CustomerDTO;
import lk.ijse.z13_spring_boot.service.CustomerSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
    @GetMapping("get")
    public String getCustomer(){
        return "Hello World";
    }
    @Autowired
    private CustomerSevice customerSevice;

    @PostMapping("save")
    public boolean saveCustomer(@RequestBody CustomerDTO customerDTO){
//        System.out.println(customerDTO.getName());
//        return customerDTO.toString();
        customerSevice.addCustomer(customerDTO);
        return true;
    }

}

