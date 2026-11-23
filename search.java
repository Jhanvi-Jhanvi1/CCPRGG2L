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
		System.out.println("3. Search Student.");
		System.out.println("4. Exit.");
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
				writer.write(Jhanvi_studNum + ", " + Jhanvi_lastName + ", " + Jhanvi_firstName + ", " + Jhanvi_course);
				writer.write(System.lineSeparator());				
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
			input.nextLine();
			System.out.print("Enter name of student to search: ");
			String Jhanvi_search = input.nextLine();
			boolean Jhanvi_found = false; 
			try (BufferedReader reader = new BufferedReader(new FileReader("E1Jhanvi.txt"))){
				String line;
				while((line = reader.readLine()) != null) {
					String[] record = line.split(",");
					
					if(record.length >= 4 && (record[1].trim().equalsIgnoreCase(Jhanvi_search) || record[2].trim().equalsIgnoreCase(Jhanvi_search))) {
						System.out.println("\n--STUDENT RECORD FOUND--");
						System.out.println("Student Number: " + record[0].trim());
						System.out.println("Student Lastname: " + record[1].trim());
						System.out.println("Student Firstname: " + record[2].trim());
						System.out.println("Student Course: " + record[3].trim());
						Jhanvi_found = true;
					}
				}
				if(!Jhanvi_found) {
					System.out.println("Student record not found.");
				}
			} catch (IOException e) {
				System.out.println("An error occured.");
			}
			break;
		case 4: 
			//TO EXIT THE PROGRAM
			System.out.println("Records have been saved. Thank you!");
			Jhanvi_action = false;
			break;
		default: 
			//output when the input is not in the choices.
			System.out.println("Choose from the options.");
		} 
		
	 } 

	}

}
