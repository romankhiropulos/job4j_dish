package ru.job4j.job4j_dish.service;

import org.springframework.stereotype.Service;
import ru.job4j.job4j_dish.model.Dish;
import ru.job4j.job4j_dish.repository.DishRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class DishSevice {
    private final DishRepository repository;

    public DishSevice(DishRepository repository) {
        this.repository = repository;
    }

    public void create(Dish dish) {
        repository.save(dish);
    }

    public void delete(Dish dish) {
        repository.delete(dish);
    }

    public List<Dish> getAll() {
        var result = new ArrayList<Dish>();
        for (var dish: repository.findAll()) {
            result.add(dish);
        }
        return result;
    }

    public Dish getById(int id) {
        return repository.findById(id).orElse(null);
    }
}
