/*
   File: Main.java
   Description: Sieve of Eratosthenes
   Author: Raymond Laughrey
   Email: raymonl4963@student.vvc.edu
   Date of Creation: 5/24/2019, 2:09:39 PM
 */
import java.util.*;
public class Main
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	int n;

	System.out.println("Up to what number do you want to know all prime numbers?");
	n = input.nextInt();
	sieve_of_Eratosthenes(n);
	input.close();

}
public static void sieve_of_Eratosthenes(int n)
{
	Set<Integer> sieve = new HashSet<Integer>();

	for (int i = 2; i <= n; i++) {
		sieve.add(i);
	}

	for (int i = 2; i * i <= n; i++) {
		for (int j = i; i * j <= n; j++)
			sieve.remove((i * j));
	}

	System.out.print(sieve);
}
}
