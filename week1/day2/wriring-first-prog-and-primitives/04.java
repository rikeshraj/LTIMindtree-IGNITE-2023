//Event details

import java.util.Scanner;
import java.text.DecimalFormat;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(".#");

        System.out.println("Enter the name of the event");
        String eventName = sc.nextLine();
        System.out.println("Enter the type of the event");
        String eventType = sc.nextLine();
        System.out.println("Enter the number of people expected");
        long noOfPeople = sc.nextLong();
        System.out.println("Is it a paid entry? (Type Y or N)");
        char paidEntry = sc.next().charAt(0);
        System.out.println("Enter the projected expenses (in lakhs) for this event");
        double expense = sc.nextDouble();

        System.out.println("Event Name : " + eventName);
        System.out.println("Event Type : " + eventType);
        System.out.println("Expected Count : " + noOfPeople);
        System.out.println("Paid Entry : " + paidEntry);
        System.out.println("Projected Expense : " + df.format(expense) + "L");
        
        sc.close();
     }
}
