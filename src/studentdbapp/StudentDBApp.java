package studentdbapp;

import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentDBApp {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
	PrintWriter writer = new PrintWriter("myfile1.txt", "UTF-8");
			writer.println("firstName");
			writer.println("lastName");
			writer.println("gradeLevel");
			writer.println("studentID");
			writer.println("balanceOfTuition");
			writer.close(); 
			
				

		// Ask how many students we want to add 
		System.out.print("Enter number of new students to enroll: "); { // Outputs a string
		Scanner in = new Scanner(System.in);  // Receive input
		int numberOfStudents = in.nextInt(); // Returns the integer scanned from the input
		Student[] students = new Student[numberOfStudents]; // Array of object
		
		// Creating a # of new students
	for (int s = 0; s < numberOfStudents; s++) { // Creates a new student and adds by 1
		students[s]= new Student(); // Every new student will go through the following methods below
		students[s].enrollment(); // It will run the student through "enrollment"  function
		students[s].tuitionPayment(); // It will run the student through "tuitionPayment" function
		System.out.println(students[s].showInfo()); // Prints or outputs each new student as a string by running the showInfo function
			}	
		}
	}
}
	
	




	


	

