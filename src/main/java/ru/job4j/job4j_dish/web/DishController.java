package ru.job4j.job4j_dish.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.job4j.job4j_dish.model.Dish;
import ru.job4j.job4j_dish.service.DishOrderService;
import ru.job4j.job4j_dish.service.DishSevice;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/dish")
public class DishController {

    private final DishSevice service;
    private final DishOrderService dishOrderService;

    @GetMapping("/{id}")
    public Dish getDishById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @GetMapping("/order/{id}")
    public Dish getDishByOrderId(@PathVariable Integer id) {
        if (dishOrderService.getByOrderId(id).isEmpty()) {
            return null;
        }
        return service.getById(dishOrderService.getByOrderId(id).get().getDishId());
    }

    @GetMapping("/")
    public List<Dish> getAll() {
        return service.getAll();
    }

    @PostMapping("/delete")
    public void deleteDish(@RequestBody Dish dish) {
        service.delete(dish);
    }

    @PostMapping("/add")
    public void addDish(@RequestBody Dish dish) {
        service.create(dish);
    }

    @PostMapping("/order/{orderId}/{dishId}")
    public void saveOrderDish(@PathVariable Integer orderId, @PathVariable Integer dishId) {
        dishOrderService.save(orderId, dishId);
    }
}
