package lk.ijse.z13_spring_boot.service;

import lk.ijse.z13_spring_boot.dto.CustomerDTO;
import lk.ijse.z13_spring_boot.entity.Customer;
import lk.ijse.z13_spring_boot.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerSevice {

    @Autowired
    private CustomerRepo customerRepo;

    public boolean addCustomer(CustomerDTO customerDTO ){
       /* System.out.println("Service method" + customerDTO.getAddress());
        return true;*/
        if (customerRepo.existsById(customerDTO.getId())){
            return false;  // ID already exists
        }
        Customer customer = new Customer(
                customerDTO.getId(),
                customerDTO.getName(),
                customerDTO.getAddress()
        );
        customerRepo.save(customer);
        return true;
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

