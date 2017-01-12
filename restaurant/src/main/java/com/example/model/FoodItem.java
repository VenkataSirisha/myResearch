package com.example.model;

public class FoodItem implements Comparable<FoodItem>{

	private Integer amountOfSatisfaction;
	
	private Integer timeToEat;	
		
	public FoodItem(Integer amountOfSatisfaction, Integer timeToEat) {
		super();
		this.amountOfSatisfaction = amountOfSatisfaction;
		this.timeToEat = timeToEat;		
	}

	public Integer getAmountOfSatisfaction() {
		return amountOfSatisfaction;
	}

	public void setAmountOfSatisfaction(Integer amountOfSatisfaction) {
		this.amountOfSatisfaction = amountOfSatisfaction;
	}

	public Integer getTimeToEat() {
		return timeToEat;
	}

	public void setTimeToEat(Integer timeToEat) {
		this.timeToEat = timeToEat;
	}
	
	@Override
	public int compareTo(FoodItem foodItem) {
		Integer currentSatisfactionFactor = this.amountOfSatisfaction / this.timeToEat;
		Integer nextSatisfactionFactor = foodItem.amountOfSatisfaction / foodItem.timeToEat;
		
		// The following checks help to order the food items in descending order of satisfaction factor
		if(currentSatisfactionFactor < nextSatisfactionFactor) return 1;
		if(currentSatisfactionFactor > nextSatisfactionFactor) return -1;
		
		return 0;
	}
}
