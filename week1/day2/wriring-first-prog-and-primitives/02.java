//Customized welcome message

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name =sc.nextLine();
		System.out.println("Hello " + name + "! Welcome to Event Management System.");
		sc.close();
	}
}
