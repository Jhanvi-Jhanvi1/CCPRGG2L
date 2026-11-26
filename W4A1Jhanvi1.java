package Jhanvi;
import java.util.*;
public class W4A1Jhanvi1 {
   
	static void Jhanvi_menu() {
		System.out.println("Choose from the following: ");
		System.out.println("A. ADD\nB. SUBTRACT\nC. MULTIPLY\nD. DIVIDE");
	}
	
	static void Jhanvi_add(int a, int b) {
		int Jhanvi_sum = a + b;
		System.out.println("Answer: " + Jhanvi_sum);
	}
	static void Jhanvi_subtract(int a, int b) {
		int Jhanvi_difference = a-b;
		System.out.println("Answer: " + Jhanvi_difference);
	}
	static void Jhanvi_multiply(int a, int b) {
		int Jhanvi_product = a*b;
		System.out.println("Answer: " + Jhanvi_product);
	}
	static void Jhanvi_divide(int a, int b) {
		int Jhanvi_quotient = a/b;
		System.out.println("Answer: " + Jhanvi_quotient);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Jhanvi_menu();
		System.out.print("Enter your choice: ");
		String Jhanvi_ch = input.nextLine();
		String Jhanvi_chosen = Jhanvi_ch.toUpperCase();
	
		switch(Jhanvi_chosen) {
			case "A": 
				System.out.println("\nOPEARTION: ADDITION");
				System.out.print("Enter first number: ");
				int Jhanvi_num1  = input.nextInt();
				
				System.out.print("Enter second number: ");
				int Jhanvi_num2  = input.nextInt();
				System.out.println("\nRESULT");
				Jhanvi_add(Jhanvi_num1, Jhanvi_num2);
			break;
			
			case "B": 
				System.out.println("\nOPEARTION: SUBTRACTION");
				System.out.print("Enter first number: ");
				int Jhanvi_num3  = input.nextInt();
				
				System.out.print("Enter second number: ");
				int Jhanvi_num4  = input.nextInt();
				System.out.println("\nRESULT");
				Jhanvi_subtract(Jhanvi_num3, Jhanvi_num4);
			break;
			case "C": 
				System.out.println("\nOPEARTION: MULTIPLICATION");
				System.out.print("Enter first number: ");
				int Jhanvi_num5  = input.nextInt();
				
				System.out.print("Enter second number: ");
				int Jhanvi_num6  = input.nextInt();
				System.out.println("\nRESULT");
				Jhanvi_multiply(Jhanvi_num5, Jhanvi_num6);
			break;
			case "D": 
				System.out.println("\nOPEARTION: DIVISION");
				System.out.print("Enter first number: ");
				int Jhanvi_num7  = input.nextInt();
				
				System.out.print("Enter second number: ");
				int Jhanvi_num8  = input.nextInt();
				System.out.println("\nRESULT");
				Jhanvi_divide(Jhanvi_num7, Jhanvi_num8);
			break;
			default:
				System.out.println("Invalid. Choose from the options.");
		  }		
		  input.close();
	}	  
}
