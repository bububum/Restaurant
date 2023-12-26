package com.example.demo.controller;

import com.example.demo.model.entity.Restaurant;
import com.example.demo.service.RestaurantService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/restaurant")
@RequiredArgsConstructor
public class RestaurantController {



    private final RestaurantService service;

    @GetMapping
    @Tag(name = "GetAll", description = "Метод на полный список")
    public List<Restaurant> getAll() {
        return service.getAll();
    }

    @PostMapping
    @Tag(name = "Save", description = "Метод сохранения")
    public void save(@RequestBody Restaurant restaurant) {
        service.save(restaurant);
    }

    @GetMapping("/id")
    @Tag(name = "GetById", description = "Метод поиска по id")
    public Restaurant getById(@RequestParam Long id) {
        return service.getById(id);
    }


    @GetMapping("/by-capacity")
    @Tag(name = "GetByCapacity", description = "Метод поиска по capacity")
    public ResponseEntity<?> getByCapacity(@RequestParam int capacity) {
        return ResponseEntity.ok(service.getByCapacity(capacity));
    }
}
