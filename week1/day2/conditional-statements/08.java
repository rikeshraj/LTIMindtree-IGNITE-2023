//Triangle type

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        if(a1+a2+a3 >180)
            System.out.println("Not a Triangle");
        else {
            if(a1==a2&& a2==a3)
                System.out.println("Triangle is equilateral");
           else  if(a1==90 || a2==90 || a3==90) {
                if(a1==a2 || a2==a3 || a3==a1)
                    System.out.println("Triangle is right isosceles");
                else
                    System.out.println("Triangle is right");
            }
            else if(a1==a2 || a2==a3 || a3==a1)
                System.out.println("Triangle is isosceles");
            else
                System.out.println("Triangle is not special");
        }
        sc.close();
    }
}
