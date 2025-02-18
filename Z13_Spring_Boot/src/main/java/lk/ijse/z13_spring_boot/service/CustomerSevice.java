package lk.ijse.z13_spring_boot.service;

import lk.ijse.z13_spring_boot.dto.CustomerDTO;
import lk.ijse.z13_spring_boot.entity.Customer;
import lk.ijse.z13_spring_boot.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerSevice {

    @Autowired
    private CustomerRepo customerRepo;

   /* public String addCustomer(CustomerDTO customerDTO) {
        if (customerRepo.existsById(customerDTO.getId())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Duplicate ID: Customer already exists :(");
        }
        Customer customer = new Customer(
                customerDTO.getId(),
                customerDTO.getName(),
                customerDTO.getAddress()
        );
        customerRepo.save(customer);
        return "Customer saved successfully :)";
    }*/

    public String addCustomer(CustomerDTO customerDTO) {
        if (customerRepo.existsById(customerDTO.getId())) {
            return " Customer already exists :(";
        }

        Customer customer = new Customer(
                customerDTO.getId(),
                customerDTO.getName(),
                customerDTO.getAddress()
        );
        customerRepo.save(customer);

        return "Customer saved successfully :)";
    }


    public void updateCustomer(CustomerDTO customerDTO) {
        Customer customer = customerRepo.findById(customerDTO.getId()).orElse(null);
        if (customer != null){
            customer.setName(customerDTO.getName());
            customer.setAddress(customerDTO.getAddress());
            customerRepo.save(customer);
        }
    }


    public List<CustomerDTO> getAllCustomers() {
        List<Customer> customers = customerRepo.findAll();
        return customers.stream().map(customer -> new CustomerDTO(
                customer.getId(), customer.getName(), customer.getAddress()
        )).collect(Collectors.toList());
    }

    public void deleteCustomer(int id) {
        customerRepo.deleteById(id);
    }
}

