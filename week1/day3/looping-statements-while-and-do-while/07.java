//Sum till -999 is inputted

import java.util.Scanner;
public class Main  {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=0, sum=0;
        do {
            n = sc.nextInt();
            sum += n;
        } while(n!=-999);
        System.out.println("The sum is " + (sum+999));
    }
}
