/*
   File: Main.java
   Description: Theater seat array project
   Author: Raymond Laughrey
   Email: raymonl4963@student.vvc.edu
   Date of Creation: 3/28/2019, 8:16:06 PM
 */
import java.util.Scanner;
import java.util.Arrays;
public class Main
{
public static void main(String[] args)
{
	final int ROWS = 9;
	final int COLUMNS = 10;

	int[][] availableseats = fillseats();
	purchase_seats(availableseats, ROWS, COLUMNS);
	print_this_array(availableseats, ROWS, COLUMNS);
}
public static int[][] fillseats()
{
	int[][] filled_seats = new int[][] {
		{ 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
		{ 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
		{ 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
		{ 10, 10, 20, 20, 20, 20, 20, 20, 10, 20 },
		{ 10, 10, 20, 20, 20, 20, 20, 20, 10, 20 },
		{ 10, 10, 20, 20, 20, 20, 20, 20, 10, 20 },
		{ 20, 20, 30, 30, 40, 40, 30, 30, 20, 20 },
		{ 20, 30, 30, 40, 50, 50, 40, 30, 30, 20 },
		{ 30, 40, 50, 50, 50, 50, 50, 50, 40, 30 }
	};
	return filled_seats;
}
public static int[][] purchase_seats(int[][] arr, int rows, int columns)
{
	int[][] seatingchart = arr;
	Scanner input = new Scanner(System.in);
	System.out.println("Welcome to the movies, Would you like to choose your seat or price?");
	String answer = input.next();
	while (!(answer.equals("seat") || answer.equals("price"))) {
		System.out.println("Please enter 'seat' or 'price'");
		answer = input.next();
	}
	boolean taken = false;
	while (!taken) {
		if (answer.equals("seat")) {
			System.out.println("Which row would you like to sit?: ");
			int rowselection = input.nextInt();
			System.out.println("Which seat number would you like?");
			int columnselection = input.nextInt();
			if (seatingchart[rowselection][columnselection] != 0) {
				seatingchart[rowselection][columnselection] = 0;
				System.out.println("Thank you for selection!");
				taken = true;
			}else {
				System.out.println("I'm sorry, that seat isn't available");
			}
		}else if (answer.equals("price")) {
			System.out.print("Select price: ");
			int priceselection = input.nextInt();
			for (int i = 0; i < seatingchart.length; i++) {
				for (int j = 0; j < seatingchart[i].length; j++) {
					if (seatingchart[i][j] == priceselection) {
						taken = true;
						seatingchart[i][j] = 0;
						System.out.printf("You purchased the seat [Row: %d, Seat: %d]\n", i + 1, j + 1);
						break;
					}
				}

				if (taken) {
					System.out.println("Thank you for your purchase,  Would you like to pick another? (y/n)");
					String x = input.next();
					if (x.equals("y")) {
						taken = false;
					}else {
						taken = true;
					}
					break;
				}
			}
		}
		input.close();
	}
	return seatingchart;
}
public static void print_this_array(int[][] arr, int rows, int columns)
{
	for (int i = 0; i < rows; i++) {
		for (int j = 0; j < columns; j++) {
			System.out.print(arr[i][j] + " ");
		}
		System.out.println();
	}

}
}
