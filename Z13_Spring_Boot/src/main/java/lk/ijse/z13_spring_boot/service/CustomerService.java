package lk.ijse.z13_spring_boot.service;

import lk.ijse.z13_spring_boot.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {

    public String addCustomer(CustomerDTO customerDTO);

    public void updateCustomer(CustomerDTO customerDTO);

    public List<CustomerDTO> getAllCustomers();

    public void deleteCustomer(int id);
}
