package com.example.demo.service;

import com.example.demo.model.entity.Restaurant;

import java.util.List;

public interface RestaurantService {

    List<Restaurant> getAll();
    Restaurant getById(Long id);
    void save(Restaurant restaurant);

    List<Restaurant> getByCapacity(int capacity);
}
