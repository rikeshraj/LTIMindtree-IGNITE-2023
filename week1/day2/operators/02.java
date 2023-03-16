//Trade fair

import java.util.Scanner;

public class Main{
    public static void main(String[] args){    	     
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of people");
        int n = sc.nextInt();
        int x =(2*n)/7;
        System.out.println("Number of attendees on day 1 : "+x);
        System.out.println("Number of attendees on day 2 : "+(2*x));
        System.out.println("Number of attendees on day 3 : "+(x/2));
        sc.close();
    }
}
