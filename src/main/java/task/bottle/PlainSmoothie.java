package task.bottle;
/*
 * This is the concrete class which implements the SmoothieBottle interface.
 * We are going to add individual smoothie ingredient to this class.
 * 
 */
public class PlainSmoothie implements SmoothieBottle {
	// This description is common to all the different types of smoothie generated. 
	public String getDescription() {
		return "Know what's in your smoothie!!!\n";
	}
	// Basic cost of a simple smoothie bottle.
	public double getCost() {
		return 0.50;
	}
	// It is an empty bottle, hence the calorie count is 0.
	public double getCalories() {
		return 0;
	}

}
