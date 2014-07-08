package Insanity;

public class MealComponent {
	private Component comp;
	private Measurement ratio;
	
	public MealComponent(Component comp, Measurement ratio){
		this.comp = comp;
		this.ratio = ratio;
	}
	
	public Component getComponent(){
		return comp;
	}
	
	public Measurement getRatio(){
		return ratio;
	}
}
