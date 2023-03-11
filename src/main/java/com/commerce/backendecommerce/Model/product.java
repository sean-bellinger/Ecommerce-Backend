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
public class product implements Serializable{
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

    @OneToMany(/*mappedBy = "postId",*/ cascade = CascadeType.ALL, fetch =
            FetchType.EAGER)
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private List<cartitem> cartitems;
}