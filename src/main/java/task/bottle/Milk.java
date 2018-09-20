package task.bottle;

/**
 * This class acts as an individual decorator(in our case ingredient).
 * In this instance the constructor will refer to the SmoothIngredient as the super class.
 * It calls back to the SmoothieIngredient to get the method implementations namely
 *  getDescription(), getCost() and getCalories(), and add its own individual values.
 * @author nikhil
 *
 */
public class Milk extends SmoothieIngredients{
	public Milk(SmoothieBottle newSmoothie) {
		super(newSmoothie);

	}
	
	public String getDescription() {
		return tempSmoothie.getDescription() + " 100 ml Milk \n";
	}
	
	public double getCost(){
		return tempSmoothie.getCost() + 0.50;
	}
	
	public double getCalories(){
		return tempSmoothie.getCalories() + 65;
	}
}
