package day4.workshop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		Main main = new Main();
		main.first();
		main.second();
		
	}

	private void second() {
		List<Dish> menus = getAllMenus();
		List<String> lowCaloriesDishNames = menus.stream()
			.filter(dish -> dish.getCalories() < 400)
			.sorted(Comparator.comparing(Dish::getCalories))
			.map(Dish::getName)
			.collect(Collectors.toList());
		lowCaloriesDishNames.forEach(System.out::println);
	}

	private void first() {
		List<Dish> menus = getAllMenus();
		// Filter low calories < 400
		List<Dish> lowCalories400 = new ArrayList<>();
		for (Dish dish : menus) {
			if(dish.getCalories() < 400) {
				lowCalories400.add(dish);
			}
		}
	
		// Sorting by calories (min to max)
		Collections.sort(lowCalories400, new Comparator<Dish>() {

			@Override
			public int compare(Dish o1, Dish o2) {
				return Integer.compare(o1.getCalories(), o2.getCalories());
			}
		});
		lowCalories400.forEach(System.out::println);

		// Show only name of disk
		List<String> lowCaloriesDishNames = new ArrayList<>();
		for (Dish dish : lowCalories400) {
			lowCaloriesDishNames.add(dish.getName());
		}
		lowCaloriesDishNames.forEach(System.out::println);
		
	}
	
	private List<Dish> getAllMenus() {
		List<Dish> menus = new ArrayList<>();
		menus.add(new Dish(1, "Rice", 200));
		menus.add(new Dish(2, "Fat", 2000));
		menus.add(new Dish(3, "Milk", 100));
		return menus;
	}

}

class Dish {
	private int id;
	private String name;
	private int calories;
	
	@Override
	public String toString() {
		return "Dish [id=" + id + ", name=" + name + ", calories=" + calories + "]";
	}
	public Dish(int id, String name, int calories) {
		this.id = id;
		this.name = name;
		this.calories = calories;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	
	
}
