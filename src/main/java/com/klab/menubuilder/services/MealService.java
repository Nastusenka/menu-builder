package com.klab.menubuilder.services;

import com.klab.menubuilder.models.Meal;
import com.klab.menubuilder.repositories.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealService {

    private final MealRepository mealRepository;

    @Autowired
    public MealService(MealRepository mealRepository) {
        this.mealRepository = mealRepository;
    }

    public List<Meal> getAll() {
        return mealRepository.findAll();
    }

    public Meal getById(Long id) {
        return mealRepository.findOne(id);
    }

    public Meal create(Meal meal) {
        return mealRepository.saveAndFlush(meal);
    }
}
