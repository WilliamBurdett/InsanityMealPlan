package Insanity;

import java.util.ArrayList;

public class Meal {
	private ArrayList<MealComponent> components;
	private String name;
	
	public Meal(String name){
		this.name = name;
		components = new ArrayList<MealComponent>();
	}
	
	public boolean addMealComponent(MealComponent comp){
		return components.add(comp);
	}
}
