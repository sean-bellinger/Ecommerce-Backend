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
public class shoppingsession implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String user_id;

    @Column(nullable = false)
    private String total;

    @Column(nullable = false)
    private String created_at;

    @OneToMany(/*mappedBy = "postId",*/ cascade = CascadeType.ALL, fetch =
            FetchType.EAGER)
    @JoinColumn(name = "session_id", referencedColumnName = "id")
    private List<cartitem> cartitems;
}