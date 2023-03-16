//Swap using XOR

import java.util.*;

public class Main{
    public static void main(String[] args){          
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        a = a^b;
        b  = a^b;
        a = a^b;
        System.out.println("The two values after swapping are\n"+a+"\n"+b);
        sc.close();
    }
}
