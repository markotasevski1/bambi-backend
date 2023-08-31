package com.example.graphqljavacorrected.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    private Double price;
    private Integer quantity;
    @ManyToMany
    private List<Category> categories;
}
