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


    /*@PostMapping("save")
    public String  saveCustomer(@RequestBody CustomerDTO customerDTO){
        customerSevice.addCustomer(customerDTO);
        return "Customer saved successfully :)";
    }
*/
    @PostMapping("save")
    public String saveCustomer(@RequestBody CustomerDTO customerDTO) {
        String result = customerSevice.addCustomer(customerDTO);
        return result;
    }


    @PutMapping("update")
    public String updateCustomer(@RequestBody CustomerDTO customerDTO){
        customerSevice.updateCustomer(customerDTO);
        return "Customer updated Successfully :)";
    }

    @GetMapping("getAll")
    public List<CustomerDTO> getAllCustomers() {
        return customerSevice.getAllCustomers();
    }

    @DeleteMapping("delete/{id}")
    public String deleteCustomer(@PathVariable("id") int id) {
        customerSevice.deleteCustomer(id);
        return "Customer deleted successfully :)";
    }
}

