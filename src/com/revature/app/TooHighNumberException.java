package com.revature.app;

//#1 create custom Exception class
public class TooHighNumberException extends Exception {
    //#2 Constructor for TooHighNumber
	public TooHighNumberException(int i) {
		//calling parameterized constructor for parent class using super()
		super("The number " + i + " is too high!");

	}

}
