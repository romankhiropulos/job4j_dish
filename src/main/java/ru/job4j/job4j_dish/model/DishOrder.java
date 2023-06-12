package ru.job4j.job4j_dish.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "dish_order")
public class DishOrder {
    @Id
    @Column(name = "order_id")
    private Integer orderId;
    @Column(name = "dish_id")
    private Integer dishId;
}
