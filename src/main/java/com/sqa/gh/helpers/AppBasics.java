/**
 * File Name: AppBasics.java<br>
 * Nepton, Jean-francois<br>
 * Java Boot Camp Exercise<br>
 * Instructor: George Hanna<br>
 * Created: Aug 23, 2017
 */
package com.sqa.gh.helpers;

import java.util.*;

/**
 * AppBasics //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Nepton, Jean-francois
 * @version 1.0.0
 * @since 1.0
 */
public class AppBasics {

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * Generic method to farewell user from application.
	 * 
	 * @param userName
	 *            Name of the user.
	 */
	public static void farewellUser(String userName) {
		System.out.println("Thank you " + userName + " for using our application.");
		System.out.println("Have a nice day!");
	}

	/**
	 * Generic method to greet the user and request their name. Name is being
	 * returned to you should store it in a variable.
	 *
	 * @param appName
	 *            The name of the application you created.
	 * @return The name of the user
	 */
	public static String greetUserAndGetName(String appName) {
		// Greet the user using a system out call
		System.out.println("Welcome to the " + appName + " Application.");
		// Ask the user for their name and store in a local scope String
		// variable
		System.out.print("Can I get your name? ");
		return scanner.nextLine();
	}

	public static boolean requestBoolean(String question) {
		String input;
		System.out.print(question + " (Yes/No)");
		input = scanner.nextLine();
		if (input.trim().equalsIgnoreCase("yes")) {
			return true;
		} else if (input.trim().equalsIgnoreCase("no")) {
			return false;
		} else {
			System.out.println("You did not respond to the question in the correct form: (Yes/No)");
			return false;
		}
	}

	public static byte requestByte(String question) {
		byte num = 0;
		String input;
		System.out.print(question + " ");
		input = scanner.nextLine();
		try {
			num = Byte.parseByte(input);
		} catch (NumberFormatException e) {
			System.out.println("You did not supply a valid number [" + input + "]. please provide only digits.");
		}
		return num;
	}

	public static char requestChar(String question) {
		System.out.print(question + " ");
		return scanner.nextLine().charAt(0);
	}

	public static double requestDouble(String question) {
		double num = 0;
		String input;
		System.out.print(question + " ");
		input = scanner.nextLine();
		try {
			num = Double.parseDouble(input);
		} catch (NumberFormatException e) {
			System.out.println("You did not supply a valid number [" + input + "]. please provide only digits.");
		}
		return num;
	}

	public static float requestFloat(String question) {
		float num = 0;
		String input;
		System.out.print(question + " ");
		input = scanner.nextLine();
		try {
			num = Float.parseFloat(input);
		} catch (NumberFormatException e) {
			System.out.println("You did not supply a valid number [" + input + "]. please provide only digits.");
		}
		return num;
	}

	public static int requestInt(String question) {
		int num = 0;
		String input;
		System.out.print(question + " ");
		input = scanner.nextLine();
		try {
			num = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			System.out.println("You did not supply a valid number [" + input + "]. please provide only digits.");
		}
		return num;
	}

	public static long requestLong(String question) {
		long num = 0;
		String input;
		System.out.print(question + " ");
		input = scanner.nextLine();
		try {
			num = Long.parseLong(input);
		} catch (NumberFormatException e) {
			System.out.println("You did not supply a valid number [" + input + "]. please provide only digits.");
		}
		return num;
	}

	public static short requestShort(String question) {
		short num = 0;
		String input;
		System.out.print(question + " ");
		input = scanner.nextLine();
		try {
			num = Short.parseShort(input);
		} catch (NumberFormatException e) {
			System.out.println("You did not supply a valid number [" + input + "]. please provide only digits.");
		}
		return num;
	}

	public static String requestString(String question) {
		System.out.print(question + " ");
		return scanner.nextLine();
	}
}
