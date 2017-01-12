package com.example.service;

import java.util.SortedSet;
import java.util.TreeSet;

import org.springframework.stereotype.Service;

import com.example.model.FoodItem;

@Service
public class RestaurantService {

	public int getMaxSatisfaction(int numberOfMinutes, SortedSet<FoodItem> foodItems) {
		int totalTime = 0;
		int totalSatisfaction = 0;
		for (FoodItem foodItem : foodItems) {
			if ((totalTime + foodItem.getTimeToEat()) < numberOfMinutes) {
				totalTime += foodItem.getTimeToEat();
				totalSatisfaction += foodItem.getAmountOfSatisfaction();
			}
		}
		System.out.println("Maximun satisfaction by eating in exactly " + totalTime + " minutes :: " + totalSatisfaction);
		
		return totalSatisfaction;
	}

	public SortedSet<FoodItem> readFoodItems() {
		SortedSet<FoodItem> foodItems = new TreeSet<FoodItem>();
		foodItems.add(new FoodItem(16808, 250));
		foodItems.add(new FoodItem(50074, 659));
		foodItems.add(new FoodItem(8931, 273));
		foodItems.add(new FoodItem(27545, 879));
		foodItems.add(new FoodItem(77924, 710));
		foodItems.add(new FoodItem(64441, 166));
		foodItems.add(new FoodItem(84493, 43));
		foodItems.add(new FoodItem(7988, 504));
		foodItems.add(new FoodItem(82328, 730));
		foodItems.add(new FoodItem(78841, 613));
		foodItems.add(new FoodItem(44304, 170));
		foodItems.add(new FoodItem(17710, 158));
		foodItems.add(new FoodItem(29561, 934));
		foodItems.add(new FoodItem(93100, 279));
		foodItems.add(new FoodItem(51817, 336));
		foodItems.add(new FoodItem(99098, 827));
		foodItems.add(new FoodItem(13513, 268));
		foodItems.add(new FoodItem(23811, 634));
		foodItems.add(new FoodItem(80980, 150));
		foodItems.add(new FoodItem(36580, 822));
		foodItems.add(new FoodItem(11968, 673));
		foodItems.add(new FoodItem(1394, 337));
		foodItems.add(new FoodItem(25486, 746));
		foodItems.add(new FoodItem(25229, 92));
		foodItems.add(new FoodItem(40195, 358));
		foodItems.add(new FoodItem(35002, 154));
		foodItems.add(new FoodItem(16709, 945));
		foodItems.add(new FoodItem(15669, 491));
		foodItems.add(new FoodItem(88125, 197));
		foodItems.add(new FoodItem(9531, 904));
		foodItems.add(new FoodItem(27723, 667));
		foodItems.add(new FoodItem(28550, 25));
		foodItems.add(new FoodItem(97802, 854));
		foodItems.add(new FoodItem(40978, 409));
		foodItems.add(new FoodItem(8229, 934));
		foodItems.add(new FoodItem(60299, 982));
		foodItems.add(new FoodItem(28636, 14));
		foodItems.add(new FoodItem(23866, 815));
		foodItems.add(new FoodItem(39064, 537));
		foodItems.add(new FoodItem(39426, 670));
		foodItems.add(new FoodItem(24116, 95));
		foodItems.add(new FoodItem(75630, 502));
		foodItems.add(new FoodItem(46518, 196));
		foodItems.add(new FoodItem(30106, 405));
		foodItems.add(new FoodItem(19452, 299));
		foodItems.add(new FoodItem(82189, 124));
		foodItems.add(new FoodItem(99506, 883));
		foodItems.add(new FoodItem(6753, 567));
		foodItems.add(new FoodItem(36717, 338));
		foodItems.add(new FoodItem(54439, 145));
		foodItems.add(new FoodItem(51502, 898));
		foodItems.add(new FoodItem(83872, 829));
		foodItems.add(new FoodItem(11138, 359));
		foodItems.add(new FoodItem(53178, 398));
		foodItems.add(new FoodItem(22295, 905));
		foodItems.add(new FoodItem(21610, 232));
		foodItems.add(new FoodItem(59746, 176));
		foodItems.add(new FoodItem(53636, 299));
		foodItems.add(new FoodItem(98143, 400));
		foodItems.add(new FoodItem(27969, 413));
		foodItems.add(new FoodItem(261, 558));
		foodItems.add(new FoodItem(41595, 9));
		foodItems.add(new FoodItem(16396, 969));
		foodItems.add(new FoodItem(19114, 531));
		foodItems.add(new FoodItem(71007, 963));
		foodItems.add(new FoodItem(97943, 366));
		foodItems.add(new FoodItem(42083, 853));
		foodItems.add(new FoodItem(30768, 822));
		foodItems.add(new FoodItem(85696, 713));
		foodItems.add(new FoodItem(73672, 902));
		foodItems.add(new FoodItem(48591, 832));
		foodItems.add(new FoodItem(14739, 58));
		foodItems.add(new FoodItem(31617, 791));
		foodItems.add(new FoodItem(55641, 680));
		foodItems.add(new FoodItem(37336, 7));
		foodItems.add(new FoodItem(97973, 99));
		foodItems.add(new FoodItem(49096, 320));
		foodItems.add(new FoodItem(83455, 224));
		foodItems.add(new FoodItem(12290, 761));
		foodItems.add(new FoodItem(48906, 127));
		foodItems.add(new FoodItem(36124, 507));
		foodItems.add(new FoodItem(45814, 771));
		foodItems.add(new FoodItem(35239, 95));
		foodItems.add(new FoodItem(96221, 845));
		foodItems.add(new FoodItem(12367, 535));
		foodItems.add(new FoodItem(25227, 395));
		foodItems.add(new FoodItem(41364, 739));
		foodItems.add(new FoodItem(7845, 591));
		foodItems.add(new FoodItem(36551, 160));
		foodItems.add(new FoodItem(8624, 948));
		foodItems.add(new FoodItem(97386, 218));
		foodItems.add(new FoodItem(95273, 540));
		foodItems.add(new FoodItem(99248, 386));
		foodItems.add(new FoodItem(13497, 886));
		foodItems.add(new FoodItem(40624, 421));
		foodItems.add(new FoodItem(28145, 969));
		foodItems.add(new FoodItem(35736, 916));
		foodItems.add(new FoodItem(61626, 535));
		foodItems.add(new FoodItem(46043, 12));
		foodItems.add(new FoodItem(54680, 153));

		return foodItems;
	}
}
