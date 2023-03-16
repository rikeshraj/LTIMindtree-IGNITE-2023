//Finding odd or even

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0)
            System.out.println(num + " is an even number");
        else
            System.out.println(num + " is an odd number");
        sc.close();
     }
}
