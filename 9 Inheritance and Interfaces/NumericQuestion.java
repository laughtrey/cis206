/*
   File: NumericQuestion.java
   Description:
   Author: Raymond Laughrey
   Email: raymonl4963@student.vvc.edu
   Date of Creation: 5/13/2019, 8:48:03 PM
 */
public class NumericQuestion extends Question {
public NumericQuestion()
{
	super(); //Constructs class with super class default constructor.
}

public boolean checkAnswer(String input)
{
	double answer = Double.parseDouble(this.getAnswer());
	double inputAnswer = Double.parseDouble(input);

	return Math.abs(answer - inputAnswer) <= 0.01;

	//As long as the correct answer and inputted answer don't differ by .01, returns true.
	// if (answer.equals(input) || answer.equals(input + .01) || answer.equals(input - .01)) {
	// 	return true;
	// }
	// else
	// return false;
}
}
