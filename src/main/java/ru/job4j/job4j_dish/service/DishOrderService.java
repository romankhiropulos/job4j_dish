package ru.job4j.job4j_dish.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.job4j.job4j_dish.model.DishOrder;
import ru.job4j.job4j_dish.repository.DishOrderRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DishOrderService {
    private final DishOrderRepository dishOrderRepository;

    public void save(Integer orderId, Integer dishId) {
        dishOrderRepository.save(new DishOrder(orderId, dishId));
    }

    public Optional<DishOrder> getByOrderId(Integer orderid) {
        return dishOrderRepository.findById(orderid);
    }
}
