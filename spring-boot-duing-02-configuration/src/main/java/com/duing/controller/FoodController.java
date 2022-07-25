package com.duing.controller;

import com.duing.domain.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodController {

    @Value("${food.rice}")
    private String rice;
    @Value("${food.meat}")
    private String meat;

    @RequestMapping(value = "json")
    public Food json(){
        Food food = new Food();
        food.setMeat(meat);
        food.setRice(rice);
        System.out.println(rice);
        return food;
    }



}
