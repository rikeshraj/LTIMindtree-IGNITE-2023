//Help the Mess Owner

import java.util.Scanner;

public class Main{
    public static void main(String[] args){    	     
        Scanner sc = new Scanner(System.in);

        System.out.println("Cost of item:");
        int cost = sc.nextInt();
        System.out.println("Number of items:");
        int items = sc.nextInt();

        System.out.println("Total cost is Rs." + (cost*items));

        sc.close();
    }
}
