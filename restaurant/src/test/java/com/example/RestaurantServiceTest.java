package com.example;

import static org.junit.Assert.assertEquals;

import java.util.SortedSet;
import java.util.TreeSet;

import org.junit.Test;

import com.example.model.FoodItem;
import com.example.service.RestaurantService;

public class RestaurantServiceTest {

	RestaurantService restaurantService = new RestaurantService();
	
	@Test
	public void getMaxSatisfactionReturnsZeroWhenNumberOfMinutesInputIsZero() {
		int numberOfMinutes = 0;
		
		assertEquals(0, restaurantService.getMaxSatisfaction(numberOfMinutes, new TreeSet<FoodItem>()));
	}
	
	@Test
	public void getMaxSatisfactionReturnsMaximumSatisfactionValueWhenNumberOfMinutesInputIsValidNumber() {
		int numberOfMinutes = 100;
		SortedSet<FoodItem> foodItems = new TreeSet<FoodItem>();
		foodItems.add(new FoodItem(126, 43));
		foodItems.add(new FoodItem(60, 12));
		foodItems.add(new FoodItem(90, 90));		
		foodItems.add(new FoodItem(56, 14));
		foodItems.add(new FoodItem(50, 25));
		
		
		/*
		 * Since we added the food items to a sorted set which is sorted by satisfaction factor i.e (amountOfSatisfaction/timeToEat),
		 * the order of items would be
		 * foodItems.add(new FoodItem(60, 12));
		 * foodItems.add(new FoodItem(56, 14));
		 * foodItems.add(new FoodItem(126, 43));
		 * foodItems.add(new FoodItem(50, 25));
		 * foodItems.add(new FoodItem(90, 90));
		 * 
		 * So the expected output would be 60(12) + 56(14) + 126(43) + 50(25) = 242(94)
		 */
		assertEquals(242, restaurantService.getMaxSatisfaction(numberOfMinutes, foodItems));
	}

}
