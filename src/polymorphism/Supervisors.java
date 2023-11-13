/*
 * Student Name: JingYi Li
 * Lab Professor: Islam Gomaa
 * Due Date: Nov 12
 * Description: This is a subclass of Employees for supervisors that are paid for every hour worked.
 */
package polymorphism;

/**
 * This code should contain your Supervisor class declaration, constructor and method. 
 * A Supervisor is an employee who also receives a bonus. 
 * You must implement the bi-weekly pay for the employee according to instructions provided.
 * @author jayalee
 */

public class Supervisors extends Employees {
	private double biWeeklyBonus;

/**
   @param name the name of this employee
   @param pay the annual pay
   @param bonus the bi-weekly bonus
 */
	
	public Supervisors(String name, double pay, double bonus) {
		super(name, pay);
		biWeeklyBonus = bonus;
	}
	
	
	/**
	 * Gets the bi-weekly bonus of Supervisors.
	 * @return the bi-weekly bonus
	 */
	public double getBiWeeklyBonus() {
	return biWeeklyBonus;
}


	/**
	 * Sets the bi-weekly bonus of Supervisors.
	 * @param biWeeklyBonus
	 */
	public void setBiWeeklyBonus(double biWeeklyBonus) {
	this.biWeeklyBonus = biWeeklyBonus;
}
	
	public double biWeeklyPay(int hoursWorked) {
		return super.biWeeklyPay(hoursWorked) + biWeeklyBonus;
	}

}


