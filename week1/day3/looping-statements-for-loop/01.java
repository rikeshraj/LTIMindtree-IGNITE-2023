//Print all the numbers between two numbers

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a =sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        for(int i=a; i<=b; i++) {
            System.out.println(i);
        }
        sc.close();
     }
}
