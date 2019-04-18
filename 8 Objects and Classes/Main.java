/*
File: Main.java
Description: This is the Bug class.
Author: Raymond Laughrey
Email: raymonl4963@student.vvc.edu
Date of Creation: 4/17/2019, 10:45:12 PM
*/
import java.util.Scanner;
import java.util.Random;
public class Main
{
   public static void main(String[] args)
   {
     Random rand = new Random();
     int initialPosition = rand.nextInt(50)+1;
     int firstPositionChanges = rand.nextInt(10)+1;
     int secondPositionChanges = rand.nextInt(10)+1;
     Bug bugsy = new Bug(initialPosition);
     System.out.println("Bugsy starts at position: "+ initialPosition);
     for (int i = 0; i < firstPositionChanges; i++) {
       bugsy.move();
       System.out.println("Bugsy moves forward to: " + bugsy.getPosition() + ".");
     }

     System.out.println("Let's turn around!");
     bugsy.turn();

     for (int i = 0; i < secondPositionChanges; i++) {
       bugsy.move();
       System.out.println("Bugsy moves back to: " + bugsy.getPosition() + ".");
     }
  }
}
