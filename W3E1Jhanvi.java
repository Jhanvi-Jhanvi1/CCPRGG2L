package Jhanvi;
import java.io.*;
import java.util.*;
public class W3E1Jhanvi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//TO LOOP THE OPTIONS
		boolean Jhanvi_action = true;
		while(Jhanvi_action) {
		System.out.println("");
		System.out.println("\nSTUDENT RECORDS");
		//TO GIVE OPTIONS OF ACTIONS TO THE USER
		System.out.println("1. Input new student record.");
		System.out.println("2. View Student Record.");
		System.out.println("3. Exit.");
		System.out.print("Choose your action: ");
		int Jhanvi_choice = input.nextInt();
		
		//USING SWITCH TO DETERMINE COURSE OF ACTION
		switch(Jhanvi_choice) {
		case 1: 
			//FILEWRITER FOR INPUT
			System.out.println("\n--INPUT STUDENT RECORD--");
			try (FileWriter writer = new FileWriter("E1Jhanvi.txt", true)){
				System.out.print("\nEnter Student Number: ");
				int Jhanvi_studNum = input.nextInt();
				input.nextLine();
				System.out.print("\nEnter Student Lastname: ");
				String Jhanvi_lastName = input.nextLine();
				System.out.print("\nEnter Student Firstname: ");
				String Jhanvi_firstName = input.nextLine();
				System.out.print("\nEnter Student Course: ");
				String Jhanvi_course = input.nextLine();
				
				writer.write("\nStudent Number: " + Jhanvi_studNum );
				writer.write("\nStudent Lastname: " + Jhanvi_lastName);
				writer.write("\nStudent Firstname: " + Jhanvi_firstName);
				writer.write("\nStudent Course: " + Jhanvi_course);
				writer.close();
				System.out.println("Record updated!");
			} catch (IOException e) {
				System.out.println("Error to update file");
			} 
			break;
		
		case 2: 
			//filewriter for viewing
			System.out.print("\n--VIEW STUDENT RECORD--");
			try (FileReader reader = new FileReader("E1Jhanvi.txt")){
				int ch;
				while((ch = reader.read()) != -1) {
					System.out.print((char) ch);
				}
			} 
			catch (IOException e) {
				System.out.println("Error reading file");
			}
			break;
		
		case 3: 
			//TO EXIT THE PROGRAM
			System.out.println("Records have been saved.");
			Jhanvi_action = false;
			break;
		default: 
			//output when the input is not in the choices.
			System.out.println("Choose from the options.");
		} 
		
	 } 

	}

}
