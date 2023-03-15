import java.util.*;

public class Main{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        String name, email, type, location;
        System.out.println("Enter the Customer Details\nEnter the name");
        name = sc.nextLine();
        System.out.println("Enter the email");
        email = sc.nextLine();
        System.out.println("Enter the type");
        type = sc.nextLine();
        System.out.println("Enter the location");
        location = sc.nextLine();

        Customer c = new Customer(name, email, type, location);
        System.out.println("Customer Details\nName: " + c.getCustomerName());
        System.out.println("E-mail: " + c.getCustomerEmail());
        System.out.println("Type: " + c.getCustomerType());
        System.out.println("Location: " + c.getCustomerLocation());

        sc.close();
    }
}
    
