package studentdbapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses;
	private int tuitionBalance;
	private static int costOfCourse = 400;
	private static int id = 1000; 
	
// Constructor which prompts user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in); // Scanner.in declares 'in' as an object, Input will be given to the system
		System.out.print("Enter Student First name: "); // System is a class, out outputs it, print will print the string
		this.firstName = in.nextLine(); // Input the variables value then Returns the input that was skipped 
		
		System.out.print("Enter Student Last name: "); // System is a class, out outputs it, print will print the string
		this.lastName = in.nextLine(); // 'in' makes sure you use scanner method, nextLine means what it would do
		
		System.out.print("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter Student Grade Level: "); // Prints out string
		this.gradeYear = in.nextInt(); // 
		
		setStudentID(); // Outputs the function in this private class
		
		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID); // Prints all inputs by outputting it
	
	}
	
// Generate an ID
	private void setStudentID() { // Private class
		// Grade level + ID
		id++; // Increments ID number by 1
		this.studentID = gradeYear + "" + id; // StudentID VAR = grave level and an incremented id by 1
	}
// Enroll in courses

// View  balance 
	
// Pay tuition
	
// Show status
}
