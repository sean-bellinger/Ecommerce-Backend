package com.commerce.backendecommerce.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commerce.backendecommerce.Model.Customer;
import com.commerce.backendecommerce.Repository.CustomerRepo;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo customerRepo;

    public void registerCustomer(Customer customer){
        customerRepo.save(customer);
    }
}
