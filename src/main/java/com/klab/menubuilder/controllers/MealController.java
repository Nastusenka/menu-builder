package com.klab.menubuilder.controllers;

import com.klab.menubuilder.models.Meal;
import com.klab.menubuilder.services.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/meals")
public class MealController {

    private MealService mealService;

    @Autowired
    public MealController(MealService mealService) {
        this.mealService = mealService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Meal> readMeals() {
        return mealService.getAll();
    }
}
