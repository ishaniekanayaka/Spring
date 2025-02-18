package lk.ijse.z13_spring_boot.controller;

import lk.ijse.z13_spring_boot.dto.CustomerDTO;
import lk.ijse.z13_spring_boot.service.CustomerSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    @Autowired
    private CustomerSevice customerSevice;


    @PostMapping("save")
    public boolean saveCustomer(@RequestBody CustomerDTO customerDTO){
        customerSevice.addCustomer(customerDTO);
        return true;
    }

    @PutMapping("update")
    public boolean updateCustomer(@RequestBody CustomerDTO customerDTO){
        customerSevice.updateCustomer(customerDTO);
        return true;
    }

    @GetMapping("getAll")
    public List<CustomerDTO> getAllCustomers() {
        return customerSevice.getAllCustomers();
    }

    @DeleteMapping("delete/{id}")
    public boolean deleteCustomer(@PathVariable("id") int id) {
        customerSevice.deleteCustomer(id);
        return true;
    }
}

