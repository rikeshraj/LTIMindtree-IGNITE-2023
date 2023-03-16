//Type casting into diff types of decimal

import java.util.Scanner;

public class Main{
    public static void main(String[] args){    	     
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a double value");
        double inp = sc.nextDouble();

        float fl = (float)inp;
        long l = (long)inp;
        int in = (int)inp;
        short sh = (short)inp;
        byte by = (byte)inp;

        System.out.println("Double value  = " + inp);
        System.out.println("Typecasted to float : Value  = " + fl);
        System.out.println("Typecasted to long : Value  = " + l);
        System.out.println("Typecasted to int : Value  = " + in);
        System.out.println("Typecasted to short : Value  = " + sh);
        System.out.println("Typecasted to byte : Value  = " + by);

        sc.close();          
    }
}
