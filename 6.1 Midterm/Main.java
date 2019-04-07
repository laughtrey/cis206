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
   public static void main(String[] args)
   {
     Scanner input = new Scanner(System.in);
     Vector<String> directory = new Vector<String>();
     String name = " ";
     String answer = " ";
     boolean addmorenames = true;
     boolean searchfornames = false;
     while (addmorenames){
       System.out.println("Hello, please enter the next name!");
            name = input.next();
            directory.add(name);
        System.out.println("Would you like to enter another name? (y/n)");
        answer = input.next();
        while (!(answer.equals("y") || answer.equals("n"))) {
      		System.out.println("Please enter 'y' or 'n'");
      		answer = input.next();
        }
        if (answer.equals("y")) {
          addmorenames = true;
        }
        else{
          System.out.println("Would you like to search for the index of a name? (y/n)");
          answer = input.next();
          while (!(answer.equals("y") || answer.equals("n"))) {
            System.out.println("Please enter 'y' or 'n'");
            answer = input.next();
          }
          if (answer.equals("y")){
          addmorenames = false;
          searchfornames = true;
        }
        else
        {
          addmorenames = false;
          searchfornames = false;
        }
        }
        while (searchfornames){
        System.out.println("Which name would you like to search for?");
        String query = input.next();
        for (int i = 0; i < directory.size();i++) {
          if (directory.get(i).equals(query))
          {
            System.out.println("They are number: " + directory.indexOf(query)+1 +" in the list.");
         }
        }
        System.out.println("Would you like to enter another name? (y/n)");
        answer = input.next();
        while (!(answer.equals("y") || answer.equals("n"))) {
          System.out.println("Please enter 'y' or 'n'");
          answer = input.next();
        }
        if (answer.equals("y")) {
          addmorenames = true;
          searchfornames = false;
        }
        else{
          addmorenames = false;
          searchfornames = false;
        }
      }
     }
     input.close();
  }
}
