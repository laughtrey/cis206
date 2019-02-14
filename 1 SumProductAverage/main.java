/*
File: main.java
Description:
Author: Raymond Laughrey
Email: raymonl4963@student.vvc.edu
Date of Creation:2/13/2019, 4:54:54 PM
*/
import java.util.Scanner;
import java.math.*;
public class main
{
   public static void main(String[] args)
   {
     Scanner in = new Scanner(System.in);
     //int first = 0;
     //int second = 0;
     System.out.println("Please enter your first number: ");
     int first = in.nextInt();
     System.out.println("Please enter your second number: ");
     int second = in.nextInt();

     int sum = first + second;
     int difference = first - second;
     int product = first * second;
     int average = sum / 2;
     int absvalue = Math.abs(first) - Math.abs(second);
     int max = Math.max(first, second);
     int min = Math.min(first, second);
  }
}
