//Divisible by 2 or 3

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if((num%2==0) || (num%3==0))
            System.out.println("yes");
        else
            System.out.println("no");
        sc.close();
     }
}
