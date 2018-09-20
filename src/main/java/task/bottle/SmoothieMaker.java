package task.bottle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class creates the smoothie.
 * It asks the user to give input based on the list of ingredients supported by the application.
 * And displays the end result with the disription, cost and calorie content of the smoothie in the bottle.
 * 
 */
public class SmoothieMaker
{
    public static void main( String[] args ) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException
    {   
        try {
        	// Introduction display of the Smoothie Maker.
        	System.out.println("Your 500 ml of personalised smoothie awaits you");
        	System.out.println("===============================================");
        	System.out.println("Please enter your desired ingredients from the list below");
        	System.out.println("=========================================================");
        	// Getting the ingredients available currently.
        	GetIngredient<Object> getIngredients = new GetIngredient<Object>();
        	ArrayList<String> ingredients = getIngredients.getSmoothieList();
        	for(int i=0;i<ingredients.size();i++){
        	    System.out.print((i+1)+"."+ingredients.get(i)+ " ");
        	    if(i!=0 && i%5==0) {
        	    	// Display it to the user.
        	    	System.out.println();
        	    }
        	}
        	System.out.println();
        	Scanner in = new Scanner(System.in);
        	int[] vars = new int[5];
        	// Scanning input from the user.
        	System.out.println("Enter "+vars.length+" choices: ");
        	for(int i = 0; i < vars.length; i++)
        	  vars[i] = in.nextInt();
        	in.close();
        	
        	
        	/*
        	 * Here we are implementing the static implementation of the lines shown below, dynamically.
        	 * SmoothieBottle makeAsmoothieb =   new Apple(new Banana(new PlainSmoothie()));
        	 * The PlainSmoothie object is sent to the Banana constructor and then to the Mango Constructor.
        	 * Each of which will add to the description, cost and calorie content.
        	 * The dynamic implementation is done using dynamic class loading using Java reflection.
        	 */
        	String clsPth = "task.bottle.";
            SmoothieBottle makeAsmoothie =  (SmoothieBottle) getConstruct(clsPth+ingredients.get(vars[0] - 1))
            				.newInstance(
            						getConstruct(clsPth+ingredients.get(vars[1] - 1)).
            						newInstance(
            								getConstruct(clsPth+ingredients.get(vars[2] - 1)).
            								newInstance(
            										getConstruct(clsPth+ingredients.get(vars[3] - 1)).
            										newInstance(
            												getConstruct(clsPth+ingredients.get(vars[4] - 1)).
                    										newInstance(new PlainSmoothie())))));
            // Provides the final output with the ingredient description, the total calorie content and the total cost.
            System.out.println(makeAsmoothie.getDescription());
        	System.out.println("Total Calories: " + makeAsmoothie.getCalories());
        	System.out.println("Total Cost: " + makeAsmoothie.getCost()+ " Euro");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    	/*
    	 * This method is used to get the constructor of a class based on the string value of the class name.
    	 * It returns a constructor object of the specified class.
    	 * This is done in order to perform dynamic class loading of classes with an argument.
    	 */
        public static Constructor<?> getConstruct(String clsName) throws ClassNotFoundException, NoSuchMethodException, SecurityException {
        	Class<?> cl = Class.forName(clsName);
        	Constructor<?> cons = cl.getConstructor(SmoothieBottle.class);
    		return cons;
        	
        }

    }
    
  
