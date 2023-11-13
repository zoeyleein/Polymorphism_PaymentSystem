/*
 * Student Name: JingYi Li
 * Lab Professor: Islam Gomaa
 * Due Date: Nov 12
 * Description: A program that tests Millers allows user to compute the salary for their company.
 */
package polymorphism;

import java.util.Scanner;

/**
   This class is called the MillerTest Class and provides the main method for your program.
   This program shows polymorphism by applying a method to objects of different classes. 
   Note that in your program, the Users should be prompted to input hours done worked by each miller. 
   You must implement using an array. 
   The order of the workers in the output is Consultants, Employees and Supervisors.
   Use the names in the output sample file provided for you. 
   Assume an annual pay, for example $84,000 and $30 as a Supervisor's bonus.
 * @author jayalee
 */
public class MillersTest {
	   public static void main(String[] args) {
		   
		   Scanner sc = new Scanner(System.in);
		   
	        /**
	         * Example millers
	         */
	        Consultants setconsultant = new Consultants("Joe, Lin", 30.0);
	        Employees setemployee = new Employees("Abby, Chang", 84000.0);
	        Supervisors setsupervisor = new Supervisors("Andress, Wu", 84000.0, 30.0);

	        /**
	         * Array to capture different categories of millers
	         */
	        Millers[] millersArray = { setconsultant, setemployee, setsupervisor };

	        /**
	         * Prompt users to input hours worked for each miller
	         */
	        for (Millers miller : millersArray) {
	            System.out.print("Enter the hours done by " + miller.getName() + ": ");
	            int hoursWorked = sc.nextInt();

	            double totalPay = miller.biWeeklyPay(hoursWorked);

	            /**
	             * Round the total pay to one decimal place
	             */
	            totalPay = Math.round(totalPay * 10.0) / 10.0;

	            /**
	             * Display the total pay for each miller
	             */
	            System.out.println("Total Pay for this miller is: " + totalPay + "\n");
	        }

	        char continueChoice;

	        do {
	        	System.out.print("Do you want to continue (y/n)? ");
	        	continueChoice = sc.next().charAt(0);

	        	if (continueChoice == 'y' || continueChoice == 'Y') {
	        	    sc.nextLine();  // Consume the newline character
	        	    System.out.print("What type of miller? (Consultant/Employee/Supervisor): ");
	        	    String millerType = sc.next().toLowerCase();

	                switch (millerType) {
	                    case "consultant":
	                    	System.out.print("Enter the name of this miller: ");
	    	        	    sc.nextLine();  // Consume the newline character
	    	        	    String consultantName = sc.nextLine();
	                    	System.out.print("Enter the wage for consultant " + consultantName + ": ");
	                    	int wageConsultant = sc.nextInt();
	                        System.out.print("Enter the hours done by " + consultantName + ": ");
	                        int hoursWorkedConsultant = sc.nextInt();
	                        Consultants consultant = new Consultants(consultantName, wageConsultant);
	                        double totalPayConsultant = consultant.biWeeklyPay(hoursWorkedConsultant);
	                        System.out.println("Total weekly pay for this miller is: " + totalPayConsultant + "\n");
	                        break;

	                    case "employee":
	                    	System.out.print("Enter the name of this miller: ");
	    	        	    sc.nextLine();  // Consume the newline character
	    	        	    String employeeName = sc.nextLine();
	                        System.out.print("Enter the annual pay for " + employeeName + ": ");
	                        double annualPayEmployee = sc.nextDouble();
	                        Employees employee = new Employees(employeeName, annualPayEmployee);
	                        double totalPayEmployee = employee.biWeeklyPay(40); //No matter how many hours employee works
	                        totalPayEmployee = Math.round(totalPayEmployee * 10.0) / 10.0;
	                        System.out.println("Total weekly pay for this miller is: " + totalPayEmployee + "\n");
	                        break;

	                    case "supervisor":
	                    	System.out.print("Enter the name of this miller: ");
	    	        	    sc.nextLine();  // Consume the newline character
	    	        	    String supervisorName = sc.nextLine();
	                        System.out.print("Enter the annual pay for " + supervisorName + ": ");
	                        double annualPaySupervisor = sc.nextDouble();
	                        System.out.print("Enter the weekly bonus for " + supervisorName + ": ");
	                        double weeklyBonusSupervisor = sc.nextDouble();
	                        Supervisors supervisor = new Supervisors(supervisorName, annualPaySupervisor, weeklyBonusSupervisor);
	                        double totalPaySupervisor = supervisor.biWeeklyPay(40); //No matter how many hours employee works
	                        totalPaySupervisor = Math.round(totalPaySupervisor * 10.0) / 10.0;
	                        System.out.println("Total weekly pay for this miller is: " + totalPaySupervisor + "\n");
	                        break;

	                    default:
	                        System.out.println("Invalid miller type.");
	                }
	            }

	        } while (continueChoice == 'y' || continueChoice == 'Y');

	        System.out.println("Bye!");
	        sc.close();
	    }
	}


 