/*
 * Student Name: JingYi Li
 * Lab Professor: Islam Gomaa
 * Due Date: Nov 12
 * Description: This is a superclass for all millers.
 */
package polymorphism;


/**
 * THIS IS SUPERCLASS NAMED Millers.
 * Each miller has a name and a method for computing the bi-weekly pay.
 * @author jayalee
 */
public class Millers {
	private String name;

/**
   Constructs a miller with an empty name.
*/
public Millers() {
   name = "";
}

/**
   Sets the name of this miller.
   @param millerName the new name 
*/
public void setName(String millerName) {
   name = millerName;
}

/**
   Gets the name of this miller.
   @return the name 
*/
public String getName() {
   return name; 
}

/**
   This portion of code computes the bi-weekly pay of work done by the miller.
   @param hoursWorked the number of hours worked bi-weekly
   @return the pay for the given number of hours
*/
public double biWeeklyPay(int hoursWorked) {
   return 0; 
}
}

