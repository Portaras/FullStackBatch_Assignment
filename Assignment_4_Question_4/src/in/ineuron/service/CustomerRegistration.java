package in.ineuron.service;

import java.util.Scanner;

import in.ineuron.dto.Customer;

public class CustomerRegistration {
	public static void registration() {
		Scanner scan = null;
		System.out.println("*************************************");
		System.out.println("**   WELCOME TO THE INEURON BANK   **");
		System.out.println("*************************************");
		System.out.println("Press 1 : To register your PIN \nPress 2 : Login to your ACCOUNT");
		System.out.print("Enter Here : ");
		scan = new Scanner(System.in);
		int selection1 = scan.nextInt();
		System.out.println("*************************************");
		// REGITRATION PROCESS
		if (selection1 == 1) {
			System.out.print("Please Enter your NAME to Register : ");
			String custName = scan.next();
			Customer customer = new Customer();
			customer.setCustomerName(custName);
			System.out.print("Please Enter PIN Number to Register : ");
			int custPin = scan.nextInt();
			customer.setPin(custPin);
			System.out.println("****************************************************************");
			System.out.println(
					"Congratulations !!!! Your account is registered with Name : " + customer.getCustomerName());
			System.out.println("Your Account Number is : " + customer.getAccountNumber());
			System.out.println("Your Current Balance is : " + customer.getAccountBalance());
			CustomerService.storeCustomer(customer);
			goToMainMenu(scan);
			// LOGIN to ACCOUNT
		} else if (selection1 == 2) {
			System.out.println("Please Enter the PIN to Login");
			int loginPin = scan.nextInt();
			Customer viewCust = CustomerService.getCustomer(loginPin);
			if (viewCust != null) {
				System.out.println(viewCust);
				System.out.println("Press 3 to CHECK balance:\nPress 4 to DEPOSIT Money:\nPress 5 to WITHDRAW Money:\nPress 6 to TRANSFER Money:");
				int checkBal = scan.nextInt();
				// CHECK BALANCE
				if (checkBal == 3) {
					System.out.println("Your Current Balance in the Account is :  " + viewCust.getAccountBalance());
					goToMainMenu(scan);
					// DEPOSIT MONEY
				} else if (checkBal == 4) {
					System.out.println("Please enter the amount to Deposit : ");
					Double deposit = scan.nextDouble();

					String updateMesg = CustomerService.depositCustomer(viewCust.getPin(), deposit);
					status(scan, updateMesg);

				} else if (checkBal == 5) {
					System.out.println("Please enter the amount to Withdraw : ");
					Double withdraw = scan.nextDouble();
					String updateMesg = CustomerService.withdrawCustomer(viewCust.getPin(), withdraw);
					status(scan, updateMesg);
					
				} else if (checkBal == 6) {
					System.out.println("Please enter the amount to transfer : ");
					Double transferMoney = scan.nextDouble();
					System.out.println("Please enter the Account number to transfer : ");
					Integer transferAccountNumber = scan.nextInt();


					String updateMesg = CustomerService.transeferCustomer(viewCust.getPin(), transferAccountNumber,transferMoney );
					status(scan, updateMesg);
				} else {
					System.out.println("Wrong Imput");
					goToMainMenu(scan);
				}

			} else {
				System.out.println("Record not available ");
				goToMainMenu(scan);
			}
		} else {
			System.out.println("Please Enter the Valid input");
			goToMainMenu(scan);
		}
		if (scan != null)
			scan.close();
	}

	private static void status(Scanner scan, String updateMesg) {
		if ("success".equalsIgnoreCase(updateMesg)) {
			System.out.println("Transaction Successfull");
			goToMainMenu(scan);
		} else {
			System.out.println("Transaction Failure");
			goToMainMenu(scan);
		}
	}

	private static void goToMainMenu(Scanner scan) {
		System.out.println();
		System.out.println("Press 1 to return to MAIN page : \nPress 0 to Exit Application : ");
		int returnId = scan.nextInt();
		if (returnId == 1) {
			registration();
		} else if (returnId == 0) {
			System.out.println("****--THANK YOU FOR BANKING WITH US--****");
			System.exit(returnId);
		} else {
			System.out.println("INVALID INPUT");
			System.exit(0);
		}
	}
}
