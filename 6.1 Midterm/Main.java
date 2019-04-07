/*
   File: Main.java
   Description: Java midterm.
   Author: Raymond Laughrey
   Email: raymonl4963@student.vvc.edu
   Date of Creation: 4/4/2019, 7:12:16 PM
 */
import java.util.Scanner;
import java.util.Vector;
public class Main
{
private static Scanner input = new Scanner(System.in);
public static void main(String[] args)
{
	Vector<String> directory = new Vector<String>();
	boolean menu = true;
	while (menu) {
		System.out.println("Make a selection: \n 1] Add a name to the directory.\n 2] Search the directory.\n 3] List the directory.\n 4] Exit.");
		int answer = input.nextInt();
		if (answer == 1) {
			addmorenames(directory);
		}else if (answer == 2) {
			searchfornames(directory);
		}else if (answer == 3) {
			printthe(directory);
		}else if (answer == 4) {
			menu = false;
		}
	}
	input.close();
}
public static Vector<String> addmorenames(Vector<String> v)
{
	String name = " ";

	System.out.println("Hello, please enter the next name!");
	name = input.next();
	v.add(name);
	return v;
}
public static void searchfornames(Vector<String> v)
{
	System.out.println("Which name would you like to search for?");
	String query = input.next();
	for (int i = 0; i < v.size(); i++) {
		if (v.get(i).equals(query)) {
			System.out.println("They are number: " + (i + 1) + " in the list.");
		}
	}
}
public static void printthe(Vector<String> v)
{
	for (String names : v)
		System.out.println(names);
}
}
