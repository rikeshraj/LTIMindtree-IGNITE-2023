//Perfect number

import java.util.Scanner;
public class Main  {
    public static void main(String args[]) {
        long n, sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextLong();
        int i=1;
        while(i <= n/2) {
            if(n % i == 0)
                sum = sum + i;
            i++;
        }
        if(sum==n)
            System.out.println("Perfect number");
        else 
            System.out.println("Not a perfect number");
    }
}
