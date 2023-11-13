/*
 * Student Name: JingYi Li
 * Lab Professor: Islam Gomaa
 * Due Date: Nov 12
 * Description: This is a subclass of Millers for employees that are paid the particular amount.
 */
package polymorphism;

/**
 * This class represents the employee. An employee is paid the same (particular) amount regardless of the hours (additional) the employee worked.
 * @author jayalee
 */

public class Employees extends Millers {
	private double annualPay;
	
/**
   Constructs an employee with a given name and an annual pay.
   @param name the name of this employee
   @param pay the annual pay of the employee
 */
	public Employees(String name, double pay) {
		setName(name);
		annualPay = pay;
	}
	
	/**
	 * Gets the annual pay of employees.
	 * @return the annul pay
	 */
	public double getAnnualPay() {
	return annualPay;
}
	
	/**
	 * Sets the annual pay of employees.
	 * @param annualPay
	 */
	public void setAnnualPay(double annualPay) {
	this.annualPay = annualPay;
}

	/**
	 * calculate bi-weekly pay for employees
	 */
	@Override
	public double biWeeklyPay(int hoursWorked) {
		return annualPay / 26;
	}
}

