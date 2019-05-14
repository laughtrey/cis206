/*
   File: Main.java
   Description:
   Author: Raymond Laughrey
   Email: raymonl4963@student.vvc.edu
   Date of Creation: 5/13/2019, 8:48:03 PM
 */
import java.util.Scanner;
public class Main
{
public static void main(String[] args)
{
	Scanner in = new Scanner(System.in);

	NumericQuestion first = new NumericQuestion();

	first.setText("What is 2+2?");
	first.setAnswer("4");
	first.display();
	System.out.print("Your answer: ");
	String input = in.nextLine();
	System.out.println(first.checkAnswer(input));
	in.close();
}
}
