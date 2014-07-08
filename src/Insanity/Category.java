package Insanity;

import java.util.ArrayList;

public class Category {
	private String name;
	private ArrayList<Component> similarC;
	
	public Category(String name){
		this.name = name;
		similarC = new ArrayList<Component>();
	}
	
	public boolean addComponent(Component comp){
		return similarC.add(comp);
	}
	
	public String getName(){
		return name;
	}
}
