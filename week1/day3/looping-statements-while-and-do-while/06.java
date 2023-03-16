//Calculate the sum between two numbers

import java.util.Scanner;
public class Main  {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n;
        do {
            System.out.println("Type a value between 0 and 20");
            n = sc.nextInt();
        } while(n<0||n>20);
        System.out.println("The final value is " + (n+17));
    }
}
