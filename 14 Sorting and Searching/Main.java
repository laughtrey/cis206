/*
   File: Main.java
   Description: Telephone Lookup Program
   Author: Raymond Laughrey
   Email: raymonl4963@student.vvc.edu
   Date of Creation: 5/17/2019, 3:52:10 PM
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Main
{
public static void main(String[] args) throws FileNotFoundException
{
	Scanner input = new Scanner(System.in);
	String filename = ("MOCK_DATA.csv");
	TelephoneBook YellowPages = new TelephoneBook(filename);
	boolean menu = true;

	while (menu) {
		System.out.println("Telephone Book:\n" +
				   "1) Search the Telephone book by name\n" +
				   "2) Search the Telephone book by number\n" +
				   "3) Exit");
		String answer = input.nextLine();
		if (answer.equals("1")) {
			System.out.println("Please enter the full name of the person you would like to search for.");
			String name = input.nextLine();
			System.out.println(YellowPages.lookup_by_name(name));
		} else if (answer.equals("2")) {
			System.out.println("Please enter the number you would like to look up in format:\n" +
					   "###-###-####");
			String number = input.nextLine();
			System.out.println(YellowPages.lookup_by_number(number));
		} else {
			menu = false;
		}
	}
	input.close();
}
}
