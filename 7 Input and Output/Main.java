/*
   File: Main.java
   Description: Hotel transaction log, input and error handling.
   Author: Raymond Laughrey
   Email: raymonl4963@student.vvc.edu
   Date of Creation: 5/8/2019, 7:40:42 PM
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
	final int MAX_LENGTH = 4;

	ArrayList<String> Services = new ArrayList<String>();
	ArrayList<Reciept> Log = new ArrayList<Reciept>();
	int linecount = 0;
	while (in.hasNextLine()) {
		linecount++;
		String line = in.nextLine();
		String[] salesData = line.split(";");
		if (salesData.length > MAX_LENGTH) {
			throw new IllegalArgumentException("Input in log.txt on line: " + linecount); // This will throw an error message if log.txt is not formatted correctly.
		}
		//Expected:
		// 0 = Customer name
		// 1 = Service sold
		// 2 = Amount tendered
		// 3 = Date
		Double amount = Double.parseDouble(salesData[2]);
		Log.add(new Reciept(amount, salesData[1]));
		if (!Services.contains(salesData[1])) {
			Services.add(salesData[1]);
		}
	}
	for (String Service : Services) {
		Double serviceSum = 0.0;
		for (int i = 0; i < Log.size(); i++) {
			if (Log.get(i).get_service().equals(Service)) {
				serviceSum += Log.get(i).get_tendered();
			}
		}
		System.out.println("Total for " + Service + " amounts to: " + serviceSum);

	}
	in.close();
	// PrintWriter out = new PrintWriter("output.txt");
	// lines 43-50 here, to out.println.
	// out.close();

}
}
