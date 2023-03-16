//Reversing a number

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int sum=0, nc = n;
        while(n>0) {
            int r = n%10;
            sum = sum*10 + r;
            n /= 10;
        }
        System.out.println("Reverse of the number is " + sum);
     }
}
