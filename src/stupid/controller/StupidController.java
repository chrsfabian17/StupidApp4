package stupid.controller;

import java.util.Scanner;

public class StupidController
{
	private String myName;
	private Scanner inputReader;

	public StupidController()
	{
		myName = "Lady Killer";
		inputReader = new Scanner(System.in);
	}

	public void start()
	{
		System.out.println("Im not stupid!");
		System.out.println(myName);
		askQuestions();
	}
	
	private void askQuestions()
	{
	System.out.println("Do you like Chick-Fil-a?");
	String input = inputReader.nextLine();
	System.out.println("Oh, you said:" + input + " to Chick-Fil-a");
	}
}