package studentdbapp;

import java.util.Scanner;

public class Student { // Public class "Students" holding its variables
	private String firstName;
	private String lastName;
	private int gradeLevel;
	private String studentID;
	private String courses = "";
	private int balanceOfTuition = 0;
	private static int costOfClass = 400;
	private static int id = 1000; 
	
// Constructor which prompts user to enter student's name and year
	
	public Student() { // Public class "Student"
		Scanner in = new Scanner(System.in); // Scanner.in declares 'in' as an object, Input will be given to the system
		System.out.print("Enter Student First name: "); // System is a class, out outputs it, print will print the string
		this.firstName = in.nextLine(); // "firstName" value will be output as an object in the nextLine
		
		System.out.print("Enter Student Last name: "); // System is a class, out outputs it, print will print the string
		this.lastName = in.nextLine(); // "lastName" value will be output as an object in the nextLine
		
		System.out.print("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter Student Grade Level: "); // Prints out string
		this.gradeLevel = in.nextInt(); // "gradeLevel" value will be output as an object in the nextLine
		
		setStuID(); // Brings-in/outputs the function in this private class
	
	}
	
// Generate an ID
	private void setStuID() { // Private class
		// Grade level + ID
		id++; // Increments ID number by 1
		this.studentID = gradeLevel + "" + id; // StudentID VAR = grave level and an incremented id by 1
	}
	
// Course enrollment 
	public void enrollment() {
	// Get inside a loop, user hits 0
		do {
			System.out.print("Enter course to enroll (Q to quit): "); // Outputs/prints the string
			Scanner in = new Scanner(System.in); // Scanner.in declares 'in' as an object, Input will be given to the system
			String course = in.nextLine(); // Passes in the string value to the nextLine
			if (!course.equals("Q")) { // If you don't Quit do the following
				courses = courses + "\n  " + course; // courses will equal all the courses you chose
				balanceOfTuition = balanceOfTuition + costOfClass;
		
		}
		else { // If you Q this will run
			break; }	
	}	while (1 != 0); // While 1 is not equal to 0, forever
			
	}

// View  balance 
	public void viewBalance( ) { // Public class
		System.out.println("Your balance is: $" + balanceOfTuition); // Outputs the string plus tuition balance
	}
	
// Pay tuition
	public void payTuition() { // Public class
		viewBalance(); // Your balance before payment
		System.out.println("Enter Your Payment: $ "); // Outputs the string
		Scanner in = new Scanner(System.in); // Receive input or simply inputting a value in console
		int payment = in.nextInt(); // Scans the next token of the input as an integer
		balanceOfTuition = balanceOfTuition - payment; // Subtracts tuition balance and payment
		System.out.println("Thank you for your payment of $" + payment); // Outputs a string
		viewBalance(); // Your balance after payment
	}
	
// Show status
	public String showInfo() { // Returns a string
		return "Name: " + firstName + " " + lastName +
				"\nGrade Level: " + gradeLevel +
				"\nStudent ID: " + studentID +
				"\nEnrolled in: " + courses +
				"\nBalance: $" + balanceOfTuition; // Returns all the variables listed
	}
}
