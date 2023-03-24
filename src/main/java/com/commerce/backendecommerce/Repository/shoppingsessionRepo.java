package com.commerce.backendecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.commerce.backendecommerce.Model.ShoppingSession;

@Repository
public interface ShoppingSessionRepo extends JpaRepository<ShoppingSession, Integer>{
    ShoppingSession findAllShoppingSessionByUserId(Integer userId);
}
