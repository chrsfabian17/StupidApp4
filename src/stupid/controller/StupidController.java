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
	
	System.out.println("My next question is this: Whats your favorite car?");
	String carInput = inputReader.next();
	System.out.println("okay you typed:" + carInput);
	inputReader.nextLine(); //Used to consume unneeded input
	
	System.out.println("Now, what is your favorite color?");
	String colorInput = inputReader.nextLine();
	System.out.println("Oh," + colorInput + " is your favorite color.");
	
	System.out.println("How old are you?");
	Integer ageInput = inputReader.nextInt(); 
	System.out.println("Oh, so you are:" + ageInput);
	
	System.out.println("What is your favorite food?");
    String foodInput = inputReader.next();
    System.out.println("Okay, you typed this:" + foodInput);
    if(!foodInput.equals(""))
    {
    	System.out.println("Okay, you typed this:" + foodInput);
    }
    inputReader.nextLine();
    
    System.out.println("How many toes do you have?");
    int someInput = inputReader.nextInt();
    System.out.println("OK, you have " + someInput + " toes.");
    inputReader.nextLine();
	
	
	
    }
	
}
