/*
   File: Main.java
   Description:
   Author: Raymond Laughrey
   Email: raymonl4963@student.vvc.edu
   Date of Creation:
 */
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
public class Main
{
public static void main(String[] args)
{
	String str = "abc";
	String str2 = "that";
	String str3 = "Supercalifragilisticexpialidocious";
	String str4 = "California";
	String str5 = "March";
	String str6 = "Java";

	System.out.println(scramble(str));
	System.out.println(scramble(str2));
	System.out.println(scramble(str3));
	System.out.println(scramble(str4));
	System.out.println(scramble(str5));
	System.out.println(scramble(str6));
}
public static String scramble(String word)
{
	String scrambled = word;

	if (word.length() > 3) {
		int i = (int)(Math.random() * (word.length() - 2));
		if (i == 0) {
			i = 1;
		}
		int j = i + 1;
		char random1 = word.charAt(i);
		char random2 = word.charAt(j);
		String Beginning = word.substring(0, i);                // creates a string before the randomly picked character
		String End = word.substring(1 + j);                     // creates a string after the second picked character to the end of the word
		scrambled = Beginning + random2 + random1 + End;        // concatenates the word with scrambled letters inside
	}
	return scrambled;


}
}
