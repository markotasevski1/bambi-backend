package com.example.graphqljavacorrected.model;

import com.example.graphqljavacorrected.model.enums.OrderStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
@Data
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dateCreated;
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;
    @OneToOne
    private ShoppingCart shoppingCart;

    @OneToOne
    private UserInformation orderLocation;
}
