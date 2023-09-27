package BasicCalc;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Basic Calculations");
		
		while (true) {
			
			System.out.println("\nPlease Select the Operator");
			System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");
            
			int choice = sc.nextInt();
			if (choice == 5) {
				System.out.println("Thanks for using my calculator");
				break;
			}
			
			System.out.println("Enter the first number: ");
			double num1 = sc.nextDouble();
			System.out.println("Enter the second number: ");
			double num2 = sc.nextDouble();
			
			double result = 0.0;
			
			if (choice == 1) {
				result = num1 + num2;
				System.out.println("Results: " + result);
			}
			else if (choice == 2) {
				result = num1 - num2;
				System.out.println("Results: " + result);
			}
			else if (choice == 3) {
				result = num1 * num2;
				System.out.println("Results: " + result);
			}
			else if (choice == 4) {
				if (num2 == 0) {
					System.out.println("Error! Division by Zero");
				}
				else {
					result = num1 / num2;
					System.out.println("Results: " + result);
				}	
			}
			else {
				System.out.println("Invalid choice. Please try again.");
			}
		}
		sc.close();

	}

}
