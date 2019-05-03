/*

   import java.util.File;
   import java.util.Scanner;
   import java.util.Scanner;

   File: Main.java
   Description:
   Author: Raymond Laughrey
   Email: raymonl4963@student.vvc.edu
   Date of Creation:
 **/
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Main
{
public static void main(String[] args) throws FileNotFoundException
{
	ArrayList<Double> Dinner = new ArrayList<Double>();
	ArrayList<Double> Conference = new ArrayList<Double>();
	ArrayList<Double> Lodging = new ArrayList<Double>();


	File inputFile = new File("log.txt");
	//THROW EXCEPTION HERE IF NO FILE

	Scanner in = new Scanner(inputFile);

	while (in.hasNextLine()) {
		String line = in.nextLine();
		String[] data = line.split(";");
		System.out.println(line);
		//parse name, occurance/price into data struct, date
		if (data[1].equals("Dinner")) {
			double price = Double.parseDouble(data[2]);
			Dinner.add(price);
		}else if (data[1].equals("Conference")) {
			double price = Double.parseDouble(data[2]);
			Conference.add(price);
		}else if (data[1].equals("Lodging")) {
			double price = Double.parseDouble(data[2]);
			Lodging.add(price);
		}       //else THROW EXCEPTION HERE
	}
	System.out.println("=======Totals=======");
	double DinnerSum = 0;
	for (int i = 0; i < Dinner.size(); i++ ) {
		DinnerSum += Dinner.get(i);
	}
	System.out.println("Dinner sum: " + DinnerSum);
	double ConferenceSum = 0;
	for (int i = 0; i < Conference.size(); i++ ) {
		ConferenceSum += Conference.get(i);
	}
	System.out.println("Conference sum: " + ConferenceSum);
	double LodgingSum = 0;
	for (int i = 0; i < Lodging.size(); i++ ) {
		LodgingSum += Lodging.get(i);
	}
	System.out.println("Lodging sum: " + LodgingSum);

	// PrintWriter out = new PrintWriter("output.txt");
	// out.println(line);
	// out.close();

	in.close();


}
}
