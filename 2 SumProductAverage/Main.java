/*
File: main.java
Description:
Author: Raymond Laughrey
Email: raymonl4963@student.vvc.edu
Date of Creation:2/13/2019, 4:54:54 PM
*/
import java.util.Scanner;
import java.math.*;
public class Main
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
     int max = Math.max(first, second);
     int min = Math.min(first, second);
     int absvalue = max - min;
     Math.abs(absvalue);
     System.out.printf("%-16s %s %n","Sum: ", + sum);
     System.out.printf("%-16s %s %n","Difference: ", + difference);
     System.out.printf("%-16s %s %n","Product: ", + product);
     System.out.printf("%-16s %s %n","Average: ", + average);
     System.out.printf("%-16s %s %n","Absolute Value: ", + absvalue);
     System.out.printf("%-16s %s %n","Max: ", + max);
     System.out.printf("%-16s %s %n","Min: ", + min);
  }
}
