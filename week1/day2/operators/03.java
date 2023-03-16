//Total Expenses for the Event

import java.util.*;
import java.io.*;
import java.text.DecimalFormat;

class Main{
    public static void main(String[] args) throws Exception{ 
    	DecimalFormat df = new DecimalFormat("0.00");
    	Scanner sc = new Scanner(System.in);

    	System.out.println("Enter branding expenses");
    	double a = sc.nextDouble();
    	System.out.println("Enter travel expenses");
    	double b = sc.nextDouble();
    	System.out.println("Enter food expenses");
    	double c = sc.nextDouble();
    	System.out.println("Enter logistics expenses");
    	double d = sc.nextDouble();

    	double s = a+b+c+d;
    	double a1 = (a/s)*100;
    	double b1 = (b/s)*100;
    	double c1 = (c/s)*100;
    	double d1 = (d/s)*100;
 
    	System.out.println("Total expenses: Rs."+df.format(s));
    	System.out.println("Branding expenses percentage: "+df.format(a1)+"%");
    	System.out.println("Travel expenses percentage: "+df.format(b1)+"%");
        System.out.println("Food expenses percentage: "+df.format(c1)+"%");
        System.out.println("Logistics expenses percentage: "+df.format(d1)+"%");

		sc.close();
    }
}
