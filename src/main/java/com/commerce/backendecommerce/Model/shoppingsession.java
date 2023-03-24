package com.commerce.backendecommerce.Model;
import java.io.Serializable;
import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "shoppingsession")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShoppingSession implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, name = "user_id")
    private Long userId;

    @Column(nullable = false)
    private String total;

    @Column(nullable = false)
    private String createdat;

    @OneToMany(cascade = CascadeType.ALL, fetch =FetchType.LAZY)
    @JoinColumn(name = "sessionid", referencedColumnName = "id")
    private List<CartItem> cartitems;
}