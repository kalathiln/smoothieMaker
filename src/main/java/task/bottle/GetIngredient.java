package task.bottle;

import java.util.ArrayList;
/**
 * In this class we can add ingredients into the Arraylist.
 * getSMoothieList() gives the details of all the smoothie ingredient classes that our app supports.
 * We can increase or decrese our list here based on requirement, 
 * hence making it scalable while not effecting other parts.
 * 
 * @author nikhil
 * 
 * @param <E> Contains the name of the ingredient.
 * returns an Arraylist of all the ingredients supported by our app.
 */
public class GetIngredient<E> {
	
	/* Add or remove ingredients here.
	 * Once you add an ingredient here, makre sure to provide an implementation of it,
	 * with the same name as the value provided to the arraylist.  
	 */
	public ArrayList<String> getSmoothieList(){
		ArrayList<String> ingredient = new ArrayList<String>();
		ingredient.add("Banana");
		ingredient.add("Mango");
		ingredient.add("Apple");
		ingredient.add("Orange");
		ingredient.add("Carrot");
		ingredient.add("Celary");
		ingredient.add("GrapeFruit");
		ingredient.add("Water");
		ingredient.add("PineApple");
		ingredient.add("Milk");
		ingredient.add("ChocoMilk");
		ingredient.add("Yogurt");
		ingredient.add("Strawberry");
		return ingredient;
		
	}
}
