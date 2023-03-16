//Odd or Even

import java.util.*;

public class Main{
    public static void main(String[] args){          
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int a = sc.nextInt();
        int b = a&1;
        if(b==1) {
            System.out.println(a+" is odd.");
        }
        else {
            System.out.println(a+" is even.");
        }
        sc.close();
    }
}
