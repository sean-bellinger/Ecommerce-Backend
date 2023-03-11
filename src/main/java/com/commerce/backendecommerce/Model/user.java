package com.commerce.backendecommerce.Model;
import java.io.Serializable;
import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class user implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String createdat;

    @OneToMany(/*mappedBy = "postId",*/ cascade = CascadeType.ALL, fetch =
            FetchType.EAGER)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private List<shoppingsession> shoppingsessions;
}