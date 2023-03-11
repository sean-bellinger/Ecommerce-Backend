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
public class cartitem implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String session_id;

    @Column(nullable = false)
    private String product_id;

    @Column(nullable = false)
    private String quantity;

    @Column(nullable = false)
    private String createdat;
}