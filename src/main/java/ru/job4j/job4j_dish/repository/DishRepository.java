package ru.job4j.job4j_dish.repository;

import org.springframework.data.repository.CrudRepository;
import ru.job4j.job4j_dish.model.Dish;

public interface DishRepository extends CrudRepository<Dish, Integer> {
}
