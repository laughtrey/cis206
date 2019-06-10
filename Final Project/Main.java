/*
   File: Main.java
   Description:
   Author: Raymond Laughrey
   Email: raymonl4963@student.vvc.edu
   Date of Creation:
 */
import java.util.*;
import java.io.*;
public class Main
{
private static Scanner input  = new Scanner(System.in);
public static void main(String[] args) throws FileNotFoundException
{
	ArrayList<String> arr = new ArrayList<String>();

	open_file(arr);
	menu(arr);
	input.close();

}

public static ArrayList<String> open_file(ArrayList<String> arr) throws FileNotFoundException
{
	System.out.println("Would you like to open your file, or create a new one?\n" +
			   "1] Open file\n" +
			   "2] Create new file");
	String answer = input.nextLine();
	if (answer.equals("1")) {
		System.out.println("Please enter your filename: ");
		String filenameanswer = input.nextLine();
		File inputFile = new File(filenameanswer);
		Scanner in = new Scanner(inputFile);
		while (in.hasNextLine()) {
			String line = in.nextLine();
			arr.add(line);
		}
		in.close();
	}
	return arr;
}
public static void menu(ArrayList<String> arr) throws FileNotFoundException
{
	boolean menu = true;

	while (menu) {
		System.out.println("Would you like to add a line, delete a line, save, or exit?\n" +
				   "1] Add line\n" +
				   "2] Delete line\n" +
				   "3] Save\n" +
				   "4] Print the lines\n" +
				   "5] Exit");

		String answer = input.nextLine();

		if (answer.equals("1")) {
			add_line(arr);
		}else if (answer.equals("2")) {
			delete_line(arr);
		}else if (answer.equals("3")) {
			save_file(arr);
		}else if (answer.equals("4")) {
			print_lines(arr);
		}else  {
			menu = false;
		}
	}
}
public static ArrayList<String> add_line(ArrayList<String> arr)
{
	System.out.println("Enter your line!");
	String newline = input.nextLine();
	arr.add(newline);
	return arr;
}

public static ArrayList<String> delete_line(ArrayList<String> arr)
{
	System.out.println("Delete\n" +
			   "1]last line\n" +
			   "2]specific line?");
	String deleteAnswer = input.nextLine();
	if (deleteAnswer.equals("1")) {
		arr.remove(arr.size() - 1);
	}else if (deleteAnswer.equals("2")) {
		System.out.println("What line number do you want to delete?");
		int index = input.nextInt();
		input.nextLine();
		System.out.println("Deleting..");
		arr.remove(index);
	}
	return arr;
}
public static void save_file(ArrayList<String> arr) throws FileNotFoundException {
	System.out.println("Save as...");
	String fileName = input.nextLine();
	//fileName = fileName + ".txt";
	PrintWriter outputFile = new PrintWriter(fileName);
	System.out.println("Saving to file!");
	for (String lines : arr) {
		int linecount = 0;
		outputFile.println(linecount + ") " + lines);
		linecount++;
	}
	outputFile.close();
}
public static void print_lines(ArrayList<String> arr){
	int linecount = 0;
	for (String lines : arr) {
		System.out.println(linecount + ") " + lines);
		linecount++;
	}
}
}
