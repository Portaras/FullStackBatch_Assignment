package in.ineuron.assignment3;

import java.util.Scanner;

public class HandlingException {
	public static Scanner scanner = null;

	public static void main(String[] args)  {

		try{
		scanner = new Scanner(System.in);
		System.out.println("please enter the number : ");
		int input = scanner.nextInt();
		if (input<0)
		{
			throw new Exception();
		}
		System.out.println("Value Entered in  : " + input);
		}catch(Exception e) {
			System.out.println("Please enter the positive number!");
		}
		finally {
			System.out.println("Thanks for accessing this app!");
		}
	}

}
