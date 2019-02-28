/*
   File: Main.java
   Description:
   Author: Raymond Laughrey
   Email: raymonl4963@student.vvc.edu
   Date of Creation:
 */
import java.util.Scanner;
public class Main
{
public static void main(String[] args)
{
	Scanner in = new Scanner(System.in);

	System.out.println("Please enter your first number: ");
	int a = in.nextInt();
	System.out.println("Please enter your second number: ");
	int b = in.nextInt();
	System.out.println("Please enter your third number: ");
	int c = in.nextInt();
	System.out.println("Please enter your fourth number: ");
	int d = in.nextInt();

	if (((a==b) && (c==d)) || ((a==c) && (b==d)) || ((a==d) && (b==c))) {
		System.out.println("You have two pair!");
	}
	else{
		System.out.println("You don't have two pair!");
	}


}
}
