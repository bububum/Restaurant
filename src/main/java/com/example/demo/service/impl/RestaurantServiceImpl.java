package com.example.demo.service.impl;

import com.example.demo.model.entity.Restaurant;
import com.example.demo.repository.RestaurantRepository;
import com.example.demo.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RestaurantServiceImpl implements RestaurantService {


    private final RestaurantRepository repository;


    @Override
    public List<Restaurant> getAll() {
        return (List<Restaurant>) repository.findAll();
    }

    @Override
    public Restaurant getById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public void save(Restaurant restaurant) {
        repository.save(restaurant);
    }

    @Override
    public List<Restaurant> getByCapacity(int capacity) {
        return repository.findRestaurantByCapacity(capacity);
    }
}
