package com.duing.controller;

import com.duing.config.FoodConfig;
import com.duing.doamin.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodController {
    @Autowired
    private FoodConfig foodConfig;

    @RequestMapping("json")
    public Food json (){
        Food food = new Food();
        food.setMeat(foodConfig.getMeat());
        food.setRice(foodConfig.getRice());
        return food;
    }


}
