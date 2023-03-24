package com.commerce.backendecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.commerce.backendecommerce.Model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>{
    Customer findByEmailAndPassword(String email, String password);
}