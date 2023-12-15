package new_project;

import java.util.Scanner;

public class ATM_complete_project {

	public static void main(String[] args) {
		int pin = 1234;
		int balance = 10000;
		int AddAmount = 0;
		int TakeAmount = 0;
		String name;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your pin");
		int password = scanner.nextInt();
		if (pin == password) {
			System.out.println("Enter your name");
			name = scanner.next();
			System.out.println("Welcome " + name);
			while (true) {
				System.out.println("press 1 to check balance");
				System.out.println("press 2 to deposit");
				System.out.println("press 3 to withdraw");
				System.out.println("press 4 to take receipt");
				System.out.println("press 5 to exit");

				int opt = scanner.nextInt();
				switch (opt) {
				case 1:
					System.out.println("your current balance is " + balance);
					break;
				case 2:
					System.out.println("Amount");
					AddAmount = scanner.nextInt();
					System.out.println("successfully credited");
					balance = AddAmount + balance;
					break;
				case 3:
					System.out.println("Amount");
					TakeAmount = scanner.nextInt();
					if (TakeAmount > balance) {
						System.out.println("Insufficient balance");
						System.out.println("Try less tan your balance");
					} else {
						System.out.println("your amount is taken");
						balance = balance - TakeAmount;
					}
					break;
				case 4:
					System.out.println("Welcome to indian bank");
					System.out.println("Available balance is " + balance);
					System.out.println("Amount deposited " + AddAmount);
					System.out.println("Amount witdraw " + TakeAmount);
					System.out.println("Thanks for coming");
					break;
				default:
					System.out.println("press number 5 to exit");
					break;
				}
				if(opt==5) {
					System.out.println("thank you");
					break;
				}
			}
		}
		else {
			System.out.println("Wrong pin number");
		}

	}

}
