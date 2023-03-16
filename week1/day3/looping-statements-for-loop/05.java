//Fibonacci series

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range:");
        int n = sc.nextInt();
        System.out.println("Fibonacci series:");
        int a=0, b=1, nex=0;
        System.out.println(a + "\n" + b);
        for(int i=2; i<n; i++) {
            nex = a+b;
            System.out.println(nex);
            a=b;
            b=nex;
        }
        sc.close();
    }
}
