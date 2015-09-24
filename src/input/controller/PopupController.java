package input.controller;

import input.view.PopupDisplay;
import input.model.Thingy;

public class PopupController
{
	
	private PopupDisplay myPopups;
	private Thingy myTestThing;
	
	public PopupController()
	{
		myPopups = new PopupDisplay(); 
	}
	
	public void start()
	{
		String temp = myPopups.grabAnswer("Type in your name");
		myPopups.showResponse("You typed in: " + temp);
		
		
		
		String tempAge = myPopups.grabAnswer("Type in your age");
		int myAge;
		
		if(isInteger(tempAge))
		{
			myAge = Integer.parseInt(temp);
		}
		else
		{
			myAge = -9999999;
		}
		
		myPopups.showResponse("You typed: " + myAge);
		
		
		
		String tempWeight = myPopups.grabAnswer("Type in your weight");
		double myWeight = Double.parseDouble(tempWeight);
		myPopups.showResponse("You typed: " + myWeight);
		
		
		
		myTestThing = new Thingy(temp, myAge, myWeight);
	}
	
	private boolean isInteger(String input)
	{
		boolean isInt = false;
		
		try
		{
			int temp = Integer.parseInt(input);
			isInt = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.showResponse("not an int - bad value will be used");
		}
		
		return isInt;
	}
	
	private boolean isDouble(String input)
	{
		boolean isDouble = false;
		
		try
		{
			double temp = Double.parseDouble(input);
			isDouble = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.showResponse("not a double - bad value will be used");
		}
		
		return isDouble;
	}
}
