package com.commerce.backendecommerce.Model;
import java.io.Serializable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cartitem")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartItem implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "session_id")
    private Long sessionId;

    @Column(nullable = false, name = "product_id")
    private Long productId;

    @Column(nullable = false)
    private String quantity;

    @Column(nullable = false)
    private String createdat;
}