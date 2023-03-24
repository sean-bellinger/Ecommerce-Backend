package com.commerce.backendecommerce.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.commerce.backendecommerce.Model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{
    List<Product> findAll();
}
