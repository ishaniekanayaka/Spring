package lk.ijse.z13_spring_boot.service;

import lk.ijse.z13_spring_boot.dto.CustomerDTO;
import lk.ijse.z13_spring_boot.entity.Customer;
import lk.ijse.z13_spring_boot.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerSevice {

    @Autowired
    private CustomerRepo customerRepo;

    public boolean addCustomer(CustomerDTO customerDTO ){
       /* System.out.println("Service method" + customerDTO.getAddress());
        return true;*/
        Customer customer = new Customer(
                customerDTO.getId(),
                customerDTO.getName(),
                customerDTO.getAddress()
        );
        customerRepo.save(customer);
        return true;
    }
}
