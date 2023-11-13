/*
 * Student Name: JingYi Li
 * Lab Professor: Islam Gomaa
 * Due Date: Nov 12
 * Description: This is a subclass of Millers for consultants that are paid for every hour worked.
 */
package polymorphism;

/**
 * This code in this file is for the Consultant Class. A Consultant is a miller who is paid for every hour worked.
 * @author jayalee
 */
public class Consultants extends Millers {
	private double consultantWage;
/** 
   This portion of your code constructs an hourly paid consultant with a given name and biweekly wage.
   @param name the name of this consultant
   @param wage the consultant wage per hour  
*/
public Consultants(String name, double wage) {
	setName(name);
	consultantWage = wage;
}

public double getConsultantWage() {
	return consultantWage;
}

public void setConsultantWage(double consultantWage) {
	this.consultantWage = consultantWage;
}

@Override
public double biWeeklyPay(int hoursWorked)
{
   double pay = hoursWorked * consultantWage;

   if(hoursWorked > 76) {
      pay = pay + ((hoursWorked - 76) * 0.5) * consultantWage;
   }
   return pay;
}
}


