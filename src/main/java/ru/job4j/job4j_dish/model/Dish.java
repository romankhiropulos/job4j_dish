package ru.job4j.job4j_dish.model;

import lombok.*;
import org.springframework.data.relational.core.mapping.Table;

import jakarta.persistence.*;

@Data
@Entity
@Table(name = "dish")
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
}
