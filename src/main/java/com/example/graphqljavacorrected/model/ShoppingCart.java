package com.example.graphqljavacorrected.model;

import com.example.graphqljavacorrected.model.enums.ShoppingCartStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;
@Data
@Entity
public class ShoppingCart {

    @Id
    @GeneratedValue
    private Long id;
    @OneToMany
    private List<Product> products;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dateCreated;

    @Enumerated(EnumType.STRING)
    private ShoppingCartStatus shoppingCartStatus;
}
