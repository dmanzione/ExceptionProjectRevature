package com.revature.app;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) throws TooHighNumberException {

		int i = 16;
		try {
			//#4
			functionThatThrowsException(i);
		} catch (TooHighNumberException c) {
			System.out.println(c);
		}
	}

	// #3 create function that throws your exception
	public static void functionThatThrowsException(int i) throws TooHighNumberException {
		if (i > 15) {

			throw new TooHighNumberException(i);

		}
	}
}
