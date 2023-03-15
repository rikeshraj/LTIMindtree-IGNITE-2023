import java.util.*;

public class Main{
    public static void main(String[] args){    	     
           Scanner sc = new Scanner(System.in);
           
           Address a = new Address();
           
           System.out.println("Enter Customer Address\nEnter the street");
           a.street = sc.nextLine();
           System.out.println("Enter the city");
           a.city = sc.nextLine();
           System.out.println("Enter the pincode");
           a.pincode = Integer.parseInt(sc.nextLine());
           System.out.println("Enter the country");
           a.country = sc.nextLine();
           
           a.displayAddress();
           
           sc.close();
    }
}
