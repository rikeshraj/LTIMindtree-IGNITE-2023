//String Operations-Length,Uppercase,Concat & Compare

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println("The length of the first string is " + str1.length());
        System.out.println("The length of the second string is " + str2.length());
        System.out.println("The uppercase of the first string is " + str1.toUpperCase());
        System.out.println("The uppercase of the second string is " + str2.toUpperCase());
        System.out.println("The concatenated string is " + str1+str2);
        int compareStrings = str1.compareTo(str2);
        if(compareStrings == 0)
            System.out.println("Both the input strings are the same");
        else if(compareStrings>0)
            System.out.println(str2 + " appears before " + str1);
        else
            System.out.println(str1 + " appears before " + str2);
        
     }
}
