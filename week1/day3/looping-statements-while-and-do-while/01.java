//Sum of digits

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value :");
        int n = sc.nextInt();
        int sum=0, nc = n;
        while(n>0) {
            int r = n%10;
            sum += r;
            n /= 10;
        }
        System.out.println("Sum of digits in " + nc + " is " + sum);
     }
}
