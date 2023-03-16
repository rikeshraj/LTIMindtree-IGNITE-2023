//Multiplication table

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        System.out.println("Enter m");
        int m = sc.nextInt();
        System.out.println("The multiplication table of " + n + " is");
        int i=0;
        while(i++<m) {
            System.out.println(i + "*" + n + "=" + i*n);
        }
     }
}
