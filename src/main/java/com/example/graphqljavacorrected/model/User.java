package com.example.graphqljavacorrected.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String lastName;
    private String email;

    @Enumerated(value = EnumType.STRING)
    private Role role;

    @OneToMany
    private List<UserInformation> userLocation;
    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<ShoppingCart> carts;


}
