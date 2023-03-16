//Checking Divisibility By 7 and 3

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if((num%7==0) && (num%3==0))
            System.out.println(num + " is divisible by both 7 and 3");
        else
            System.out.println(num + " is not divisible by both 7 and 3");
        sc.close();
     }
}
