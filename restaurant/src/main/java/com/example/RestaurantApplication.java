package com.example;

import java.util.SortedSet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.model.FoodItem;
import com.example.service.RestaurantService;

@SpringBootApplication
public class RestaurantApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(RestaurantApplication.class, args);
		
		RestaurantService restaurantService = ctx.getBean(RestaurantService.class);
		
		int numberOfMinutes = 10000;
		SortedSet<FoodItem> foodItems = restaurantService.readFoodItems();
        int maxSatisfaction = restaurantService.getMaxSatisfaction(numberOfMinutes, foodItems);
        System.out.println("Maximun satisfaction by eating in approximately "
        						+ numberOfMinutes + " minutes :: "
        						+ maxSatisfaction);
	}
}
