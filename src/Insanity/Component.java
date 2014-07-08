package Insanity;

public class Component {
	private String name;
	private Measurement amount;
	private Category category;
	
	public Component(String name, Measurement amount, Category category){
		this.name = name;
		this.amount = amount;
		this.category = category;
	}
	
	public String getName(){
		return name;
	}
	
	public Measurement getWeight(){
		return amount;
	}
	
	public Category getCategory(){
		return category;
	}
}
