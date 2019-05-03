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
	File inputFile = new File("log.txt");
	Scanner in = new Scanner(inputFile);

	ArrayList<Double> Dinner = new ArrayList<Double>();
	ArrayList<Double> Conference = new ArrayList<Double>();
	ArrayList<Double> Lodging = new ArrayList<Double>();

	int linecount = 0;
	while (in.hasNextLine()) {
		linecount++;
		String line = in.nextLine();
		String[] data = line.split(";");
		if (data[1].equals("Dinner")) {
			double price = Double.parseDouble(data[2]);
			Dinner.add(price);
		}else if (data[1].equals("Conference")) {
			double price = Double.parseDouble(data[2]);
			Conference.add(price);
		}else if (data[1].equals("Lodging")) {
			double price = Double.parseDouble(data[2]);
			Lodging.add(price);
		}else {
			in.close();
			throw new IllegalArgumentException("Input in log.txt on line: " + linecount); // This will throw an error message if log.txt is not formatted correctly.
		}
	}
	in.close();
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
	// lines 49-64 here, to out.println.
	// out.close();

}
}
