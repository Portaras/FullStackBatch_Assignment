package in.ineuron.service;

import java.util.ArrayList;
import java.util.Iterator;

import in.ineuron.dto.Customer;

public class CustomerService {
	static ArrayList<Customer> customerList = null;
	static {
		customerList = new ArrayList<Customer>();
	}

	public static void storeCustomer(Customer customer) {

		// customerList.add(customer);
		customerList.add(customer.getAccountNumber() - 1, customer);
		// System.out.println("Customer List "+ customerList);
	}

	public static Customer getCustomer(int pin) {
		if (customerList != null) {
			Iterator<Customer> iterator = customerList.iterator();
			while (iterator.hasNext()) {
				Customer cust = iterator.next();
				if (pin == cust.getPin()) {
					return cust;
				}
			}
		}
		return null;
	}

	public static String depositCustomer(int pin, double deposit) {
		if (customerList != null) {
			Iterator<Customer> iterator = customerList.iterator();
			while (iterator.hasNext()) {
				Customer cust = iterator.next();
				if (pin == cust.getPin()) {
					cust.setAccountBalance(cust.getAccountBalance() + deposit);
					return "success";
				}
			}

		}
		return null;
	}

	public static String withdrawCustomer(int pin, double withdraw) {
		if (customerList != null) {
			Iterator<Customer> iterator = customerList.iterator();
			while (iterator.hasNext()) {
				Customer cust = iterator.next();
				if (pin == cust.getPin()) {
					if (withdraw <= cust.getAccountBalance()) {
						cust.setAccountBalance(cust.getAccountBalance() - withdraw);
						return "success";
					} else {
						System.out.println("Insufficient Balance");
					}
				}
			}

		}
		return null;
	}

	public static String transeferCustomer(int pin, Integer transferAccountNumber, double transferMoney) {
		Boolean flag = false;
		String status = "";
		Boolean flag2=false;
		Customer resetCustomer = null;
		Customer resetAccount = null;
		;

		if (customerList != null) {
			Iterator<Customer> iterator = customerList.iterator();
			while (iterator.hasNext()) {
				Customer cust = iterator.next();

				if (cust.getAccountNumber() == transferAccountNumber) {
					cust.setAccountBalance(cust.getAccountBalance() + transferMoney);
					flag = true;
					resetAccount=cust;
				} else {
					status = "Sorry Customer Account " + transferAccountNumber + " Not available with us";
				}

				if (pin == cust.getPin()) {
					if (transferMoney <= cust.getAccountBalance()) {
						cust.setAccountBalance(cust.getAccountBalance() - transferMoney);
						resetCustomer = cust;
						status = "success";
						flag2 = true;
					} else {
						status = "Insufficient Balance";
					}
				}

			}

		}
		if (flag == false) {
			resetCustomer.setAccountBalance(resetCustomer.getAccountBalance() + transferMoney);
		}
		if (flag2 == false) {
			resetAccount.setAccountBalance(resetAccount.getAccountBalance() - transferMoney);
		}
		return status;
	}
}
