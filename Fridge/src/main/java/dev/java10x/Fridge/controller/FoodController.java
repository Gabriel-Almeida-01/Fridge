package dev.java10x.Fridge.controller;


import dev.java10x.Fridge.model.Food;
import dev.java10x.Fridge.service.FoodService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {

    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping
    public List<Food> ListAll() {
        return foodService.getAll();
    }

    @PostMapping
    public Food create(@RequestBody Food food) {
        return foodService.save(food);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        foodService.deleteById(id);
    }
}
