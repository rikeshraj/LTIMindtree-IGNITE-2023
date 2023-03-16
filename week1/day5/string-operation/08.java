//Removing multiple spaces

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String inp = sc.nextLine();
        System.out.println("The processed string is " + inp.replaceAll("\\s+", " "));
        sc.close();
     }
}
