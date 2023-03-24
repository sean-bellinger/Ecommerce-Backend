package com.commerce.backendecommerce.Model;
import java.io.Serializable;
import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "product")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String price;

    @Column(nullable = false)
    private String createdat;

    @OneToMany(cascade = CascadeType.ALL, fetch =FetchType.LAZY)
    @JoinColumn(name = "productid", referencedColumnName = "id")
    private List<CartItem> cartitems;
}