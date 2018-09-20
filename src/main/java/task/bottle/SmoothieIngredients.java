package task.bottle;

/**
 * This is an abstract class which implements the interface SmoothieBottle,
 * so that it has access to all the methods which the PlainSmoothie concrete class has access to. 
 * @author nikhil
 *
 */
abstract class SmoothieIngredients implements SmoothieBottle{
	
	// It is going to have a reference to the PlainSmoothie class.
	protected SmoothieBottle tempSmoothie;
	
	/* This is the constructor which is going to be passed the reference to the 
	 * PlainSmoothie object that is going to be created.
	 */
	public SmoothieIngredients(SmoothieBottle newSmoothie) {
		tempSmoothie = newSmoothie;
	}
	 
	// We call the description on the tempSmoothie.
	public String getDescription() {
		return tempSmoothie.getDescription();
	}
	
	// We call the cost on the tempSmoothie.
	public double getCost(){
		return tempSmoothie.getCost();
	}
	
	// We call the calories on the tempSmoothie.
	public double getCalories(){
		return tempSmoothie.getCalories();
	}
}
