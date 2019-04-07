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
	String answer = " ";
	boolean addmorenames = true;
	boolean searchfornames = false;
	while (addmorenames) {
		addmorenames(directory);
		System.out.println("Would you like to enter another name? (y/n)");
		answer = input.next();
		while (!(answer.equals("y") || answer.equals("n"))) {
			System.out.println("Please enter 'y' or 'n'");
			answer = input.next();
		}
		if (answer.equals("y")) {
			addmorenames = true;
		}else  {
			addmorenames = false;
      searchfornames = true;
		}
		while (searchfornames) {
			System.out.println("Would you like to search for the index of a name? (y/n)");
			answer = input.next();
			while (!(answer.equals("y") || answer.equals("n"))) {
				System.out.println("Please enter 'y' or 'n'");
				answer = input.next();
			}
			if (answer.equals("y")) {
				addmorenames = false;
				searchfornames = true;
			}else  {
				addmorenames = false;
				searchfornames = false;
			}
			searchfornames(directory);
			System.out.println("Would you like to enter another name or search? (e/s)");
			answer = input.next();
			while (!(answer.equals("e") || answer.equals("s"))) {
				System.out.println("Please enter 'e' or 's'");
				answer = input.next();
			}
			if (answer.equals("e")) {
				addmorenames = true;
				searchfornames = false;
			}else if (answer.equals("s"))  {
				addmorenames = false;
				searchfornames = true;
			}else {
        addmorenames = false;
        searchfornames = false;
      }
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
}
