import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Customer Details\nEnter the name");
		String name = sc.nextLine();
		System.out.println("Enter the email");
		String email = sc.nextLine();
		System.out.println("Enter the type");
		String type = sc.nextLine();
		System.out.println("Enter the location");
		String location = sc.nextLine();

		Customer c = new Customer(name, email, type, location);
		c.displayDetails();

		sc.close();
	}
}
