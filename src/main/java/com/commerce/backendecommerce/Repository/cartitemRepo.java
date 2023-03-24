package com.commerce.backendecommerce.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.commerce.backendecommerce.Model.CartItem;

@Repository
public interface CartItemRepo extends JpaRepository<CartItem, Integer>{
    List<CartItem> findAllCartItemsBySessionId(CartItem cartItem);
}